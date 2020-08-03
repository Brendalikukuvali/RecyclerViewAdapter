package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_name_item.*
import layout.AgeRecyclerViewAdapter
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(
            listOf(
                "Anne",
                "Pauline",
                "Shantel",
                "Suzan",
                "Emanuel",
                "Veronica",
                "Alicia",
                "Esther",
                "Delvo",
                "Patricia"
            )
        )
        rvNames.adapter = namesAdapter

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        var ageAdapter = AgeRecyclerViewAdapter(listOf<Int>(18, 19, 20, 21, 22, 23, 24, 25, 26, 27))
        rvAge.adapter = ageAdapter

    }
}