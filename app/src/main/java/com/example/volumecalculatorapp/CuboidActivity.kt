package com.example.volumecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CuboidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuboid)

        val textView=findViewById<TextView>(R.id.textView2)
        val result=findViewById<TextView>(R.id.textView3)
        val button=findViewById<Button>(R.id.btn1)
        val edtTextHeight=findViewById<EditText>(R.id.editText_cuboidh)
        val edtTextLength=findViewById<EditText>(R.id.editText_cuboidl)
        val edtTextBreadth=findViewById<EditText>(R.id.editText_cuboidb)

        button.setOnClickListener {
            var height=edtTextHeight.text.toString()
            var length=edtTextLength.text.toString()
            var breadth=edtTextBreadth.text.toString()
            var h=Integer.parseInt(height)
            var l=Integer.parseInt(length)
            var b=Integer.parseInt(breadth)
            var volume=h*l*b
            result.text="V = $volume m^3"
        }

    }
}