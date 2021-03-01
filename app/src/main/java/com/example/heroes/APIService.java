package com.example.heroes;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("heroes.php")
    Call<Heroes> getHeroes();
}
