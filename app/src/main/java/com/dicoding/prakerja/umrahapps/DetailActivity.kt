package com.dicoding.prakerja.umrahapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail Paket"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }


        val tvDetNama: TextView = findViewById(R.id.tv_det_namapaket)
        val imgDetPaket: ImageView = findViewById(R.id.img_det_paket)
        val tvDetHarga: TextView = findViewById(R.id.tv_det_hargapaket)
        val tvcFasiltas: TextView = findViewById(R.id.tvc_fasilitas)
        val tvcSyaratKetentuan: TextView = findViewById(R.id.tvc_syarat_ketentuan)

        val tNama  = intent.getStringExtra(EXTRA_NAME)
        val tImgPaket = intent.getStringExtra(EXTRA_PHOTO)
        val tFacility = intent.getStringExtra(EXTRA_FACILITY)
        val tTerms = intent.getStringExtra(EXTRA_TERMS)
        val tPrice = intent.getStringExtra(EXTRA_PRICE)

        tvDetNama.text = tNama
        Glide.with(this)
            .load(tImgPaket)
            .apply(RequestOptions())
            .into(imgDetPaket)
        tvDetHarga.text = tPrice
        tvcFasiltas.text = tFacility
        tvcSyaratKetentuan.text = tTerms
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_FACILITY = "extra_facility"
        const val EXTRA_TERMS = "extra_terms"
        const val EXTRA_PRICE = "extra_price"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
