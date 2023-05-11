package com.example.meowpr7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View view){
        Intent i;
        i = new Intent(this, LinearLayouts.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnReg = (Button) findViewById(R.id.btnReg);
        btnReg.setOnClickListener(this);

    }
}