package com.example.heroes;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Heroes {
    @SerializedName("heroes")
    private ArrayList<hero> heros;

    public Heroes(){

    }

    public ArrayList<hero> getHeros(){
        return heros;
    }
}
