package github.com.crazyalarmclock.stopwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import static github.com.crazyalarmclock.stopwatch.R.id.Start;

public class MainActivity extends Activity  {

    Chronometer time;
    Button start, stop, reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                   start= (Button)findViewById(Start);
                   stop = (Button)findViewById(R.id.Stop);
                   reset = (Button)findViewById(R.id.Reset);
                    time = (Chronometer)findViewById(R.id.time);


       start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.stop();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.setBase(SystemClock.elapsedRealtime());
            }
        });

    }
}