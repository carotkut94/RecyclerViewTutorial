package com.death.dummyrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import com.death.dummyrecycler.model.Movie;
import com.death.dummyrecycler.model.MovieDataJSON;
import com.google.gson.Gson;
import com.rw.velocity.Velocity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    
    RecyclerView recyclerView;
    List<Movie> dataset;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.movie_list);
        dataset = new ArrayList<>();
        adapter = new CustomAdapter(this, dataset);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new CustomItemDecorator(20));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Velocity.initialize(2);
        Velocity.get("https://yts.am/api/v2/list_movies.json").connect(new Velocity.ResponseListener() {
            @Override
            public void onVelocitySuccess(Velocity.Response response) {
                MovieDataJSON movieDataJSON = new Gson().fromJson(response.body, MovieDataJSON.class);
                dataset.addAll(movieDataJSON.getData().getMovies());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onVelocityFailed(Velocity.Response response) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
