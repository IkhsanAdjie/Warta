package com.ppb.warta.viewmodels;

import com.ppb.warta.models.Article;
import com.ppb.warta.models.Berita;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("top-headlines?country=id&apiKey=662686f399bd415aa024deea2dff86a4")
    Call<ArrayList<Berita>> getTopHeadlines();

    @GET("top-headlines?country=id&apiKey=662686f399bd415aa024deea2dff86a4")
    Call<Article> getHeadlines();

    @GET("top-headlines?country=id&apiKey=662686f399bd415aa024deea2dff86a4")
    Call<String> getHead();
}
