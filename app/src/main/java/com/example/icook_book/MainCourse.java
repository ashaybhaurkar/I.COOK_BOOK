package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCourse extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        b=(Button)findViewById(R.id.subji);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensubji();
            }
        });
    }
    public void opensubji(){
        Intent i=new Intent(this,subji_maincource.class);
        startActivity(i);
    }
}
