package com.liao.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {


        supportFragmentManager.beginTransaction().replace(R.id.container_1, FirstFragment())
            .addToBackStack("").commit()
    }

    override fun onButtonClicked(employee: Employee) {
        var secondFragment = SecondFragment.newInstance(employee, "")

        supportFragmentManager.beginTransaction().replace(R.id.container_1, secondFragment)
            .addToBackStack("").commit()

    }
}