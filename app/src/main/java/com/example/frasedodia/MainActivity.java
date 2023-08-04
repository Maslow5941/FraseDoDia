package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void gerarFrase(View view){
        String[] frases = {
          "Never made it as a wise man I couldn't cut it as a poor man stealing Tired of living like a blind man I'm sick of sight without a sense of feeling  And this is how you remind me",
          "It's not like you to say sorry  I was waiting on a different story This time I'm mistaken For handing you a heart worth breaking And I've been wrong, I've been down Been to the bottom of every bottle These five words in my head Scream: Are we having fun yet?",
          "It's not like you didn't know that I said I love you and I swear I still do And it must have been so bad 'Cause living with me must've damn near killed you",
          "This is how you remind me  Of what I really am This is how you remind me  Of what I really am"
        };
        int numero = new Random().nextInt(4);
        TextView texto = findViewById(R.id.tvFrase);
        texto.setText(frases[numero]);
    }
}