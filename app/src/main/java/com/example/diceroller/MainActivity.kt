package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button) //seleksi button

        rollButton.setOnClickListener{
           // val toast1 = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_LONG)
           // toast1.show()
           // val resultTextView: TextView = findViewById(R.id.textView)
           // resultTextView.text = "6"
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6) //membuat dadu 6 sisi bernama dice
        val diceRoll = dice.roll() //mengacak dadu dice dengan memanggil fun roll(), hasilnya disimpan di diceroll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString() //menampilkan hasil acakan dice di textView
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

