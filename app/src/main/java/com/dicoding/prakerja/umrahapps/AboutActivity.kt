package com.dicoding.prakerja.umrahapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
        val avImg = "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/202004302132393bf3b8def0cd218433352089dd3f75e0.png"
        val myImage : ImageView = findViewById(R.id.img_about)

        Glide.with(this)
            .load(avImg)
            .apply(RequestOptions())
            .into(myImage)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
