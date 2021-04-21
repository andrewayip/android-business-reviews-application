package com.example.android_team_project.controllers;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android_team_project.utilities.CommentAdapter;
import com.example.android_team_project.R;
import com.example.android_team_project.models.Comment;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ResultPageActivity extends Activity {

    // DATA MEMBERS
    private TextView title;
    private TextView description;
    private ImageView imageView;
    private String review;
    private String imgURL;
    private String price;
    private ArrayList<Comment> commentArrayList = new ArrayList<Comment>();
    private CommentAdapter commentAdapter;
    private ListView commentsListView;
    private String location;
    private String name;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        // REFERENCES TO UI
        title = (TextView) findViewById(R.id.resultsTitleTxtV);
        description = (TextView) findViewById(R.id.resultsDescriptionTextV);
        description.setMovementMethod(new ScrollingMovementMethod()); // added for scrolling
        imageView = (ImageView) findViewById(R.id.resultsImageView);
        commentsListView = (ListView) findViewById(R.id.resultsCommentsListView);

        // RETRIEVING DATA FROM INTENT (NAME, DESCRIPTION, IMAGE URL, RATING, PRICE, LOCATION - COORDINATES)
        Intent intent = getIntent();
        String nameData;
        nameData = intent.getStringExtra("name");
        String descriptionData;
        descriptionData = intent.getStringExtra("description");

        review = intent.getStringExtra("review");
        imgURL = intent.getStringExtra("imageURL");
        price = intent.getStringExtra("price");
        location = intent.getStringExtra("location");
        name = intent.getStringExtra("name");

        // COMMENTS ADAPTER
        Comment c = new Comment(review, price);
        commentArrayList.add(c);
        commentAdapter = new CommentAdapter(this, commentArrayList);
        commentsListView.setAdapter(commentAdapter);

        // RETRIEVING THE IMAGE VIA NETWORK
        getImage();

        // SETTING DATA ON CREATE
        title.setText(nameData);
        description.setText(descriptionData);

    }

    public void getImage (){
        new Thread() { // retrieving the image on another thread
            public void run() {
                try {
                    //Step 1: Create and send a HTTP request to a URL.
                    Message msg = Message.obtain();
                    InputStream inputStream = null;
                    URL url = new URL(imgURL);
                    URLConnection urlConn = url.openConnection();
                    HttpURLConnection httpConnection = (HttpURLConnection)  urlConn;
                    httpConnection.setRequestMethod("GET");
                    httpConnection.connect();
                    inputStream = httpConnection.getInputStream();

                    //Step 2: Once the server replies, receive the response and parse it.
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("bitmap", bitmap);
                    msg.setData(bundle);
                    inputStream.close();

                    //Step 3: Using the main thread, update the UI
                    mHandler.sendMessage(msg);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }

    private Handler mHandler = new Handler() {
        public void handleMessage (Message msg){
            imageView.setImageBitmap((Bitmap) (msg.getData().getParcelable("bitmap")));
        }
    };

    public void mapOption(View view){
        //Uri gmmIntentUri = Uri.parse("geo:"+location+"10");
        Uri gmmIntentUri = Uri.parse("geo:"+location+"?q="+name);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
