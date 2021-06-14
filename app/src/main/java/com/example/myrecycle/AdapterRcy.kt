package com.example.myrecycle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRcy(val context: Context, val name:Array<String>, val des:Array<String>, val image:Array<Int>)
    :RecyclerView.Adapter<AdapterRcy.ViewHolder>() {

    private  val inflater: LayoutInflater
            =context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val textView:TextView=view.findViewById(R.id.text1)
        val textView2:TextView=view.findViewById(R.id.text2)
        val image1:ImageView=view.findViewById(R.id.image2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRcy.ViewHolder {
        val rowView=inflater.inflate(R.layout.recycle, parent, false)
        return ViewHolder(rowView)

    }

    override fun getItemCount(): Int {
        return name.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = name[position]
        holder.textView2.text=des.get(position)
        holder.image1.setImageResource(image[position])

    }
}