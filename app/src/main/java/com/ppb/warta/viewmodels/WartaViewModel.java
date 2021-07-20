package com.ppb.warta.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ppb.warta.models.Article;
import com.ppb.warta.models.Berita;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WartaViewModel extends ViewModel {
    private MutableLiveData<List<Berita>> mutableLiveData = new MutableLiveData<>();
    private List<Berita> beritas = new ArrayList<>();
    private Api api;

    public WartaViewModel(){
        api = RetrofitClient.getClient().create(Api.class);
    }
    private void readBerita(){
        Call<String> call = api.getHead();

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    JSONObject object = new JSONObject(response.body());
                    String str = object.getJSONArray("articles").toString();
                    beritas = new Gson().fromJson(str, new TypeToken<List<Berita>>(){}.getType());
                    mutableLiveData.setValue(beritas);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
            }
        });
    }
    
    public LiveData<List<Berita>> getBerita(){
        return mutableLiveData;
    }
}
