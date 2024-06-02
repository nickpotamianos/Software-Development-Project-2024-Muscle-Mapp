package com.example.musclemapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeScreen : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val goToSettings = findViewById<ImageView>(R.id.imageview39)
        goToSettings.setOnClickListener{
            val intent = Intent(this, SettingsScreen::class.java)
            startActivity(intent)
        }

        val goToNotifications = findViewById<ImageView>(R.id.notbell)
        goToNotifications.setOnClickListener{
            val intent = Intent(this, NotificationScreen::class.java)
            startActivity(intent)
        }

        val searchBar = findViewById<LinearLayout>(R.id.linear27)
        searchBar.setOnClickListener{
            val intent = Intent(this, SearchBarMenu::class.java)
            startActivity(intent)
        }

        val goToMap = findViewById<ImageView>(R.id.imageview37)
        goToMap.setOnClickListener{
            val intent = Intent(this, MapScreen::class.java)
            startActivity(intent)
        }

        val goToSavedSpaces = findViewById<ImageView>(R.id.favorite1)
        goToSavedSpaces.setOnClickListener{
            val intent = Intent(this, SavedSpacesScreen::class.java)
            startActivity(intent)
        }
    }
}