package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daliya_Upma extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daliya__upma);
        b=(Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendaliya();
            }
        });
    }
    public void opendaliya(){
        Intent intent=new Intent(this,Daliya_upma2.class);
        startActivity(intent);
    }
}
