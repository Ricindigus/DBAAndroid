package pe.com.ricindigus.dbaandroid.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.ricindigus.dbaandroid.Data;
import pe.com.ricindigus.dbaandroid.R;
import pe.com.ricindigus.dbaandroid.pojos.Usuario;

public class InsertarActivity extends AppCompatActivity {

    EditText edtId, edtNombre, edtEdad, edtCorreo;
    Button btnInsertar;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);
        edtId = (EditText) findViewById(R.id.edtId);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtEdad = (EditText) findViewById(R.id.edtEdad);
        edtCorreo = (EditText) findViewById(R.id.edtCorreo);
        btnInsertar = (Button) findViewById(R.id.btnInsertar);

        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario(edtId.getText().toString(),
                        edtNombre.getText().toString(),
                        Integer.valueOf(edtEdad.getText().toString()),
                        edtCorreo.getText().toString());

                data = new Data(getApplicationContext());
                data.open();
                data.insertarUsuario(usuario);
                data.close();
                Toast.makeText(InsertarActivity.this, "Insertado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
