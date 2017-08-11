package pe.com.ricindigus.dbaandroid.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.ricindigus.dbaandroid.Data;
import pe.com.ricindigus.dbaandroid.R;
import pe.com.ricindigus.dbaandroid.pojos.Usuario;

public class BuscarActivity extends AppCompatActivity {
    EditText edtId;
    Button btnBuscar;
    Data data;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        edtId = (EditText) findViewById(R.id.edtBuscar);
        btnBuscar = (Button) findViewById(R.id.btnBuscar);
        usuario = new Usuario();

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idSearch = edtId.getText().toString();
                data = new Data(getApplicationContext());
                data.open();
                usuario = data.getUsuario(idSearch);
                Toast.makeText(BuscarActivity.this,usuario.getNombre().toString()+"", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
