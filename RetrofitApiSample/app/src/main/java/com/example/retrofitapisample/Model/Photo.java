package com.example.retrofitapisample.Model;

import com.google.gson.annotations.SerializedName;

public class Photo {
    @SerializedName("albumId")
    String albumId;
    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("url")
    String url;
    @SerializedName("thumbnailUrl")
    String thumbnailUrl;
    public Photo(){

    }

    public Photo(String albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
