package com.example.alejandro.figurasgeometricas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alejandro on 07/05/2016.
 */
public class FiguraAdapter extends ArrayAdapter<Figura> {
    private Context context;
    private Figura[] figuras=null;


    //Constructor por defecto
    public FiguraAdapter (Context context,int resource,Figura[] figuras) {
        super(context,resource,figuras);
        this.context = context;
        this.figuras = figuras;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            //La vista no está creada, así que la crea. Cuando vuelva a comprobar
            //si existe, reutilizará el objeto convertView para ahorrarse la creación de un nuevo objeto.
            LayoutInflater mInflater =((Activity)context).getLayoutInflater();
            convertView = mInflater.inflate(R.layout.listview_fila, null);
            holder = new ViewHolder();
            //Creamos un objeto de la clase ViewHolder y hacemos que cada atributo referencie
            //a un elemento del laout. Esta referencia se mantiene y cuando reutilicemos la vista
            //convertView ya no tendrá que llamar al método findViewById()
            holder.nombreTV = (TextView) convertView.findViewById(R.id.tvNombreFigura);

            holder.FigImageVw = (ImageView) convertView.findViewById(R.id.ivFigura);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Figura figura = figuras[position];
        holder.nombreTV.setText(figura.getNombre());
        holder.FigImageVw.setImageResource(figura.getIcono());
        //Esta es la forma más sencilla de cargar una imagen,
        //pero no sirve para cargarlas desde un servidor o para
        //procesar grandes cantidades. Ver nota al final.

        return convertView;


    }

    private static class ViewHolder {
        private TextView nombreTV;
        private ImageView FigImageVw;
    }

}
