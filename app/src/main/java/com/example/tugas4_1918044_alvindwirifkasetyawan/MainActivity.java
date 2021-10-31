package com.example.tugas4_1918044_alvindwirifkasetyawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

        public class MainActivity extends AppCompatActivity {
            private RecyclerView recyclerView;
            private inbokAdapter adapter;
            private ArrayList<inbok> inbokArrayList;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                addData();
                recyclerView =
                        (RecyclerView)findViewById(R.id.recyclerview);
                adapter = new inbokAdapter(inbokArrayList);
                RecyclerView.LayoutManager layoutManager = new
                        LinearLayoutManager(MainActivity.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
            }
            private void addData() {
                inbokArrayList = new ArrayList<>();
                inbokArrayList.add(new inbok("Ahmad w", "halo",R.drawable.pic6));
                inbokArrayList.add(new inbok("Calabria", "tenang aja bos pasti menang",R.drawable.pic2));
                inbokArrayList.add(new inbok("Juragan", "mau kerja ga ?",R.drawable.pic1));
                inbokArrayList.add(new inbok("Gyuri bae", "oh gitu",R.drawable.pic3));
                inbokArrayList.add(new inbok("kocheng", "makan bos",R.drawable.pic5));
                inbokArrayList.add(new inbok("Arthur", "p",R.drawable.pic4));
            }
        }


