package com.nuevatel.apps.activityexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by calyr on 10/18/16.
 */
public class LibroAdapter  extends RecyclerView.Adapter<LibroAdapter.MyViewHolder> {

    private Context mContext;
    private List<Libro> lista;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView isbn, titulo;
        public MyViewHolder(View view) {
            super(view);
            isbn = (TextView) view.findViewById(R.id.isbn);
            titulo = (TextView) view.findViewById(R.id.titulo);

        }
    }

    public LibroAdapter(Context mContext, List<Libro> lista) {
        this.mContext = mContext;
        this.lista = lista;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.libro_cardview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Libro libro = lista.get(position);
        holder.isbn.setText(libro.getIsbn());
        holder.titulo.setText(libro.getTitulo());


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}