package com.example.kuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  AnggotaAdapter anggotaAdapter;
    private ArrayList<Anggota> anggotaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        anggotaAdapter = new AnggotaAdapter(anggotaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(anggotaAdapter);


    }
    private void tambahData(){
        anggotaArrayList = new ArrayList<>();
        anggotaArrayList.add(new Anggota("Kartini","Mama",getDrawable(R.drawable.mama)));
        anggotaArrayList.add(new Anggota("Aries Aprilyantara R","Anak pertama",getDrawable(R.drawable.aku)));
        anggotaArrayList.add(new Anggota("Dea Adela Febrianita","Anak kedua",getDrawable(R.drawable.adik)));


    }
}
