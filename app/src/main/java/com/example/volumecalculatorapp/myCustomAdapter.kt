package com.example.volumecalculatorapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myCustomAdapter (context: Context,private val gridItems:List<Shape>)
    :ArrayAdapter<Shape>(context,0,gridItems){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var itemView=convertView
        val holder:ViewHolder

        if(convertView==null){
            itemView=LayoutInflater.from(context)
                .inflate(R.layout.grid_item_layout,parent,false)

            //create and set the viewHolder
            holder=ViewHolder()
            holder.imageView=itemView.findViewById(R.id.imageView)
            holder.textView=itemView.findViewById(R.id.textView)

            //Associating the ViewHolder object with the created View
            itemView.tag=holder
        }
        else
        {
            holder= itemView?.tag as ViewHolder
        }

        //Binding data to Views
        val currentItem=gridItems[position]
        holder.imageView.setImageResource(currentItem.shapeImg)
        holder.textView.text=currentItem.shapeName

        return itemView!!
    }


        private class ViewHolder{
            lateinit var imageView: ImageView
            lateinit var textView: TextView
        }


}