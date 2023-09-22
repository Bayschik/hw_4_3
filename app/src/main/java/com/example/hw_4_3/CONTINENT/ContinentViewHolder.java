package com.example.hw_4_3.CONTINENT;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4_3.CONTINENT.ContinentModel;
import com.example.hw_4_3.R;
import com.example.hw_4_3.databinding.ItemContinentBinding;

public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContinent;
    private ImageView imgContinent;
    private ItemContinentBinding binding;
    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContinent = itemView.findViewById(R.id.tv_continent);
        imgContinent = itemView.findViewById(R.id.img_continent);
        this.binding=binding;
    }

    public void bind(ContinentModel model) {
        tvContinent.setText(model.getName());
        Glide.with(imgContinent).load(model.getContinent()).into(imgContinent);
    }
}
