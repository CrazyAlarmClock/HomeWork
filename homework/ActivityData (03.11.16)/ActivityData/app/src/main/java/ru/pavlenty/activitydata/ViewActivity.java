package ru.pavlenty.activitydata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        recView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String firstname = intent.getStringExtra("fname");
        String lastname = intent.getStringExtra("lname");

        recView.setText("Your name is: " + firstname + " " + lastname);
    }


    public  void  Exit (View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public  void  Close (View v){   // :D
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        this.finish();
    }
}
