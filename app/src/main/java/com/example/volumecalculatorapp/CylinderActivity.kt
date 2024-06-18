package com.example.volumecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)

        val textView=findViewById<TextView>(R.id.textView2)
        val result=findViewById<TextView>(R.id.textView3)
        val button=findViewById<Button>(R.id.btn1)
        val edtTextHeight=findViewById<EditText>(R.id.editText_cylinderh)
        val edtTextRadius=findViewById<EditText>(R.id.editText_cylinderr)

        button.setOnClickListener {
            var height=edtTextHeight.text.toString()
            var base=edtTextRadius.text.toString()
            var h=Integer.parseInt(height)
            var r=Integer.parseInt(base)
            var volume=3.14159*r*r*h
            result.text="V = $volume m^3"
        }

    }
}