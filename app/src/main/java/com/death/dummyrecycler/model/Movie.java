
package com.death.dummyrecycler.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    @SerializedName("background_image")
    private String BackgroundImage;
    @SerializedName("background_image_original")
    private String BackgroundImageOriginal;
    @SerializedName("date_uploaded")
    private String DateUploaded;
    @SerializedName("date_uploaded_unix")
    private Long DateUploadedUnix;
    @SerializedName("description_full")
    private String DescriptionFull;
    @SerializedName("genres")
    private List<String> Genres;
    @SerializedName("id")
    private Long Id;
    @SerializedName("imdb_code")
    private String ImdbCode;
    @SerializedName("language")
    private String Language;
    @SerializedName("large_cover_image")
    private String LargeCoverImage;
    @SerializedName("medium_cover_image")
    private String MediumCoverImage;
    @SerializedName("mpa_rating")
    private String MpaRating;
    @SerializedName("rating")
    private String Rating;
    @SerializedName("runtime")
    private Long Runtime;
    @SerializedName("slug")
    private String Slug;
    @SerializedName("small_cover_image")
    private String SmallCoverImage;
    @SerializedName("state")
    private String State;
    @SerializedName("summary")
    private String Summary;
    @SerializedName("synopsis")
    private String Synopsis;
    @SerializedName("title")
    private String Title;
    @SerializedName("title_english")
    private String TitleEnglish;
    @SerializedName("title_long")
    private String TitleLong;
    @SerializedName("torrents")
    private List<Torrent> Torrents;
    @SerializedName("url")
    private String Url;
    @SerializedName("year")
    private Long Year;
    @SerializedName("yt_trailer_code")
    private String YtTrailerCode;

    public String getBackgroundImage() {
        return BackgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        BackgroundImage = backgroundImage;
    }

    public String getBackgroundImageOriginal() {
        return BackgroundImageOriginal;
    }

    public void setBackgroundImageOriginal(String backgroundImageOriginal) {
        BackgroundImageOriginal = backgroundImageOriginal;
    }

    public String getDateUploaded() {
        return DateUploaded;
    }

    public void setDateUploaded(String dateUploaded) {
        DateUploaded = dateUploaded;
    }

    public Long getDateUploadedUnix() {
        return DateUploadedUnix;
    }

    public void setDateUploadedUnix(Long dateUploadedUnix) {
        DateUploadedUnix = dateUploadedUnix;
    }

    public String getDescriptionFull() {
        return DescriptionFull;
    }

    public void setDescriptionFull(String descriptionFull) {
        DescriptionFull = descriptionFull;
    }

    public List<String> getGenres() {
        return Genres;
    }

    public void setGenres(List<String> genres) {
        Genres = genres;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getImdbCode() {
        return ImdbCode;
    }

    public void setImdbCode(String imdbCode) {
        ImdbCode = imdbCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getLargeCoverImage() {
        return LargeCoverImage;
    }

    public void setLargeCoverImage(String largeCoverImage) {
        LargeCoverImage = largeCoverImage;
    }

    public String getMediumCoverImage() {
        return MediumCoverImage;
    }

    public void setMediumCoverImage(String mediumCoverImage) {
        MediumCoverImage = mediumCoverImage;
    }

    public String getMpaRating() {
        return MpaRating;
    }

    public void setMpaRating(String mpaRating) {
        MpaRating = mpaRating;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public Long getRuntime() {
        return Runtime;
    }

    public void setRuntime(Long runtime) {
        Runtime = runtime;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getSmallCoverImage() {
        return SmallCoverImage;
    }

    public void setSmallCoverImage(String smallCoverImage) {
        SmallCoverImage = smallCoverImage;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        Synopsis = synopsis;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitleEnglish() {
        return TitleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        TitleEnglish = titleEnglish;
    }

    public String getTitleLong() {
        return TitleLong;
    }

    public void setTitleLong(String titleLong) {
        TitleLong = titleLong;
    }

    public List<Torrent> getTorrents() {
        return Torrents;
    }

    public void setTorrents(List<Torrent> torrents) {
        Torrents = torrents;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Long getYear() {
        return Year;
    }

    public void setYear(Long year) {
        Year = year;
    }

    public String getYtTrailerCode() {
        return YtTrailerCode;
    }

    public void setYtTrailerCode(String ytTrailerCode) {
        YtTrailerCode = ytTrailerCode;
    }

}
