package github.com.crazyalarmclock.tap_tapcolors;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static github.com.crazyalarmclock.tap_tapcolors.R.id.btn;

/**
 * Created by Pavel on 02.04.2017.
 */

public class Game extends MainActivity implements View.OnClickListener {

    final   Random random = new Random();

    Context context;

    int highScore = 0;

    Button btn;
    public int score = 0,r,rr;
    private Handler handler = new Handler();
    private int time = 2000;
    TextView text;
    TextView sc0re;
    private  String[] names = {

            "Red         ",
            "Pink        ",
            "Purple      ",
            "Deep Purple ",
            "Indigo      ",
            "Blue        ",
            "Light Blue  ",
            "Cyan        ",
            "Teal        ",
            "Green       ",
            "Light Green ",
            "Lime        ",
            "Yellow      ",
            "Amber       ",
            "Orange      ",
            "Deep Orange ",
            "Brown       ",
            "Grey        ",
            "Blue Grey   ",
            "Black       "
    };
    private int[]  colors = {
            Color.parseColor("#F44336"),                //Red
            Color.parseColor("#E91E63"),                //Pink
            Color.parseColor("#9C27B0"),                //Purple
            Color.parseColor("#673AB7"),                //Deep Purple
            Color.parseColor("#3F51B5"),                //Indigo
            Color.parseColor("#2196F3"),                //Blue
            Color.parseColor("#03A9F4"),                //Light Blue
            Color.parseColor("#00BCD4"),                //Cyan
            Color.parseColor("#009688"),                //Teal
            Color.parseColor("#4CAF50"),                //Green
            Color.parseColor("#8BC34A"),                //Light Green
            Color.parseColor("#CDDC39"),                //Lime
            Color.parseColor("#FFEB3B"),                //Yellow
            Color.parseColor("#FFC107"),                //Amber
            Color.parseColor("#FF9800"),                //Orange
            Color.parseColor("#FF5722"),                //Deep Orange
            Color.parseColor("#795548"),                //Brown
            Color.parseColor("#9E9E9E"),                //Grey
            Color.parseColor("#607D8B"),                //Blue Grey
            Color.parseColor("#000000")                 //Black
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

        text = (TextView) findViewById(R.id.textView);
        sc0re = (TextView) findViewById(R.id.sc0re);

        handler.postDelayed(timeUpdaterRunnable, 0);

        sc0re.setText("Score:"+ 0);
        text.setText("tap to play!");



    }



    private Runnable timeUpdaterRunnable = new Runnable() {
        @Override
        public void run() {

            r=random.nextInt(3) ;
            btn.setBackgroundColor(colors[r]);

            handler.postDelayed(this, time);


        }
    };






    @Override
    public void onClick(View view) {
        if (r==rr){
            sc0re.setText("Score:"+ score++);
            rr=random.nextInt(3) ;
            time -=50;

        } else  {
            FragmentManager manager = getSupportFragmentManager();
            MyDialogFragment myDialogFragment = new MyDialogFragment();
            myDialogFragment.show(manager, "dialog");


        }


        text.setText(names[rr]);
    }

}