package com.example.playerhls.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.playerhls.R
import com.example.playerhls.model.Video
import com.example.playerhls.viewmodel.VideosViewModel


//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        btnNext.setOnClickListener {
//            val intent = Intent(this, VideoPlayerActivity::class.java)
//            startActivity(intent)
//        }
//    }
//}

class MainActivity : AppCompatActivity() {

    private val fragment: VideoFragment = VideoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_list, fragment)
            .commit()

        val videosViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))
            .get(VideosViewModel::class.java)

        fragment.updateList(videosViewModel.getVideos())

    }
}