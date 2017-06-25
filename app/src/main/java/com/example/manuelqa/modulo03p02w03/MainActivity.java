package com.example.manuelqa.modulo03p02w03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas=(RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.inicializaListaMascotas();
        listaMascotas.setLayoutManager(llm);
        inicializaAdaptador();


    }

    public void irFavoritoMastocas(View v){
        Intent i=new Intent(this, MacotaFav.class);
        startActivity(i);
    }

    public void inicializaAdaptador(){
        MascotaAdaptador adaptadorMas = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptadorMas);

    }

    public void inicializaListaMascotas(){
        mascotas=new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.conejo,"Banner",3));
        mascotas.add(new Mascota(R.drawable.gato01,"Lala",5));
        mascotas.add(new Mascota(R.drawable.gato02,"Mishu",2));
        mascotas.add(new Mascota(R.drawable.hamsters,"Pummy",5));
        mascotas.add(new Mascota(R.drawable.pajaro,"Spinenr",5));
        mascotas.add(new Mascota(R.drawable.perro01,"Yugo",5));
        mascotas.add(new Mascota(R.drawable.perro02,"Jacky",1));
    }
}
