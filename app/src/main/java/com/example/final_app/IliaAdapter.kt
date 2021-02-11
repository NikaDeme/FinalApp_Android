package com.example.final_app

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class IliaGamonatqvamebi (val mContext: Context, val Gamonatqvamebi: List<String>): BaseAdapter() {
    override fun getCount(): Int {
        return Gamonatqvamebi.size
    }

    override fun getItem(position: Int): Any {
        return "Demo Value"
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(mContext)
        textView.text = Gamonatqvamebi[position]

        return textView
    }
}