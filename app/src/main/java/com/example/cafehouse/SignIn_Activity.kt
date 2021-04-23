package com.example.cafehouse

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignIn_Activity : AppCompatActivity() {
    var signIn: Button? = null
    var getCreateAcct: TextView? = null
    var facebook: TextView? = null
    var google: TextView? = null
    var etEmail: EditText? = null
    var etPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        supportActionBar!!.hide()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        signIn = findViewById(R.id.btnsignIn)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        getCreateAcct = findViewById(R.id.tvCreateAcct)
        facebook = findViewById(R.id.tvFacebook)
        google = findViewById(R.id.tvGoogle)
       signIn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                run {
                    var email = etEmail.getText().toString()
                    var password = etPassword.getText().toString()
                    println(email)
                    if (email == "" || password == "") {
                        Toast.makeText(this@SignIn_Activity, "please fill all the fields ", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@SignIn_Activity, "SignIn got Successful ", Toast.LENGTH_LONG).show()
                    }
                }
            }
        })
        getCreateAcct.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@SignIn_Activity, SignUp_Activity::class.java)
            startActivity(intent)
        })
        facebook.setOnClickListener(View.OnClickListener { gotoUrl("https://www.facebook.com/home.php") })
        google.setOnClickListener(View.OnClickListener { gotoUrl("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox") })
    }

    private fun gotoUrl(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}