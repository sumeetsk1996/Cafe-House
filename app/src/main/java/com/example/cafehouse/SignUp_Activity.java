package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {
    Button signup;
    TextView facebook;
    TextView google;
    TextView alreadyacct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView alreadyacct = findViewById(R.id.tvAlreadyAcct);

        alreadyacct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp_Activity.this, SignIn_Activity.class);
                startActivity(intent);
            }
        });

        Button signup=findViewById(R.id.btnsignUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {{

                Toast.makeText(SignUp_Activity.this, "SignUp Successful ", Toast.LENGTH_LONG).show();}

            }
        });
        TextView facebook = findViewById(R.id.tvFacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/home.php");
            }
        });

        TextView google = findViewById(R.id.tvGoogle);
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