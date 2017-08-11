package pe.com.ricindigus.dbaandroid;

/**
 * Created by RICARDO on 11/08/2017.
 */

public class SQLConstantes {
    //BD
    public static final String DB = "bdusuarios.db";

    //TABLAS
    public static final String tableUsuarios = "usuarios";

    //COLUMNAS
    public static final String COLUMNA_ID = "id";
    public static final String COLUMNA_NOMBRE = "nombre";
    public static final String COLUMNA_EDAD = "edad";
    public static final String COLUMNA_CORREO = "correo";

    //QUERYS
    public static final String SQL_CREATE_TABLE_USUARIOS =
            "CREATE TABLE " + tableUsuarios + "(" +
                    COLUMNA_ID + " TEXT PRIMARY KEY," +
                    COLUMNA_NOMBRE + " TEXT," +
                    COLUMNA_EDAD + " INT," +
                    COLUMNA_CORREO+ " TEXT" + ");";

    public static final String SQL_DELETE =
            "DROP TABLE" + tableUsuarios;

    public static final String SEARCH_BY_ID = "id=?";

    public static final String[] ALL_COLUMNAS = {COLUMNA_ID,COLUMNA_NOMBRE,
            COLUMNA_EDAD,COLUMNA_CORREO};


}
