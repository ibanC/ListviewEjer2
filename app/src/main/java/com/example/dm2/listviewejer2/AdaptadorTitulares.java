package com.example.dm2.listviewejer2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdaptadorTitulares extends ArrayAdapter<Titular> {

  private Titular[] datos;
    private int[] imagenes;
  public AdaptadorTitulares(Context context, Titular[] datos/*,int[] imagenes*/) {
        super(context, R.layout.listitem_titular, datos);
      this.datos=datos;
      this.imagenes=imagenes;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_titular, null);

        TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(datos[position].getTitulo());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

       /*ImageView imgImg = (ImageView) item.findViewById(R.id.list_row_image);
        imgImg.setImageResource(imagenes[position]);*/
        return(item);
    }
}
