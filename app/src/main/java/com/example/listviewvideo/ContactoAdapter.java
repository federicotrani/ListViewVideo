package com.example.listviewvideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ContactoAdapter extends BaseAdapter {

    List<Contacto> contactos;

    public ContactoAdapter(List<Contacto> lista){
        this.contactos = lista;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Contacto getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {

        View view;

        Context context = parent.getContext();

        // optimizacion de la vista
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_lista_contactos, null);
        }else{
            view = convertView;
        }

        TextView textViewNombre = view.findViewById(R.id.textViewNombreCompleto);
        TextView textViewEmail = view.findViewById(R.id.textViewEmail);
        TextView textViewTelefono = view.findViewById(R.id.textViewTelefono);

        ImageView imageViewFoto = view.findViewById(R.id.imageViewFoto);
        ImageButton imageButtonPhone = view.findViewById(R.id.imageButtonPhone);
        ImageButton imageButtonEmail = view.findViewById(R.id.imageButtonEmail);


        // contacto en la posicion actual
        final Contacto item = getItem(position);

        // cargamos datos del contacto
        textViewNombre.setText(item.toString());
        textViewEmail.setText(item.getEmail());
        textViewTelefono.setText(item.getTelefono());

        imageViewFoto.setImageResource(item.getFoto());

        imageButtonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "Llamando a " + item.getTelefono(), Toast.LENGTH_SHORT).show();
            }
        });

        imageButtonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "Enviando Correo a " + item.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
