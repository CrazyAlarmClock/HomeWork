package ru.pavlenty.surfacegame2;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static ru.pavlenty.surfacegame2.DatabaseHelper.TABLE_NAME;
import static ru.pavlenty.surfacegame2.GameView.highScore;

public class HightScore extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4;



    private DatabaseHelper db;
    int[] highSc0re=new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hight_score);

        //initializing the textViews
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);



        ContentValues values = new ContentValues();
        db = new DatabaseHelper(this);
        Cursor c=db.getScore();
        c.moveToFirst();
        for(int t=0;t <highSc0re.length;t++){

                highSc0re[t] =highScore[t];
                values.put(DatabaseHelper .SCORE, highScore[t]);
                db.insert(TABLE_NAME, null, values);

            }



        //setting the values to the textViews
        textView.setText("1."+highSc0re[0]);
        textView2.setText("2."+highSc0re[1]);
        textView3.setText("3."+highSc0re[2]);
        textView4.setText("4."+highSc0re[3]);


    }

}
