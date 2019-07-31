package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log


class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)

        var num1 = editText1.text.toString().toDoubleOrNull()
        var num2 = editText2.text.toString().toDoubleOrNull()

        intent.putExtra("VALUE1", num1)
        intent.putExtra("VALUE2", num2)



        if (v.id == R.id.button1) {

            intent.putExtra("VALUE3", "+")
            startActivity(intent)

        } else if (v.id == R.id.button2) {

            intent.putExtra("VALUE3", "-")
            startActivity(intent)

        } else if (v.id == R.id.button3) {
            intent.putExtra("VALUE3", "*")
            startActivity(intent)

        } else if (v.id == R.id.button4) {
            intent.putExtra("VALUE3", "/")
            startActivity(intent)
        }

    }

}
        
        
