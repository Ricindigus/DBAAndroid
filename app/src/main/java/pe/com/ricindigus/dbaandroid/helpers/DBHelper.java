package pe.com.ricindigus.dbaandroid.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pe.com.ricindigus.dbaandroid.SQLConstantes;

/**
 * Created by RICARDO on 11/08/2017.
 */

public class DBHelper extends SQLiteOpenHelper{
    public static final int DB_VERSION = 1;
    public DBHelper(Context context) {
        super(context, SQLConstantes.DB,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLE_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE);
        onCreate(sqLiteDatabase);
    }
}
