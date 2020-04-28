package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class starters extends AppCompatActivity {
    private Button manchow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        manchow=(Button)findViewById(R.id.manchow);
        manchow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmanchow();
            }
        });
    }
    public void openmanchow(){
        Intent intent= new Intent(this,Manchowsoup.class);
        startActivity(intent);
    }
}
