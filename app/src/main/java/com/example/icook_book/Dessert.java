package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dessert extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        b=(Button)findViewById(R.id.halva);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjalebi();
            }
        });
    }
    public void openjalebi(){
        Intent i=new Intent(this,jalebi.class);
        startActivity(i);
    }
}
