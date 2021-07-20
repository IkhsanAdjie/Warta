package com.ppb.warta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ppb.warta.models.Berita;
import com.ppb.warta.viewmodels.Api;
import com.ppb.warta.viewmodels.RetrofitClient;
import com.ppb.warta.viewmodels.WartaViewModel;
import com.ppb.warta.viewmodels.WartaViewModelFactory;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Berita> beritas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WartaViewModelFactory factory = new WartaViewModelFactory();
        WartaViewModel viewModel = new ViewModelProvider(this, factory).get(WartaViewModel.class);
        TextView textView = findViewById(R.id.textView);

    }
}