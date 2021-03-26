package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {
 Button signin;
 TextView Createacct;
 TextView facebook;
 TextView google;
 EditText etEmail,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button signin=findViewById(R.id.btnsignIn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    Button signin=findViewById(R.id.btnsignIn);
                    signin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            {
                                Toast.makeText(SignIn_Activity.this, "SignIn Successful ", Toast.LENGTH_LONG).show();}
                        }
                    });
                }
               }
        });



        TextView getCreateacct=findViewById(R.id.tvCreateAcct);
        getCreateacct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignIn_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });

        TextView facebook=findViewById(R.id.tvFacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/home.php");
            }
        });

        TextView google=findViewById(R.id.tvGoogle);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
            }
        });
    }
    private void gotoUrl(String s){
     Uri uri= Uri.parse(s);
     startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }





    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();


    }
}

