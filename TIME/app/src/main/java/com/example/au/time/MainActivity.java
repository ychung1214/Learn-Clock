package com.example.au.time;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hour = (Button)findViewById(R.id.hour);
        hour.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent1 = new Intent(v.getContext(), Video.class);
                        startActivity(myIntent1);
                    }
                }
        );
        Button clock = (Button)findViewById(R.id.clock);
        clock.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent2 = new Intent(v.getContext(), Video2.class);
                        startActivity(myIntent2);
                    }
                }
        );
        Button day = (Button)findViewById(R.id.day);
        day.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent3 = new Intent(v.getContext(), Video3.class);
                        startActivity(myIntent3);
                    }
                }
        );
    }
}

