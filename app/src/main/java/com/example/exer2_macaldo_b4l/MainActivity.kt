package com.example.exer2_macaldo_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var disneyImage : ImageView
    lateinit var disneyText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        disneyImage = findViewById(R.id.disneyImage)
        disneyText = findViewById(R.id.disneyText)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener { randomDisney() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDisney() }
    }

    private fun randomDisney() {
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
        disneyText.text = getString(stringResource)

    }

    private fun resetDisney(){
        disneyImage.setImageResource(R.drawable.disney)
        disneyText.text = getString(R.string.disney)
    }

}
