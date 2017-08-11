package pe.com.ricindigus.dbaandroid.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pe.com.ricindigus.dbaandroid.R;

public class MainActivity extends AppCompatActivity {
    private Button btnInsertarElemento;
    private Button btnBuscarElemento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsertarElemento = (Button) findViewById(R.id.btnInsertarElemento);
        btnBuscarElemento = (Button) findViewById(R.id.btnBuscarElemento);

        btnInsertarElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InsertarActivity.class);
                startActivity(intent);
            }
        });
        btnBuscarElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });
    }
}
