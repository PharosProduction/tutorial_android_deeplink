package com.pharosproduction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Live

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    // Private

    private fun setupUI() {
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, DeeplinkActivity::class.java))
        }
    }

}