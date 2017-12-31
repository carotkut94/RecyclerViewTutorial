
package com.death.dummyrecycler.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("limit")
    private Long Limit;
    @SerializedName("movie_count")
    private Long MovieCount;
    @SerializedName("movies")
    private List<Movie> Movies;
    @SerializedName("page_number")
    private Long PageNumber;

    public Long getLimit() {
        return Limit;
    }

    public void setLimit(Long limit) {
        Limit = limit;
    }

    public Long getMovieCount() {
        return MovieCount;
    }

    public void setMovieCount(Long movieCount) {
        MovieCount = movieCount;
    }

    public List<Movie> getMovies() {
        return Movies;
    }

    public void setMovies(List<Movie> movies) {
        Movies = movies;
    }

    public Long getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        PageNumber = pageNumber;
    }

}
