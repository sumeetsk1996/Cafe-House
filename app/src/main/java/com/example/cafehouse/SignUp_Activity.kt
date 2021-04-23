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

class SignUp_Activity : AppCompatActivity() {
    var signUp: Button? = null
    var facebook: TextView? = null
    var google: TextView? = null
    var alreadyAcct: TextView? = null
    var etEmail: EditText? = null
    var etPassword: EditText? = null
    var etPersonName: EditText? = null
    var etPhone: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar!!.hide()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        alreadyAcct = findViewById(R.id.tvAlreadyAcct)
        signUp = findViewById(R.id.btnsignUp)
        facebook = findViewById(R.id.tvFacebook)
        google = findViewById(R.id.tvGoogle)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etPersonName = findViewById(R.id.etPersonName)
        etPhone = findViewById(R.id.etPhone)
        alreadyAcct.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@SignUp_Activity, SignIn_Activity::class.java)
            startActivity(intent)
        })
       signUp.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                run {
                    var email = etEmail.getText().toString()
                    var password = etPassword.getText().toString()
                    var phone = etPhone.getText().toString()
                    var personName = etPersonName.getText().toString()
                    println(email)
                    if (email == "" || password == "" || phone == "" || personName == "") {
                        Toast.makeText(this@SignUp_Activity, "please fill all the fields ", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@SignUp_Activity, "SignIn got Successful ", Toast.LENGTH_LONG).show()
                    }
                }
            }
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