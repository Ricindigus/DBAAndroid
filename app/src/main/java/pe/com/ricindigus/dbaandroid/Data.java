package pe.com.ricindigus.dbaandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pe.com.ricindigus.dbaandroid.helpers.DBHelper;
import pe.com.ricindigus.dbaandroid.pojos.Usuario;

/**
 * Created by RICARDO on 11/08/2017.
 */

public class Data {
    Context context;
    SQLiteDatabase sqLiteDatabase;
    SQLiteOpenHelper sqLiteOpenHelper;

    public Data(Context context){
        this.context = context;
        sqLiteOpenHelper = new DBHelper(context);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close(){
        sqLiteOpenHelper.close();
    }

    public void insertarUsuario(Usuario usuario){
        ContentValues contentValues = usuario.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableUsuarios,null,contentValues);
    }

    public Usuario getUsuario(String id){
        Usuario usuario = new Usuario();
        String[] whereArgs = new String[]{id};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableUsuarios,SQLConstantes.ALL_COLUMNAS,
                SQLConstantes.SEARCH_BY_ID, whereArgs,null,null,null);
//        while(cursor.moveToNext()){
//            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_ID)));
//            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_NOMBRE)));
//            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_EDAD)));
//            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_CORREO)));
//        }
        if(cursor.getCount() == 1) {
            cursor.moveToFirst();
            usuario.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_ID)));
            usuario.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_NOMBRE)));
            usuario.setEdad(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMNA_EDAD)));
            usuario.setCorreo(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_CORREO)));
        }

        return usuario;
    }
}
