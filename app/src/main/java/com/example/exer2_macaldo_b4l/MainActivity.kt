package com.example.exer2_macaldo_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var disneyImage : ImageView
    lateinit var detailsText : TextView
    lateinit var headerText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        disneyImage = findViewById(R.id.disney_image)
        detailsText = findViewById(R.id.disney_details)
        headerText = findViewById(R.id.header_text)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener { startDisney() }

        val resetButton: Button = findViewById(R.id.retry_button)
        resetButton.setOnClickListener { retryDisney() }
    }

    private fun startDisney() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = (1..10).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.ariel
            2 -> R.drawable.cinderella
            3 -> R.drawable.elsa
            4 -> R.drawable.mickey
            5 -> R.drawable.mulan
            6 -> R.drawable.rapunzel
            7 -> R.drawable.stitch
            8 -> R.drawable.walle
            9 -> R.drawable.winnie
            else -> R.drawable.woody
        }

        val stringResource = when (randomInt) {
            1 -> R.string.ariel
            2 -> R.string.cinderella
            3 -> R.string.elsa
            4 -> R.string.mickey
            5 -> R.string.mulan
            6 -> R.string.rapunzel
            7 -> R.string.stitch
            8 -> R.string.walle
            9 -> R.string.winnie
            else -> R.string.woody
        }

        disneyImage.setImageResource(drawableResource)
        detailsText.text = getString(stringResource)
        headerText.text = getString(R.string.header_text2)
    }

    private fun retryDisney(){
        disneyImage.setImageResource(R.drawable.disney)
        detailsText.text = getString(R.string.disney)
        headerText.text = getString(R.string.header_text)
    }

}
