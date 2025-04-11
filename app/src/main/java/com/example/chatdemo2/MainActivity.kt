package com.example.chatdemo2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.chatdemo2.databinding.ActivityMainBinding
import com.example.websocketchatlibrary.ui.launcher.ChatLauncher


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the Start Chat button using ChatLauncher
        binding.startChatButton.setOnClickListener{
            ChatLauncher.start(this)        }
    }
}