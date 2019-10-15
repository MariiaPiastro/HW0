package com.demo.mycat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var hobbies: ArrayList<Hobby> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        setInitialData()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val myAdapter = MyAdapter(this, hobbies)
        recyclerView.adapter = myAdapter

        val buttonInfoOfBreed: Button = findViewById(R.id.buttonInfoOfBreed)
        buttonInfoOfBreed.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setInitialData() {
        hobbies.add(Hobby("Поспать", R.drawable.sleeping_cat))
        hobbies.add(Hobby("Поесть", R.drawable.eating_cat))
        hobbies.add(Hobby("Поиграть", R.drawable.playing_cat))
        hobbies.add(Hobby("Снова поспать", R.drawable.sleeping_cat2))
        hobbies.add(Hobby("Залезть в коробку", R.drawable.cat_in_the_box))
        hobbies.add(Hobby("Опять поиграть", R.drawable.playing_cat2))
    }

}
