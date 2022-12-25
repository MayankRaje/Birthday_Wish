package com.example.birthday_wish

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings_for_birthday.*

class GreetingsForBirthday : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings_for_birthday)

        val new_ident=intent.getStringExtra("ident")

        greet.text="Happy Birthday $new_ident"
    }
}