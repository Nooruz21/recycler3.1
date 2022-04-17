package com.example.homework;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StreetAdapter extends RecyclerView.Adapter<StreetViewHolder> {
    private ArrayList<String> street = new ArrayList<>();

    public StreetAdapter(ArrayList<String> street) {
        this.street = street;
    }

    @NonNull
    @Override
    public StreetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StreetViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_street,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StreetViewHolder holder, int position) {
holder.bind(street.get(position));
    }

    @Override
    public int getItemCount() {
        return street.size();
    }
}
