package github.com.crazyalarmclock.it;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Pavel on 20.06.2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    //private final Context Context;
    private static final String DB_NAME = "Sudents.db";
    public static final String TABLE_NAME = "students";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String MARKS = "mark";
    public static final String CLAS = "clas";



    private static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( "CREATE TABLE " + TABLE_NAME
                + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME   + "VARCHAR,"
                + MARKS  + "VARCHAR,"
                + CLAS  + "VARCHAR);");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean addPerson(String name, String mark,String clas){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(NAME,name);
        contentValues.put(MARKS,mark);
        contentValues.put(CLAS,clas);

        db.insert(TABLE_NAME, null, contentValues);
        db.close();
        return true;
    }
    public Cursor getPerson(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM Persons WHERE id="+id+";";
        Cursor c = db.rawQuery(sql, null);
        return c;
    }
}
