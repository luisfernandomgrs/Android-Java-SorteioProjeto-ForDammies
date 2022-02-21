package com.luisfernandomgrs.learning.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.usage.UsageEvents;
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

    public void  mostrarResultado(View view) {
        TextView lblTitleResult = findViewById(R.id._lblTitleResult);
        int x = new Random().nextInt(11);

        lblTitleResult.setText("O número selecionado: " + x);
    }
}