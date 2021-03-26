package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

     Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Transparent ActionBar

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        Objects.requireNonNull(getSupportActionBar()).hide();



        Button login=findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Please Enter Your Details", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SignIn_Activity.class);
                startActivity(intent);
            }
        });

        Button register=findViewById(R.id.btnregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Please Enter Your Details", Toast.LENGTH_LONG).show();
                Intent intent1=new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(intent1);
            }
        });
    }
}