package org.dev4u.hv.guia3_ejemplo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rishardcarranza on 09-04-17.
 */

public class AdaptadorMensaje extends ArrayAdapter<Mensaje> {

    public AdaptadorMensaje(Context context, List<Mensaje> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener los datos de la Lista
        Mensaje m = getItem(position);

        // TODO Inicializar el Layout correspondiente a la vista
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_mensaje, parent, false);
        }

        // Obtener los datos de la vista Inflada
        TextView lblMensaje = (TextView) convertView.findViewById(R.id.lblMensaje);
        TextView lblFecha = (TextView) convertView.findViewById(R.id.lblFecha);
        // Establecer los valores obtenidos
        lblMensaje.setText(m.getContenido());
        lblFecha.setText(m.getFecha());


        return convertView;
    }
}
