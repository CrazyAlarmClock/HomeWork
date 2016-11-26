package github.com.crazyalarmclock.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText login;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (EditText)findViewById(R.id.password);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        }
//кнопка

    public void onClick(View v) {
        String pass = password.getText().toString();
        if (pass.equals("qwerty111")) {
            switch (v.getId()) {
                case R.id.button:
                    Intent intent = new Intent(this, Login.class);
                    startActivity(intent);
                    break;
            default:
                    break;
            }

        } else {
            Toast.makeText(this, "Неверный пароль! :P", Toast.LENGTH_SHORT).show();
        }

    }
    public void help(View v) {
            Toast.makeText(this, "qwerty111", Toast.LENGTH_SHORT).show();
        }
    }
