package com.example.playerhls.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.playerhls.model.Video
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class VideosViewModel : ViewModel() {

    fun getVideos(): List<Video>{
        return listOf(
            Video("Coelho", "https://i.imgur.com/l0MOaI5.png", "https://multiplatform-f.akamaihd.net/i/multi/will/bunny/big_buck_bunny_,640x360_400,640x360_700,640x360_1000,950x540_1500,.f4v.csmil/master.m3u8"),
            Video("Pakour", "https://i.imgur.com/jRAj1kJ.png", "https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8\n"),
            Video("Animação", "https://i.imgur.com/0nKyU3I.png","https://multiplatform-f.akamaihd.net/i/multi/april11/sintel/sintel-hd_,512x288_450_b,640x360_700_b,768x432_1000_b,1024x576_1400_m,.mp4.csmil/master.m3u8"),
            Video("Bike", "https://i.imgur.com/6cZSAqR.png","https://content.jwplatform.com/manifests/yp34SRmf.m3u8"),
            Video("Coelho", "https://i.imgur.com/l0MOaI5.png", "https://multiplatform-f.akamaihd.net/i/multi/will/bunny/big_buck_bunny_,640x360_400,640x360_700,640x360_1000,950x540_1500,.f4v.csmil/master.m3u8"),
            Video("Pakour", "https://i.imgur.com/jRAj1kJ.png", "https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8\n"),
            Video("Animação", "https://i.imgur.com/0nKyU3I.png","https://multiplatform-f.akamaihd.net/i/multi/april11/sintel/sintel-hd_,512x288_450_b,640x360_700_b,768x432_1000_b,1024x576_1400_m,.mp4.csmil/master.m3u8"),
            Video("Bike", "https://i.imgur.com/6cZSAqR.png","https://content.jwplatform.com/manifests/yp34SRmf.m3u8"),
            Video("Animação", "https://i.imgur.com/0nKyU3I.png","https://multiplatform-f.akamaihd.net/i/multi/april11/sintel/sintel-hd_,512x288_450_b,640x360_700_b,768x432_1000_b,1024x576_1400_m,.mp4.csmil/master.m3u8"),
            Video("Bike", "https://i.imgur.com/6cZSAqR.png","https://content.jwplatform.com/manifests/yp34SRmf.m3u8"))

    }
}




