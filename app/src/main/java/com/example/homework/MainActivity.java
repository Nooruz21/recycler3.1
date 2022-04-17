package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> streets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.street);
        streets= new ArrayList<>();
        streets.add("Шопокова");
        streets.add("Аламедин");
        streets.add("Чуй");
        streets.add("Турусбеков");
        streets.add("Манас");
        streets.add("7 апреля");
        streets.add("Молодая гвардия");
        streets.add("Киевская");
        streets.add("Московская");
        streets.add("Ахунбаев");
        streets.add("Скрябин");
        streets.add("Медерова");
        StreetAdapter adapter=new StreetAdapter(streets);
        recyclerView.setAdapter(adapter);
    }
}