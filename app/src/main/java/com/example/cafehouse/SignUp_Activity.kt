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

    /* var signUp: Button? = null
    var facebook: TextView? = null
    var google: TextView? = null
    var alreadyAcct: TextView? = null
    var etEmail: EditText? = null
    var etPassword: EditText? = null
    var etPersonName: EditText? = null
    var etPhone: EditText? = null */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //hiding action bar
        supportActionBar!!.hide()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val alreadyAcct = findViewById<TextView>(R.id.tvAlreadyAcct)
        val signUp = findViewById<Button>(R.id.btnsignUp)
        val facebook = findViewById<TextView>(R.id.tvFacebook)
        val google = findViewById<TextView>(R.id.tvGoogle)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etPersonName = findViewById<EditText>(R.id.etPersonName)
        val etPhone = findViewById<EditText>(R.id.etPhone)

        //click command for textView
        alreadyAcct.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@SignUp_Activity, SignIn_Activity::class.java)
            startActivity(intent)
        })

        //click command for Button
       signUp.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                run {
                    val email = etEmail.getText().toString()
                    val password = etPassword.getText().toString()
                    val phone = etPhone.getText().toString()
                    val personName = etPersonName.getText().toString()
                   // println(email)
                    if (email == "" || password == "" || phone == "" || personName == "") {
                        Toast.makeText(this@SignUp_Activity, "please fill all the fields ", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@SignUp_Activity, "SignIn got Successful ", Toast.LENGTH_LONG).show()
                    }
                }
            }
        })

//      //added only link of facebook and google
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