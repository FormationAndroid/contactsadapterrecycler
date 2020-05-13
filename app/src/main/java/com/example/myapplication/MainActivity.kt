package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<Contact>()
        users.add(Contact("john", 42, R.drawable.user, true))
        users.add(Contact("maria", 63, R.drawable.user, true))
        users.add(Contact("christine", 33, R.drawable.user, false))
        users.add(Contact("math", 24, R.drawable.user, true))

        val adapter = ContactsRecyclerAdapter(users)
        recyclerView.adapter = adapter

    }
}
