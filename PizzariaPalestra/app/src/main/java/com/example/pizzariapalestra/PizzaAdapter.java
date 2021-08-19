package com.example.pizzariapalestra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PizzaAdapter  extends ArrayAdapter<Pizza> {
    private Context mContext;
    private List<Pizza> listaPizzas = new ArrayList<>();

    public PizzaAdapter(Context context, ArrayList<Pizza> listaAux) {
        super(context, 0 , listaAux);
        mContext = context;
        listaPizzas = listaAux;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View layoutLinha = convertView;

        if (layoutLinha == null) {
            layoutLinha = LayoutInflater.from(mContext).inflate(R.layout.layout_linha, parent, false);
        }

        Pizza pizzaAtual = listaPizzas.get(position);

        // Vincula atributos aos componentes do Layot_Linha
        ImageView imagemPoster = layoutLinha.findViewById(R.id.imgSabor);
        imagemPoster.setImageResource(pizzaAtual.getImgFolderDrawable());
        TextView txtSabor = layoutLinha.findViewById(R.id.txtSabor);
        txtSabor.setText(pizzaAtual.getPizza());
        TextView txtPreco = layoutLinha.findViewById(R.id.txtPreco);
        txtPreco.setText(pizzaAtual.getPreco());

        //return super.getView(position, convertView, parent);
        return layoutLinha;
    }
}
