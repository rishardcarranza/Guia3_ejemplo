package org.dev4u.hv.guia3_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MensajeActivity extends AppCompatActivity {

    private TextView txtMensaje;
    private Button btnEnviar;
    private ListView lstMensajes;
    private AdaptadorMensaje adaptadorMensaje;
    private ArrayList<Mensaje> arrMensajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        // Inicializar los objetos
        txtMensaje = (TextView) findViewById(R.id.txtEntrada);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        lstMensajes = (ListView) findViewById(R.id.lstMensaje);

        //Iniciar el ArrayList y Adaptador
        arrMensajes = new ArrayList<Mensaje>();
        adaptadorMensaje = new AdaptadorMensaje(MensajeActivity.this, arrMensajes);

        //Configurando el Adaptador al ListView
        lstMensajes.setAdapter(adaptadorMensaje);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validar que el mensaje no esta vacio
                if (!txtMensaje.getText().toString().isEmpty()) {
                    // Tomar lo datos de entrada y llenar el objeto
                    String mensaje = txtMensaje.getText().toString();
                    String fecha = DateFormat.getDateInstance().format(new Date());

                    Mensaje m = new Mensaje(fecha, mensaje);

                    // Agregar el mensaje a la ArrayList
                    arrMensajes.add(m);
                    // Notificar los cambios al Adaptador
                    adaptadorMensaje.notifyDataSetChanged();

                } else {
                    Toast.makeText(MensajeActivity.this, "Por favor ingresa un mensaje !", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
