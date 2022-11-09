package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText jetnumero1,jetnumero2;
    TextView jtvsuma, jtvresta, jtvmultiplicacion, jtvdivision;
    Button jbtoperaciones, jbtlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra de titulo por defecto
        //ASociar los objetos java con los objetos xml

        getSupportActionBar().hide();
        jetnumero1=findViewById(R.id.etnumero1);
        jetnumero2=findViewById(R.id.etnumero2);
        jtvsuma=findViewById(R.id.tvsuma);
        jtvresta=findViewById(R.id.tvresta);
        jtvmultiplicacion=findViewById(R.id.tvmultiplicacion);
        jtvdivision=findViewById(R.id.tdivision);
        jbtoperaciones=findViewById(R.id.btoperaciones);
        jbtlimpiar=findViewById(R.id.btlimpiar);
    }

    public void Calcular_operaciones(View view){
        String numero1,numero2;
        numero1=jetnumero1.getText().toString();
        numero2=jetnumero2.getText().toString();
        if (numero1.isEmpty() || numero2.isEmpty()){
            Toast.makeText(this, "mor son los dos numeros bb",Toast.LENGTH_LONG).show();
            jetnumero1.requestFocus();
        }
        else{
            float num1,num2,suma,resta,multiplicacion,division;
            num1=Float.parseFloat(numero1);
            num2=Float.parseFloat(numero2);
            suma=num1 + num2;
            resta=num1 - num2;
            multiplicacion=num1 * num2;
            jtvsuma.setText(String.valueOf(suma));
            jtvresta.setText(String.valueOf(resta));
            jtvmultiplicacion.setText(String.valueOf(multiplicacion));
            if (num2 == 0)
                Toast.makeText(this, "Division no valida nene", Toast.LENGTH_SHORT).show();
            else{
                division=num1 / num2;
                jtvdivision.setText(String.valueOf(division));
            }
        }

    }

    public void Limpiar_datos(View view){
        jetnumero1.setText("");
        jetnumero2.setText("");
        jtvdivision.setText("");
        jtvmultiplicacion.setText("");
        jtvresta.setText("");
        jtvsuma.setText("");
        jetnumero1.requestFocus();
    }
}
