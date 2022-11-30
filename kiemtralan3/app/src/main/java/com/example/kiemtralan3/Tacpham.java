package com.example.kiemtralan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Tacpham extends AppCompatActivity {

    private ListView lvtacpham;
    ArrayList<cactacpham> arrtacpham;
    tacphamadapter adapter;
    private int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacpham);

        lvtacpham = (ListView) findViewById(R.id.lvtacpham);
        arrtacpham = new ArrayList<>();
        arrtacpham.add(new cactacpham("Thuyền đánh cá"));
        arrtacpham.add(new cactacpham("Tràng Giang"));
        arrtacpham.add(new cactacpham("Thuyền đánh cá"));
        arrtacpham.add(new cactacpham("Ngậm Ngùi"));
        arrtacpham.add(new cactacpham("Các Vị La Hán Chùa Tây Phương"));
        arrtacpham.add(new cactacpham("Con Chim Chiền Chiện"));
        arrtacpham.add(new cactacpham("Áo Trắng"));

        adapter = new tacphamadapter(this, R.layout.tacpham, arrtacpham);
        lvtacpham.setAdapter(adapter);
    }
}