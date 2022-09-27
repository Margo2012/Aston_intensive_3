package com.example.flagsandloadingpictures

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.flagsandloadingpictures.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonStartFlags:Button = binding.startFlags
        buttonStartFlags.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FlagActivity::class.java)
            startActivity(intent)
        })

        val buttonStartPictures:Button = binding.startLoadingPictures
        buttonStartPictures.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PicturesActivity::class.java)
            startActivity(intent)
        })
    }

}