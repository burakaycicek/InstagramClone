package com.burakaycicek.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.burakaycicek.instagramclone.databinding.ActivityFeedBinding
import com.burakaycicek.instagramclone.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUploadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun upload (view: View){

    }

    fun selectImage(view: View){

    }


}