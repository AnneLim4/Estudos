package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String[] frases = {
            "Frase 1",
            "Frase 2",
            "Frase 3",
    }

    public void gerarFrase(View view){


    }

    public void exibirTodas(View view){

        for ( String frase : frases){
            System.out.println(frase);
        }

    }
}