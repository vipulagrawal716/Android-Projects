package com.example.myapplicationid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etId;
    Button btnSubmit;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etId=findViewById(R.id.etID);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idNumber=etId.getText().toString().trim();
                String dob=idNumber.substring(0,6);
                int gender=Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String sGender;
                if(gender<5)
                {
                    sGender="Female";
                }
                else
                    sGender="Male";
                int nationality=Integer.parseInt(Character.toString(idNumber.charAt(10)));
                String sNationality;
                if(nationality==0)
                    sNationality="SA Citizen";
                else
                    sNationality="Permanent Resident";
                tvResult.setText("Date of Birth: "+dob+"\n"+"Nationality: "+sNationality+"Gender: "+sGender+"\n");
                tvResult.setVisibility(View.VISIBLE);



            }
        });
    }
}
