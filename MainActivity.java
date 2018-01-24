package com.example.jnrmint.changingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    private Button recordButton = null;

    private Button playButton = null;

    private Chronometer timer = null;
    private Long time = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        timer = findViewById(R.id.chronometer);

        recordButton = findViewById(R.id.recbtn);
        recordButton.setOnClickListener(new View.OnClickListener() {
            Boolean mStartRecording = true;
            @Override
            public void onClick(View view) {
                if(mStartRecording){
                    recordButton.setText("Stop Recording");
                    timer.start();
                } else {
                    recordButton.setText("Start Recording");
                    timer.stop();
                }
                mStartRecording = !mStartRecording;
            }
        });

        playButton = findViewById(R.id.playbtn);
        playButton.setOnClickListener(new View.OnClickListener() {
            Boolean mStartPlaying = true;
            @Override
            public void onClick(View view) {
                if(mStartPlaying){
                    playButton.setText("Stop Playing");
                    timer.stop();
                } else {
                    playButton.setText("Start Playing");
                    timer.start();
                }
                mStartPlaying = !mStartPlaying;
            }
        });


    }
}
