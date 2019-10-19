package com.codepath.flicx;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView description;
    private ImageView image;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.movie_name);
        description = itemView.findViewById(R.id.movie_description);
        image = itemView.findViewById(R.id.movie_image);
    }

    public void bind(Movie movie) {
        name.setText(movie.getMovieName());
        description.setText(movie.getMovieDescription());
    }
}
