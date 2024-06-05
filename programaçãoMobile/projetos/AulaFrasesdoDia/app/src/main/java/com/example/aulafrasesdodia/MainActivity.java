package com.example.aulafrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Frase1",
            "Frase2",
            "Frase3",
    };

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                }


    public void gerarfrase(View view){

    }

    public void gerartodas(View view){
        System.out.println(frases);
    }
}