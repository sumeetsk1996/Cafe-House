package com.example.cafehouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafehouse.R
import android.view.WindowManager
import android.widget.Toast
import android.content.Intent
import android.widget.Button
import com.example.cafehouse.SignIn_Activity
import com.example.cafehouse.SignUp_Activity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Transparent ActionBar
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        Objects.requireNonNull(supportActionBar)!!.hide()


        val login = findViewById<Button>(R.id.btnlogin)
        login.setOnClickListener {
            Toast.makeText(this@MainActivity, "Please Enter Your Details", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity, SignIn_Activity::class.java)
            startActivity(intent)
        }
        val register = findViewById<Button>(R.id.btnregister)
        register.setOnClickListener {
            Toast.makeText(this@MainActivity, "Please Enter Your Details", Toast.LENGTH_LONG).show()
            val intent1 = Intent(this@MainActivity, SignUp_Activity::class.java)
            startActivity(intent1)
        }
    }
}