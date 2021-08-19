package com.example.pizzariapalestra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static String EXTRA_MESSAGE_PARCELABLE = "com.example.passagemparametros.MESSAGE_PARCELABLE";
    private ListView lstPizzas;

    private PizzaAdapter meuAdaptador;
    ArrayList<Pizza> listaPizzas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculando
        lstPizzas = findViewById(R.id.lstPizzas);

        // Define Listener Click Curto de lstProdutos
        lstPizzas.setOnItemClickListener(this);

        //carregando os dados para ListaPizzas
        //Implementado a lista ao adaptador
        listaPizzas = carregaDados();
        meuAdaptador = new PizzaAdapter(this, listaPizzas);

        //implementando na listView
        lstPizzas.setAdapter(meuAdaptador);
    }
    //Adicionando Pizzas a lista
    public ArrayList<Pizza> carregaDados() {
        ArrayList<Pizza> listaAux = new ArrayList<>();
        listaAux.add(new Pizza(R.drawable.pizza,
                "Calabresa", "R$25,90"));
        listaAux.add(new Pizza(R.drawable.pizza, "Mussarela", "R$25,90" ));
        listaAux.add(new Pizza(R.drawable.pizza, "Bacon","R$21,90"));
        listaAux.add(new Pizza(R.drawable.pizza, "Brócolis","R$29,90"));
        listaAux.add(new Pizza(R.drawable.pizza, "Frango Catupiry","R$29,90"));
        listaAux.add(new Pizza(R.drawable.pizza, "Portuguesa","R$25,90"));
        listaAux.add(new Pizza(R.drawable.pizza, "À Moda da Casa","R$32,90"));

        return listaAux;
    }

    //Fazendo o Tratamento do click no item
    @Override
    public void onItemClick(AdapterView<?> parent, View objeto, int posicao, long id) {

        if (posicao == 0) {

            String sabor = "Calabresa";
            String ingredientes = " Calabresa, mussarela," +
                    " cebola, Orégano";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        } else if (posicao == 1) {

            String sabor = "Mussarela";
            String ingredientes = " Mussarela, Tomate," +
                    " Orégano";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        } else if (posicao == 2) {

            String sabor = "Bacon";
            String ingredientes = " Bacon, Mussarela," +
                    " Batata Palha";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        }
        else if (posicao == 3) {

            String sabor = "Brócolis";
            String ingredientes = " Brócolis, Mussarela," +
                    " Bacon";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        }
        else if (posicao == 4) {

            String sabor = "Frango Catupiry";
            String ingredientes = " Frango, Catupiry, Tomate, Cebola" +
                    " Bacon";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        } else if (posicao == 5) {

            String sabor = "Portuguesa";
            String ingredientes = " Calabresa, ovos, cebola, azeitona" +
                    " Sua Preferencia";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        } else if (posicao == 6) {

            String sabor = "À Moda da Casa";
            String ingredientes = "Queijo, bacon, calabresa, " +
                    "Frango, Cheddar e tomate";
            DadosParcelable dp = new DadosParcelable(sabor, ingredientes);
            Intent intent = new Intent(this, DetalhesPizzas.class);
            intent.putExtra(EXTRA_MESSAGE_PARCELABLE, dp);

            startActivity(intent);
        }
    }
}