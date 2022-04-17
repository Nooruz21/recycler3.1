package com.example.homework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StreetViewHolder extends RecyclerView.ViewHolder {
    private TextView street;
    public StreetViewHolder(@NonNull View itemView) {
        super(itemView);
        street=itemView.findViewById(R.id.street);
    }

    public void bind(String streets) {
        street.setText(streets);
    }
}
