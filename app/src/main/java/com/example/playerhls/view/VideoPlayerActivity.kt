package com.example.playerhls.view

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playerhls.R
import com.halilibo.bettervideoplayer.BetterVideoPlayer

class VideoPlayerActivity : AppCompatActivity() {

    lateinit var videoPlayer: BetterVideoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR

        videoPlayer = findViewById(R.id.videoPlayer)!!
        val videoUrl = intent.getStringExtra("videoUrl")

        if (savedInstanceState == null) {
            videoPlayer.setAutoPlay(true)
            videoPlayer.setSource(Uri.parse(videoUrl))
        }

        videoPlayer.setHideControlsOnPlay(true)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportActionBar?.hide()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            supportActionBar?.show()
        }
    }

    public override fun onPause() {
        videoPlayer.pause()
        super.onPause()
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
