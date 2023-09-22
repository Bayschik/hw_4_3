package com.example.hw_4_3.COUNTRY;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;
    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }

    public void bind(CountryModel countryModel){
        Glide.with(binding.imgCountry).load(countryModel.getImg()).into(binding.imgCountry);
    }
}
