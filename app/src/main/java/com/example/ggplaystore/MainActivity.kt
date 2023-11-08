package com.example.ggplaystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val arrayList: ArrayList<GroupApp> = arrayListOf()

        repeat(10) {
            val arrayAppList: ArrayList<App> = arrayListOf()
            repeat(10) {
                arrayAppList.add(
                    App(
                        logoPath = "https://news.khangz.com/wp-content/uploads/2023/05/DOI-TEN-FACEBOOK-1.jpg",
                        title = "Facebook",
                        rate = 5.0
                    )
                )
            }
            arrayList.add(GroupApp(title = "Popular apps", appList = arrayAppList))
        }

        findViewById<RecyclerView>(R.id.rvlMain).apply {
            adapter = GroupAppAdapter(arrayList)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }
}