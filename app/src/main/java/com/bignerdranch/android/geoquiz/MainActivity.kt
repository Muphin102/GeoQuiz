package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton : Button
    private lateinit var falseButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener{
            var toast = Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,Gravity.CENTER_HORIZONTAL,10)
            toast.show()
        }

        falseButton.setOnClickListener{
            var toast = Toast.makeText(this,R.string.incorrect_toast,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,Gravity.CENTER_HORIZONTAL,10)
            toast.show()
        }
    }

}
