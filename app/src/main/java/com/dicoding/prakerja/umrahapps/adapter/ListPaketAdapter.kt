package com.dicoding.prakerja.umrahapps.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.prakerja.umrahapps.DetailActivity
import com.dicoding.prakerja.umrahapps.R
import com.dicoding.prakerja.umrahapps.model.PaketUmrah

class ListPaketAdapter(private val listpaket: ArrayList<PaketUmrah>) : RecyclerView.Adapter<ListPaketAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_paket, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listpaket.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val (packagename, price, imgpackage, facility, terms) = listpaket[position]

        Glide.with(holder.itemView.context)
            .load(imgpackage)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvNamaPaket.text = packagename
        holder.tvHarga.text = price

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val screenDetail = Intent(mContext, DetailActivity::class.java)
            screenDetail.putExtra(DetailActivity.EXTRA_PRICE, price)
            screenDetail.putExtra(DetailActivity.EXTRA_NAME, packagename)
            screenDetail.putExtra(DetailActivity.EXTRA_PHOTO, imgpackage)
            screenDetail.putExtra(DetailActivity.EXTRA_FACILITY, facility)
            screenDetail.putExtra(DetailActivity.EXTRA_TERMS, terms)
            mContext.startActivity(screenDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNamaPaket: TextView = itemView.findViewById(R.id.tv_namapaket)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_harga)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_paketumrah)
    }

}