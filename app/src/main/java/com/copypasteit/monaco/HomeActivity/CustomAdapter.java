package com.copypasteit.monaco.HomeActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.copypasteit.monaco.R;
import com.copypasteit.monaco.ViewActivity.ViewActivity;
import com.copypasteit.monaco.main.model.Post;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    HomeActivity homeActivity;
    public List<Post> posts;

    public CustomAdapter(HomeActivity homeActivity, List<Post> posts) {
        this.homeActivity = homeActivity;
        this.posts = posts;
    }
    public void setData(List<Post> posts){
        this.posts = posts;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homerecycler, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String dress_name = posts.get(position).getMonakoName();
                String dress_model_no = posts.get(position).getMonakoName();
                String dress_size = posts.get(position).getMonakoSlug();
                String dress_details = posts.get(position).getMonakoDetails();
                String dress_image_url = posts.get(position).getMonakoImageUrl();


                //Intent to start activity
                Intent intent = new Intent(homeActivity, ViewActivity.class);
                //put data in intent
                intent.putExtra("dress_name", dress_name);
                intent.putExtra("dress_model_no", dress_model_no);
                intent.putExtra("dress_size", dress_size);
                intent.putExtra("dress_image_url", dress_image_url);
                intent.putExtra("dress_details", dress_details);
                //start activity

                homeActivity.startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        String dress_name = post.getMonakoName();
        String dress_model_no = post.getMonakoSlug();
        String monako_details = post.getMonakoDetails();
        String dress_image_url = post.getMonakoImageUrl();

        holder.monako_name.setText(dress_name);
        holder.monako_slug.setText(dress_model_no);
        //holder.monako_detils.setText(monako_details);

        Glide
                .with(homeActivity)
                .load(dress_image_url)
                .override(320, 200)
                .centerCrop()
                //.placeholder(R.drawable.ic_spinner)
                .into(holder.monako_image);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }


}
