package com.example.toolbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class FavoriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val detailToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(detailToolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}