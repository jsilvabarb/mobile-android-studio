package com.example.pizzariapalestra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesPizzas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_pizzas);
        Intent intent = getIntent();
        ImageView pizza = findViewById(R.id.imgSabor);

        DadosParcelable dp = (DadosParcelable) intent.getParcelableExtra(MainActivity.EXTRA_MESSAGE_PARCELABLE);
        String sabor = dp.getSabor();
        String ingredientes = dp.getIngredientes();

        int imgFolder = R.drawable.pizza;
        pizza.setImageResource(imgFolder);

        TextView txtSabor = findViewById(R.id.txtSabor);
        txtSabor.setText(sabor);

        TextView txtIngredientes = findViewById(R.id.txtIngredientes);
        txtIngredientes.setText(ingredientes);

    }
}