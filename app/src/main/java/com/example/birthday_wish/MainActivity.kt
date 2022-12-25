package com.example.birthday_wish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val ident=name.editableText.toString()
            Toast.makeText(this, "button pressed", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "name is $ident", Toast.LENGTH_SHORT).show()

            val connect=Intent(this,GreetingsForBirthday::class.java)
            connect.putExtra("ident",ident)
            startActivity(connect)
        }
    }

}