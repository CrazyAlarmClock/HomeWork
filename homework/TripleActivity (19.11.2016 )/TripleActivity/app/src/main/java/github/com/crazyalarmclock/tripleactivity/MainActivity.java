package github.com.crazyalarmclock.tripleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements OnTouchListener {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = new TextView(this);
        tv.setOnTouchListener(this);
        setContentView(tv);
        }

public boolean onTouch(View v, MotionEvent event) {
        Intent intent = new Intent(MainActivity.this,AboutActivity.class);
        startActivity(intent);

        Intent intent_two = new Intent(MainActivity.this,AboutActivity2.class);
        startActivity(intent_two);

        return true;

        }



        }