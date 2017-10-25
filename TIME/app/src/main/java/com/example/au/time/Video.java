package com.example.au.time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ClipData;
import android.content.res.TypedArray;
import android.view.DragEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.content.Context;
import android.util.AttributeSet;



/**
 * Created by AU on 2017/10/23.
 */

public class Video extends AppCompatActivity {

    private Button btnonce;
    private VideoView vv;
    private MediaController mediacontroller;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        btnonce = (Button) findViewById(R.id.btnonce);
        vv = (VideoView) findViewById(R.id.vv);

        mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(vv);
        String uriPath = "android.resource://com.example.au.learntime/"+R.raw.learnhhhourtime;
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
