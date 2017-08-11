package pe.com.ricindigus.dbaandroid.pojos;

import android.content.ContentValues;

import pe.com.ricindigus.dbaandroid.SQLConstantes;

/**
 * Created by RICARDO on 11/08/2017.
 */

public class Usuario {
    private String id;
    private String nombre;
    private int edad;
    private String correo;

    public Usuario(){}
    public Usuario(String id, String nombre, int edad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(4);
        contentValues.put(SQLConstantes.COLUMNA_ID,id);
        contentValues.put(SQLConstantes.COLUMNA_NOMBRE,nombre);
        contentValues.put(SQLConstantes.COLUMNA_EDAD,edad);
        contentValues.put(SQLConstantes.COLUMNA_CORREO,correo);
        return contentValues;
    }
}
