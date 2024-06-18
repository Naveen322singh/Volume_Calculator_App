package com.example.volumecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrismActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prism)

        val textView=findViewById<TextView>(R.id.textView2)
        val result=findViewById<TextView>(R.id.textView3)
        val button=findViewById<Button>(R.id.btn1)
        val edtTextHeight=findViewById<EditText>(R.id.editText_prismh)
        val edtTextBase=findViewById<EditText>(R.id.editText_prismb)

        button.setOnClickListener {
            var height=edtTextHeight.text.toString()
            var base=edtTextBase.text.toString()
            var h=Integer.parseInt(height)
            var b=Integer.parseInt(base)
            var volume=b*h
            result.text="V = $volume m^3"
        }

    }
}