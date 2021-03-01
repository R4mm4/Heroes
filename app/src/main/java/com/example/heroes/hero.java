package com.example.heroes;
import com.google.gson.annotations.SerializedName;


public class hero {
    @SerializedName("name")
    private String name;

    @SerializedName("imageurl")
    private String url;

    public hero(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
