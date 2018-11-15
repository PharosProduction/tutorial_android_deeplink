package com.pharosproduction

import android.content.Intent.ACTION_VIEW
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_deeplink.*

class DeeplinkActivity : AppCompatActivity() {

    // Variables

    private var action = ""
    private var deeplinkContent: String? = null
    // Live

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)

        setupUI()
    }

    // Private

    private fun setupUI() {
        if (intent.action != null && intent.action == ACTION_VIEW) {
            action = intent.action!!
            deeplinkContent = intent?.extras?.getString("key").orEmpty()
        }

        when (action) {
            "" -> {
                // Display screen content according to default flow
                contentTv.text = getString(R.string.hello_world)
            }
            ACTION_VIEW -> {
                // Display screen content according to data from deepLink
                contentTv.text = deeplinkContent
            }
        }
    }

}