package com.example.icook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter = 5;
    public String n,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =(EditText)findViewById(R.id.etname);
        Password =(EditText)findViewById(R.id.etpass);

        Info =(TextView) findViewById(R.id.tvinfo);
        Login =(Button) findViewById(R.id.btnlogin);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=Name.getText().toString();


                p=Password.getText().toString();

                Log.d("Name",n);
                Log.d("passwd", p);
                validate(n,p);
            }
        });
    }
    private void validate(String userName, String userPassword)
    {
        if((userName.equalsIgnoreCase("Admin")) && (userPassword.equalsIgnoreCase("Admin"))){
            Log.d("If case","correct");
            Intent intent = new Intent(this,All_RECIPIE.class);
            startActivity(intent);
        }else{
            Log.d("If case","incorrect");
            counter--;
            Info.setText("No of attempts remaining: " + String.valueOf(counter));
            if(counter == 0){
                Login.setEnabled(false);
            }
        }

    }
}
