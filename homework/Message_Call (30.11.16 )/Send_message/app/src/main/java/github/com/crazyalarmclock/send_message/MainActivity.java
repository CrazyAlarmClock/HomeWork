package github.com.crazyalarmclock.send_message;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Html;
import android.view.View;
import android.widget.EditText;

import static github.com.crazyalarmclock.send_message.R.id.text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void  call (View view){

        Intent intent = new Intent();
        intent.setAction(intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+"89267105770"));
        startActivity(intent);

        }

     public  void message(View view){
         Intent Intent = new Intent();
         Intent.setAction(Intent.ACTION_SEND);
         Intent.putExtra(Intent.EXTRA_TEXT, "Hello");
         Intent.setType("text/plain");
         startActivity(Intent);
     }

}







