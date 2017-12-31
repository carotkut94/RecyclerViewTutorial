package com.death.dummyrecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.death.dummyrecycler.model.Movie;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by deathcode on 01/01/18.
 */

public class CustomAdapter extends  RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private Context context;
    private List<Movie> movies;

    CustomAdapter(Context context, List<Movie> movies){
        this.context = context;
        this.movies = movies;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Movie movie = movies.get(position);
        Picasso.with(context).load(movie.getMediumCoverImage()).into(holder.poster);
        holder.movie_name.setText(movie.getTitle());
        holder.rating.setText(movie.getRating());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        ImageView poster;
        TextView movie_name;
        TextView rating;
        public CustomViewHolder(View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.poster);
            movie_name = itemView.findViewById(R.id.movie_name);
            rating = itemView.findViewById(R.id.rating);
        }
    }

}