package com.example.listviewvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("App de Contactos");

        contactos = new ArrayList<>();

        cargarLista();

        ListView listViewContactos = findViewById(R.id.listViewContactos);

        listViewContactos.setAdapter(new ContactoAdapter(contactos));
    }

    private void cargarLista() {

        contactos.add(new Contacto("Federico", "Trani", "Belgrano 665", "022-887733", "federico@gmail.com",R.drawable.masculino));
        contactos.add(new Contacto("Luis","Perez","San Luis 776","022-334488","luis@gmail.com", R.drawable.masculino));
        contactos.add(new Contacto("Andres","Hernandez","Salta 541","022-331155","andres@gmail.com", R.drawable.masculino));
        contactos.add(new Contacto("Romina","Soto","Buenos Aires 771","022-554400","romina@gmail.com", R.drawable.femenino));
        contactos.add(new Contacto("Laura","Campos","Mendoza 554","022-557711","laura@gmail.com", R.drawable.femenino));
        contactos.add(new Contacto("Roberto","Suarez","Rio Negro 398","022-228800","roberto@gmail.com", R.drawable.masculino));
        contactos.add(new Contacto("Maria","Conte","Chubut 881","022-886633","maria@gmail.com", R.drawable.femenino));
        contactos.add(new Contacto("Sofia","Camaño","Misiones 337","022-227755","sofia@gmail.com", R.drawable.femenino));
        contactos.add(new Contacto("Carlos","Martinez","Tierra del Fuego 553","022-557711","carlos@gmail.com", R.drawable.masculino));
        contactos.add(new Contacto("Graciela","Cortina","La Pampa 398","022-668811","graciela@gmail.com", R.drawable.femenino));


    }
}
