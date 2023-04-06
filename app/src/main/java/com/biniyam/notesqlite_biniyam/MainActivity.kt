package com.biniyam.notesqlite_biniyam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.biniyam.notesqlite_biniyam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnAdd.setOnClickListener {
            val intent = Intent (this, AddNoteActivity::class.java)
            startActivity(intent)
        }


    }
}