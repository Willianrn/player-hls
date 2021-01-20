package com.example.playerhls.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.playerhls.R
import com.example.playerhls.model.Video
import com.example.playerhls.view.VideoPlayerActivity

class VideoAdapter(private var videoList: List<Video>) : RecyclerView.Adapter<VideoAdapter.VideoHolder>() {

    fun updateVideoList(videoList: List<Video>){
        this.videoList = videoList
    }

    class VideoHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        val tvTitle: TextView = itemview.findViewById(R.id.tv_title)
        val ivImageUrl: ImageView = itemview.findViewById(R.id.iv_video_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder =
            VideoHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false))

    override fun getItemCount(): Int = videoList.size

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        val videoItem = videoList[position]

        holder.itemView.setOnClickListener{ view ->
            val context = view.context
            val intent = Intent(context, VideoPlayerActivity::class.java)
            intent.putExtra("videoUrl",videoItem.videoUrl)
            context.startActivity(intent)
        }

        holder.apply {
            tvTitle.text = videoItem.title

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(RequestOptions().centerCrop())
                    .load(videoItem.imageUrl)
                    .into(ivImageUrl)
        }
    }
}