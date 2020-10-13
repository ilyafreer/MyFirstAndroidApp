package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        buttonOne.setOnClickListener {
            LogText.setText("Button One have been pressed");
        };
        buttonTwo.setOnClickListener {
            LogText.setText("Button Two have been pressed");
        };
        buttonThree.setOnClickListener {
            LogText.setText("Button Three have been pressed");
        };
        buttonFour.setOnClickListener {
            LogText.setText("Button Four have been pressed");
        };
    }
}