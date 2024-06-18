package com.example.volumecalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //The View
        val gridView:GridView=findViewById(R.id.gridView)

        //The data source
        var shape1:Shape=Shape(R.drawable.sphere,"Sphere")
        var shape2:Shape=Shape(R.drawable.cube,"Cube")
        var shape3:Shape=Shape(R.drawable.cuboid,"Cuboid")
        var shape4:Shape=Shape(R.drawable.prism,"Prism")
        var shape5:Shape=Shape(R.drawable.cone,"Cone")
        var shape6:Shape=Shape(R.drawable.cylinder,"Cylinder")


        val gridItems= listOf<Shape>(
            shape1,shape2,shape3,shape4,shape6,shape5)

        //The Adapter
        val customAdapter=myCustomAdapter(this,gridItems)
        gridView.adapter=customAdapter

        //Handling the click events on the gridView Items
        gridView.setOnItemClickListener {_, _, position, _ ->
            val clickedItem=customAdapter.getItem(position)

            if(clickedItem?.shapeName.equals("Sphere"))
            {
                val i= Intent(this,SphereActivity::class.java)
                startActivity(i)
            }
            if(clickedItem?.shapeName.equals("Cube"))
            {
                val i= Intent(this,CubeActivity::class.java)
                startActivity(i)
            }
            if(clickedItem?.shapeName.equals("Cuboid"))
            {
                val i= Intent(this,CuboidActivity::class.java)
                startActivity(i)
            }
            if(clickedItem?.shapeName.equals("Prism"))
            {
                val i= Intent(this,PrismActivity::class.java)
                startActivity(i)
            }
            if(clickedItem?.shapeName.equals("Cone"))
            {
                val i= Intent(this,ConeActivity::class.java)
                startActivity(i)
            }
            if(clickedItem?.shapeName.equals("Cylinder"))
            {
                val i= Intent(this,CylinderActivity::class.java)
                startActivity(i)
            }

        }

    }
}