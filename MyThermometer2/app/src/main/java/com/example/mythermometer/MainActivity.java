package com.example.mythermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etValue;
    Button btnCalculate;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValue=findViewById(R.id.etValue);
        btnCalculate=findViewById(R.id.btnCalculate);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etValue.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter all fields",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    int chirps=Integer.parseInt(etValue.getText().toString().trim());
                    double temp=(chirps/3.0)+4;
                    String result="the approx. temp outside is "+temp+"degrees celcius";
                    tvResult.setText(result);
                    tvResult.setVisibility(view.VISIBLE);
                }
            }
        });

    }
}
