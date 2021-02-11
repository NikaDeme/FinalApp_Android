package com.example.final_app

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class VajaGamonatqvamebi (val mContext: Context, val VajaGamonatqvamebi: List<String>): BaseAdapter() {
    override fun getCount(): Int {
        return VajaGamonatqvamebi.size
    }

    override fun getItem(position: Int): Any {
        return "Demo Value"
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(mContext)
        textView.text = VajaGamonatqvamebi[position]

        return textView
    }
}