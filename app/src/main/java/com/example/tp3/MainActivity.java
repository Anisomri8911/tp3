package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Convertir ;
    private EditText editTextNumber ;
    private RadioButton EuroDinar ;
    private RadioButton DinarEuro ;
    private double Result = 0 ;
    private TextView Resultat ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        Convertir = findViewById(R.id.Convertir) ;
        EuroDinar = findViewById(R.id.EuroDinar);
        DinarEuro = findViewById(R.id.DinarEuro);
        Resultat = findViewById(R.id.Resultat);

        Convertir.setOnClickListener(view -> conversion());
    }

    private void conversion() {

        if (EuroDinar.isChecked()){
            float number = Float.valueOf(editTextNumber.getText().toString());
            Result = number * 0.58020 ;
            Resultat.setText(String.valueOf(Result));
        }else if (DinarEuro.isChecked()){
            float number = Float.valueOf(editTextNumber.getText().toString());
            Result = number *1.9919 ;
            Resultat.setText(String.valueOf(Result));
        }
    }




}