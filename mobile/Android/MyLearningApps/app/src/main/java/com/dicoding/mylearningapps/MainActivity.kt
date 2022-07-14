package com.dicoding.mylearningapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvProLangs: RecyclerView
    private var list: ArrayList<ProLang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Learning Apps"

        rvProLangs = findViewById(R.id.rv_prolang)
        rvProLangs.setHasFixedSize(true)

        list.addAll(ProLangData.listProlang)
        showRecyclerList()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_menu -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }



    private fun showRecyclerList(){
        rvProLangs.layoutManager = LinearLayoutManager(this)
        val listProLangAdapter = ListProLangAdapter(list)
        rvProLangs.adapter = listProLangAdapter

        listProLangAdapter.setOnItemClickCallback(object : ListProLangAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ProLang) {
//                showSelectedHero(data)
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, data)
                startActivity(intent)
            }
        })
    }

    private fun showSelectedHero(prolang: ProLang) {
        Toast.makeText(this, "Kamu memilih " + prolang.name, Toast.LENGTH_SHORT).show()
    }
}