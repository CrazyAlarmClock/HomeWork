package github.com.crazyalarmclock.it;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

/**
 * Created by Pavel on 20.06.2017.
 */

public class Students extends AppCompatActivity implements View.OnClickListener {

   // private DatabaseHelper db;

    ListView userList;
    TextView header;
    DatabaseHelper databaseHelper;
    SQLiteDatabase db;
    Cursor userCursor;
    SimpleCursorAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        header = (TextView)findViewById(R.id.header);
        userList = (ListView)findViewById(R.id.list);
    }


    @Override
    public void onResume() {
        super.onResume();
        db = databaseHelper.getReadableDatabase();
        userCursor =  db.rawQuery("select * from "+ DatabaseHelper.TABLE_NAME, null);
        String[] headers = new String[] {DatabaseHelper.NAME, DatabaseHelper.MARKS};
        userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
        header.setText("Найдено элементов: " + String.valueOf(userCursor.getCount()));
        userList.setAdapter(userAdapter);
    }

    @Override
    public void onClick(View v) {

    }
    @Override
    public void onDestroy(){
        super.onDestroy();

        db.close();
        userCursor.close();
    }
}

