package com.ppb.warta;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.ppb.warta.models.Berita;
import com.ppb.warta.viewmodels.WartaViewModel;
import com.ppb.warta.viewmodels.WartaViewModelFactory;

import java.util.ArrayList;
import java.util.List;

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