package com.codepath.flicx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcy;
    List<Movie> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcy = findViewById(R.id.recyclerHolder);

        movies.add(new Movie("Movie 1", "Movie 1 description", "some image"));
        movies.add(new Movie("Movie 2", "Movie 2 description", "some image"));
        movies.add(new Movie("Movie 3", "Movie 3 description", "some image"));

        MovieAdapter mvAdapter = new MovieAdapter(movies, getApplicationContext());
        rcy.setAdapter(mvAdapter);
        rcy.setLayoutManager(new LinearLayoutManager(this));
    }
}
