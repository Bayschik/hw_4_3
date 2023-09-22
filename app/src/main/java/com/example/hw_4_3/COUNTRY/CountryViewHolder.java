package com.example.hw_4_3.COUNTRY;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView countryName;
    private ItemCountryBinding binding;
    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }

    public void bind(CountryModel countryModel){
        binding.countryName.setText(countryModel.getName());
        Glide.with(binding.imgCountry).load(countryModel.getImg()).into(binding.imgCountry);
    }
}
