package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;


public class All_RECIPIE extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__recipie);
        button = (Button) findViewById(R.id.breakfast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbreakfast();
            }
        });
        button1=(Button)findViewById(R.id.starter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstarter();
            }
        });
        button2=(Button)findViewById(R.id.maincourse);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmaincourse();
            }
        });
        button3=(Button)findViewById(R.id.dessert);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendessert();
            }
        });
    }
    public void openbreakfast(){
        Intent intent = new Intent(this,breakfast.class);
        startActivity(intent);
    }
    public void openstarter(){
        Intent i = new Intent(this,starters.class);
        startActivity(i);
    }
    public void openmaincourse(){
        Intent j = new Intent(this,MainCourse.class);
        startActivity(j);
    }
    public void opendessert(){
        Intent k = new Intent(this,Dessert.class);
        startActivity(k);
    }
}
