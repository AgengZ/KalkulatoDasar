package com.example.kalkulatodasar;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText teksSatu, teksDua;
    Button plus, minus, kali, bagi, clear;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksSatu    = findViewById(R.id.bilSatu);
        teksDua     = findViewById(R.id.bilDua);
        plus        = findViewById(R.id.btnPlus);
        minus       = findViewById(R.id.btnMinus);
        kali        = findViewById(R.id.btnKali);
        bagi        = findViewById(R.id.btnBagi);
        clear       = findViewById(R.id.btnClear);
        output      = findViewById(R.id.hasil);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((teksSatu.getText().length() > 0) && (teksDua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(teksSatu.getText().toString());
                    double angka2 = Double.parseDouble(teksSatu.getText().toString());
                    double hasil = angka1 + angka2;
                    output.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Bilangan Satu dan Dua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((teksSatu.getText().length() > 0) && (teksDua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(teksSatu.getText().toString());
                    double angka2 = Double.parseDouble(teksSatu.getText().toString());
                    double hasil = angka1 - angka2;
                    output.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Bilangan Satu dan Dua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((teksSatu.getText().length() > 0) && (teksDua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(teksSatu.getText().toString());
                    double angka2 = Double.parseDouble(teksSatu.getText().toString());
                    double hasil = angka1 * angka2;
                    output.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Bilangan Satu dan Dua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((teksSatu.getText().length() > 0) && (teksDua.getText().length() > 0)){
                    double angka1 = Double.parseDouble(teksSatu.getText().toString());
                    double angka2 = Double.parseDouble(teksSatu.getText().toString());
                    double hasil = angka1 / angka2;
                    output.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Bilangan Satu dan Dua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksSatu.setText("");
                teksDua.setText("");
                output.setText("0");
                teksSatu.requestFocus();
            }
        });
    }

}