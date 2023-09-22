package com.example.hw_4_3.COUNTRY;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_4_3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> coutnryModelArrayList = new ArrayList<>();

    public CountryAdapter(ArrayList<CountryModel> coutnryModelArrayList) {
        this.coutnryModelArrayList = coutnryModelArrayList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(coutnryModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return coutnryModelArrayList.size();
    }
}
