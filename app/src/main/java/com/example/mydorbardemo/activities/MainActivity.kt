package com.example.mydorbardemo.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.mydorbardemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationBar.background = null
        bottomNavigationBar.menu.getItem(4).isEnabled = false
        navController = findNavController(R.id.navHostFragment)

        NavigationUI.setupWithNavController(bottomNavigationBar,navController)

        floatingActionButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Floating Action Bar", Toast.LENGTH_SHORT).show()
        }
    }
}
