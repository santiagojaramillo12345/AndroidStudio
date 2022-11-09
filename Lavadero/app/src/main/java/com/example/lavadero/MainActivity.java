




public class MainActivity extends AppCompatActivity {

    EditText jettaxis,jetbuses,jetmotos,jetparticulares;
    TextView jtvtaxis,jtvbuses,jtvmotos,jtvparticulares,jtvtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra de titulo por defecto
        getSupportActionBar().hide();
        //asociar los objetos Java con los objetos Xml
        jettaxis=findViewById(R.id.ettaxis);
        jetbuses=findViewById(R.id.etbuses);
        jetmotos=findViewById(R.id.etmotos);
        jetparticulares=findViewById(R.id.etparticulares);
        jtvbuses=findViewById(R.id.tvbuses);
        jtvparticulares=findViewById(R.id.tvparticulares);
        jtvmotos=findViewById(R.id.tvmotos);
        jtvtaxis=findViewById(R.id.tvtaxis);
        jtvtotal=findViewById(R.id.tvtotal);
    }

    public void Calcular_dinero(View view){
        String taxis,motos,particulares,buses;
        taxis=jettaxis.getText().toString();
        buses=jetbuses.getText().toString();
        motos=jetmotos.getText().toString();
        particulares=jetparticulares.getText().toString();
        if (taxis.isEmpty() || buses.isEmpty() || motos.isEmpty() || particulares.isEmpty()){
            Toast.makeText(this, "Todos los datos son requeridos", Toast.LENGTH_SHORT).show();
            jettaxis.requestFocus();
        }
        else{
            //Definicion de variables y conversion de tipos de datos
            int cant_taxis,cant_motos,cant_particulares,cant_buses,
                    total_taxis,total_motos,total_particulares,total_buses,total;
            cant_taxis=Integer.parseInt(taxis);
            cant_buses=Integer.parseInt(buses);
            cant_particulares=Integer.parseInt(particulares);
            cant_motos=Integer.parseInt(motos);
            //Operacion
            total_taxis=cant_taxis * 3000;
            total_buses=cant_buses * 10000;
            total_motos=cant_motos * 2000;
            total_particulares=cant_particulares * 5000;
            total=total_buses + total_motos + total_particulares + total_taxis;
            //Imprimir resultados
            jtvtaxis.setText(String.valueOf(total_taxis));
            jtvbuses.setText(String.valueOf(total_buses));
            jtvmotos.setText(String.valueOf(total_motos));
            jtvparticulares.setText(String.valueOf(total_particulares));
            jtvtotal.setText(String.valueOf(total));
        }
    }

    public void Limpiar_campos(View view){
        jettaxis.setText("");
        jetparticulares.setText("");
        jetmotos.setText("");
        jetbuses.setText("");
        jtvtotal.setText("");
        jtvtaxis.setText("");
        jtvparticulares.setText("");
        jtvmotos.setText("");
        jtvbuses.setText("");
        jettaxis.requestFocus();
    }
}
