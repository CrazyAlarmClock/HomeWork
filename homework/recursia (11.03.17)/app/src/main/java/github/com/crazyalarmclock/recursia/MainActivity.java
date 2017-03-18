package github.com.crazyalarmclock.recursia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.String.valueOf;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    EditText editText
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyDraw(this));

//        btn = (Button)findViewById(R.id.button);
//        editText= (EditText) findViewById(R.id.edittext);
//        text = (TextView) findViewById(R.id.text);
//        btn.setOnClickListener(this);
//
//    }
//
//
//    public static long factorial(long x) {
//        if (x<0) throw new IllegalArgumentException ("x должен быть >=0");
//        if (x<=1) return 1;
//        else return x*factorial(x-1);
//    }
//
//    @Override
//    public void onClick(View view) {
//        text.setText(valueOf(factorial(Integer.parseInt(editText.getText().toString()))));
//    }
        \

}


