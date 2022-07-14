package com.dicoding.mylearningapps

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var data: ProLang

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgProlang : ImageView = findViewById(R.id.img_prolang)
        val tvProLangName: TextView = findViewById(R.id.tv_prolang_name)
        val tvProLangLevel: TextView = findViewById(R.id.tv_prolang_level)
        val tvProLangDesc: TextView = findViewById(R.id.tv_prolang_desc)

        print("data saat ini")
        print(intent.extras)
        if (intent.extras != null) {
             data = intent.getParcelableExtra(EXTRA_DATA)!!


            supportActionBar?.title = data.name
            imgProlang.setImageResource(data.image)
            tvProLangName.text = data.name
            tvProLangLevel.text = data.level
            tvProLangDesc.text = data.desc
        }





    }
}