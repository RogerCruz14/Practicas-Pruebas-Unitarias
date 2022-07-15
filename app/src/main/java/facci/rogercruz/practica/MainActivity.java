package facci.rogercruz.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtApellido;
    Button btnGardar;
    Validar validar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        btnGardar = findViewById(R.id.btnGuardar);
        validar = new Validar();

        btnGardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar.validarLargo(txtNombre.getText().toString()) ||
                        validar.validarLargo(txtApellido.getText().toString())){
                    Toast.makeText(MainActivity.this,"Escriba su nombre completo", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (validar.validarCampo(txtNombre.getText().toString())){
                    Toast.makeText(MainActivity.this,"Debe escribir mas de 8 caracteres", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (validar.validarlargo(txtApellido.getText().toString())){
                    Toast.makeText(MainActivity.this,"Debe escribir mas de 8 caracteres", Toast.LENGTH_SHORT).show();
                    return;
                }

                txtNombre.setText("");
                txtApellido.setText("");
                startActivity(new Intent(MainActivity.this,main.class));
            }
        });

    }

}