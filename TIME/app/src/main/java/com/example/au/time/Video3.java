package com.example.au.time;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


/**
 * Created by AU on 2017/10/23.
 */

public class Video3 extends AppCompatActivity {

    private Button btnonce;
    private VideoView vv;
    private MediaController mediacontroller;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video3);

        btnonce = (Button) findViewById(R.id.btnonce);
        vv = (VideoView) findViewById(R.id.vv);

        mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(vv);
        String uriPath = "android.resource://com.example.au.learntime/"+R.raw.learnsssense;
        uri = Uri.parse(uriPath);

        btnonce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv.setMediaController(mediacontroller);
                vv.setVideoURI(uri);
                vv.requestFocus();
                vv.start();
            }
        });
    }

    public class CustomerVideoView extends VideoView {

        public CustomerVideoView(Context context) {
            super(context);
        }

        public CustomerVideoView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public CustomerVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int width = getDefaultSize(0, widthMeasureSpec);
            int height = getDefaultSize(0, heightMeasureSpec);
            setMeasuredDimension(width, height);
        }
    }

    public void onClick(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
