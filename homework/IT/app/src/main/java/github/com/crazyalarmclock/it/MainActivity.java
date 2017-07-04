package github.com.crazyalarmclock.it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName;
    private EditText editTextAddres;
    private EditText editTextMark;
    private Button btnSave;
    private Button btnView;

    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAddres = (EditText) findViewById(R.id.editTextAddress);
        editTextMark = (EditText) findViewById(R.id.editTextMark);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnView = (Button) findViewById(R.id.btnView);

        db = new DatabaseHelper(this);

        btnSave.setOnClickListener(this);
        btnView.setOnClickListener(this);
    }

    private void insert(){
        String name = editTextName.getText().toString().trim();
        String clas = editTextAddres.getText().toString().trim();
        String mark = editTextMark.getText().toString().trim();
        db.addPerson(name,clas,mark);
        Toast.makeText(this,"Запись успешно добавлена",Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        if (v==btnView){
            Intent intent = new Intent(this,Students.class);
            startActivity(intent);
        }
        if(v==btnSave){
            insert();
        }
    }
}
