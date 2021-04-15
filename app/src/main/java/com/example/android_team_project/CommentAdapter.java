package com.example.android_team_project;

import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CommentAdapter extends ArrayAdapter<Comment> {

    public CommentAdapter(Activity context, ArrayList<Comment> comments) {
        super(context, 0, comments);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Comment currentComment = getItem(position);

        View comment = convertView;
        if(comment == null){
            System.out.println("current comment: " + currentComment);
            comment = LayoutInflater.from(getContext()).inflate(R.layout.results_comments,parent, false);
        }

        TextView priceTitle = comment.findViewById(R.id.titleTxtV);
        TextView review = comment.findViewById(R.id.bodyTxtV);

        review.setMovementMethod(new ScrollingMovementMethod()); // adding for scrolling

        priceTitle.setText(currentComment.getPrice());
        review.setText(currentComment.getReview());

        return comment;
    }
}
