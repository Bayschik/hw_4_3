package com.example.hw_4_3.CONTINENT;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_4_3.COUNTRY.CountryFragment;
import com.example.hw_4_3.R;
import com.example.hw_4_3.databinding.FragmentContinentBinding;
import com.example.hw_4_3.onClick;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements onClick {
    private RecyclerView rvContinent;
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvContinent = requireActivity().findViewById(R.id.rv_continents);

        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList, this);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Eurasia_%28orthographic_projection%29.svg/1024px-Eurasia_%28orthographic_projection%29.svg.png", "Eurasia"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/North_America.svg/1200px-North_America.svg.png","North America"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/South_America.svg/1200px-South_America.svg.png","South America"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Topography_of_africa.png/936px-Topography_of_africa.png","Africa"));
        continentList.add(new ContinentModel("https://freepngimg.com/thumb/australia/3-2-australia-flag-png-file.png","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}