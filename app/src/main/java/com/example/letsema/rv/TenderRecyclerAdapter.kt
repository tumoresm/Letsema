package com.example.letsema.rv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.letsema.R
import com.example.letsema.TenderDetails

class TenderRecyclerAdapter(private val context: Context, private val tenders: List<TenderDetails> ) :
    RecyclerView.Adapter<TenderRecyclerAdapter.ViewHolder>(){

    private val layoutInflater = LayoutInflater.from(context)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tender_title = itemView?.findViewById<TextView?>(R.id.tender_Title)
        val tender_dates = itemView?.findViewById<TextView?>(R.id.tender_dates)
        val tender_budget = itemView?.findViewById<TextView?>(R.id.tender_budget)



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_tender_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tender = tenders[position]

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}