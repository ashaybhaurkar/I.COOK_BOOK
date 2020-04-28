package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Manchowsoup extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchowsoup2);
        b=(Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmanchowsoup();
            }
        });
    }
    public void openmanchowsoup(){
        Intent i = new Intent(this,Manchowsoup2.class);
        startActivity(i);
    }
}
