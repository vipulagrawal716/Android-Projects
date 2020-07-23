package com.example.challengeintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateContact extends AppCompatActivity implements View.OnClickListener {
    EditText etName,etNumber,etWeb,etMap;
    ImageView ivHappy,ivSad,ivOk;

    @Override
    public void onClick(View view) {
        if(etName.getText().toString().isEmpty()|| etNumber.getText().toString().isEmpty()||
                etWeb.getText().toString().isEmpty()||etMap.getText().toString().isEmpty())
        {
            Toast.makeText(this, "please enter all fields", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Intent intent=new Intent();
            intent.putExtra("name",etName.getText().toString().trim());
            intent.putExtra("number",etNumber.getText().toString().trim());
            intent.putExtra("web",etWeb.getText().toString().trim());
            intent.putExtra("map", etMap.getText().toString().trim());
            if(view.getId()==R.id.ivHappy)
            {
                intent.putExtra("mood","happy");
            }
            else if(view.getId()==R.id.ivSad)
            {
                intent.putExtra("mood","sad");
            }
            else
            {
                intent.putExtra("mood","ok");
            }
            setResult(RESULT_OK,intent);
            CreateContact.this.finish();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);
        etName=findViewById(R.id.etName);
        etWeb=findViewById(R.id.etWeb);
        etMap=findViewById(R.id.etMap);
        etNumber=findViewById(R.id.etNumber);
        ivHappy=findViewById(R.id.ivHappy);
        ivOk=findViewById(R.id.ivHappy);
        ivSad=findViewById(R.id.ivSad);
        ivHappy.setOnClickListener(this);
        ivSad.setOnClickListener(this);
        ivOk.setOnClickListener(this);


    }
}
