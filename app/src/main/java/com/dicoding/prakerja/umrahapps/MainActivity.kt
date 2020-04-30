package com.dicoding.prakerja.umrahapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.prakerja.umrahapps.adapter.ListPaketAdapter
import com.dicoding.prakerja.umrahapps.model.DataPaket
import com.dicoding.prakerja.umrahapps.model.PaketUmrah

class MainActivity : AppCompatActivity() {
    private lateinit var rvPaket: RecyclerView
    private var list: ArrayList<PaketUmrah> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Paket Umrah Wisata"
        }


        rvPaket = findViewById(R.id.rv_paketumrah)
        rvPaket.setHasFixedSize(true)

        list.addAll(DataPaket.listPaket)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPaket.layoutManager = LinearLayoutManager(this)
        val listPaketAdapter = ListPaketAdapter(list)
        rvPaket.adapter = listPaketAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenu(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_setting -> {
                val acAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(acAbout)
            }
        }
    }
}
