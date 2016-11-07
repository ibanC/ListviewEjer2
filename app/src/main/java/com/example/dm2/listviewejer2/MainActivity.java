package com.example.dm2.listviewejer2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lstwebs;
    private Titular[] datos;
    private int[] imagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstwebs=(ListView)findViewById(R.id.lstWebs);

        datos= new Titular[]{
                new Titular("Google", "http://www.google.com"),
                new Titular("Marca", "http://www.marca.com"),
                new Titular("As", "http://www.as.com"),
                new Titular("Android", "https://www.android.com"),
                new Titular("ATP", "www.atpworldtour.com"),
                new Titular("WTA", "http://www.es.wtatennis.com"),
                new Titular("WhatsApp", "https://www.whatsapp.com"),
        };
        imagenes = new int[]{
                R.drawable.google,
                R.drawable.marca,
                R.drawable.as,
                R.drawable.ic_prueba,
                R.drawable.atp,
                R.drawable.wta,
                R.drawable.whatsapp,
        };

AdaptadorTitulares adaptador=new AdaptadorTitulares(this,datos,imagenes);/*imagenes*/
        lstwebs.setAdapter(adaptador);

        lstwebs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String url=((Titular)adapterView.getItemAtPosition(i)).getSubtitulo();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
