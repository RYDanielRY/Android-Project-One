package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(listArray: ArrayList<Students>, context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>()
{
    var listArrayR = listArray;
    var contextR = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        var textFrstName = view.findViewById<TextView>(R.id.firstName);
        var textLastName = view.findViewById<TextView>(R.id.lastName);
        var textKind = view.findViewById<TextView>(R.id.kindOfSp);
        var numberCourse = view.findViewById<TextView>(R.id.numberCourse)

        fun bind(students: Students, context: Context){
            textFrstName.text = students.firstName;
            textLastName.text = students.lastName;
            textKind.text = students.kindOfSports;
            numberCourse.text = students.numberGroup;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR);
        return ViewHolder(inflater.inflate(R.layout.item_element, parent, false));
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayR.get(position);
        holder.bind(listItem, contextR);
    }

    override fun getItemCount(): Int {
        return listArrayR.size;
    }
}