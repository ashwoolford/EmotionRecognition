package com.example.ashwoolford.emotionrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {
    TextView mTextView;
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        mTextView = (TextView) findViewById(R.id.ResultTextView);
        mImageView = (ImageView) findViewById(R.id.ResultImageView);

        Intent mGetIntent = getIntent();
        double anger=mGetIntent.getDoubleExtra("anger",-1);
        double disgust=mGetIntent.getDoubleExtra("disgust",-2);
        double fear=mGetIntent.getDoubleExtra("fear",-3);
        double happy=mGetIntent.getDoubleExtra("happy",-4);
        double neutral=mGetIntent.getDoubleExtra("neutral",-5);
        double sad=mGetIntent.getDoubleExtra("sad",-6);
        double surprised=mGetIntent.getDoubleExtra("surprised",-7);
        if(anger>=0.5&&anger<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.angry));
            mTextView.setText(""+disgust);
        }
        if(disgust>=0.5&&disgust<=1){
           mImageView.setImageDrawable(getResources().getDrawable(R.drawable.angry));
            mTextView.setText("You Look Disgust");}
        if (fear>=0.5&&fear<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.fear));
            mTextView.setText("You Look Fear");}
        if (happy>=0.5&&happy<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.happy));
            mTextView.setText("You Look Happy");}
        if(neutral>=0.5&&neutral<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.neutral));
            mTextView.setText("You Look Neutral");}
        if(sad>=0.5&&sad<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.sada));
            mTextView.setText("You Look Sad");}
        if(surprised>=0.5&&surprised<=1){
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.surprised));
            mTextView.setText("You Look Surprised");}
    }
}
