package com.example.kiemtralan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvtacgia;
    ArrayList<cactacgia> arraytacgia;
    tacgiaadapter adapter;
    private int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvtacgia = (ListView) findViewById(R.id.lvtacgia);
        arraytacgia = new ArrayList<>();
        arraytacgia.add(new cactacgia("Huy Cận"));
        arraytacgia.add(new cactacgia("Mạc Ngôn"));
        arraytacgia.add(new cactacgia("Shakespeare"));
        arraytacgia.add(new cactacgia("Hemingway"));
        arraytacgia.add(new cactacgia("Nguyễn Du"));
        arraytacgia.add(new cactacgia("Hồ Xuân Hương"));

        adapter = new tacgiaadapter(this, R.layout.tacgia, arraytacgia);
        lvtacgia.setAdapter(adapter);
        lvtacgia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
                if (i == 1) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
                if (i == 2) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
                if (i == 3) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
                if (i == 4) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
                if (i == 5) {
                    startActivity(new Intent(MainActivity.this, Tacpham.class));
                }
            }
        });
    }
}