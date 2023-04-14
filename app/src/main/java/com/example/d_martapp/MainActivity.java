package com.example.d_martapp;

import static com.example.d_martapp.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView name,img;
    String first[] = {"Aata","Bournvita","Cheese","Ice cream","Nail remover","Onion","Oreo","Baby pants","Tea","Tuver Dal"};
    Integer Img[] = {aata,bournvita,cheese,icecream,nail_remover,onion,oreo,pants,tea,tuver_dal};
    String prise[] = {"24rs.","25rs.","26rs.","27rs.","28rs.","29rs.","30rs.","31rs.","32rs.","33rs."};
    String rating[] = {"4.5","5","3","5","4","4.5","5","3","5","4"};
    String qty[] = {"25","150","350","520","2","7","25","150","350","520"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Countries");

        ListView listView=(ListView)findViewById(R.id.list);
        listView.addHeaderView(textView);

        CustomList customList = new CustomList(this, first,prise,rating,qty,Img);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}