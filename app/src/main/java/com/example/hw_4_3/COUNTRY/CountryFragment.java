package com.example.hw_4_3.COUNTRY;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_4_3.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<CountryModel> coutnryModelArrayList = new ArrayList<>();
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter adapter = new CountryAdapter(coutnryModelArrayList);
        binding.rvCountry.setAdapter(adapter);
    }

    public void checkPosition(int position){
        if(position==1){
            loadNorthAmerica();
        } else if (position == 2) {
            loadSouthAmerica();
        } else if (position == 0) {
            loadEurasia();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/06/Vanuatu_flag_300.png", "Vanuatu"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_New_South_Wales.svg/1200px-Flag_of_New_South_Wales.svg.png","New South Wales"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Queensland.svg/2560px-Flag_of_Queensland.svg.png","Queensland"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Flag_of_Vitoria.svg/800px-Flag_of_Vitoria.svg.png?20220927173042","Victoria"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Flag_of_Tasmania.svg/800px-Flag_of_Tasmania.svg.png","Tasmania"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_Western_Australia.svg/2560px-Flag_of_Western_Australia.svg.png","Western Australia"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_South_Australia.svg/1200px-Flag_of_South_Australia.svg.png","South Australia"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/5/52/Flag_Australia_northern_territory.png","Northern Territory"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1280px-Flag_of_New_Zealand.svg.png","New Zealand"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/800px-Flag_of_Papua_New_Guinea.svg.png","Papua New Guinea"));
    }

    private void loadAfrica() {
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png","Morocco"));
        coutnryModelArrayList.add(new CountryModel("https://img.freepik.com/free-vector/illustration-south-africa-flag_53876-27118.jpg","South Africa"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/1280px-Flag_of_Nigeria.svg.png","Nigeria"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/4/40/Flag_of_Ghana.png","Ghana"));
        coutnryModelArrayList.add(new CountryModel("https://seekflag.com/app/uploads/2021/12/Senegal-01-1024x683.png","Senegal"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Mali.svg/2560px-Flag_of_Mali.svg.png","Mali"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Sudan.png","Sudan"));
        coutnryModelArrayList.add(new CountryModel("https://i0.wp.com/africanrelief.org/wp-content/uploads/2021/03/tanzania-flag-png-large.jpg?ssl=1","Tanzania"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/2560px-Flag_of_Uganda.svg.png","Uganda"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/0b/Flag_of_Cameroon.png","Cameroon"));
    }

    private void loadEurasia() {
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Kyrgyzstan.png/1200px-Flag_of_Kyrgyzstan.png", "Kyrgyzstan"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Flag_of_Kazakhstan.png/1200px-Flag_of_Kazakhstan.png","Kazakhstan"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Russia.png","Russia"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Flag_of_Uzbekistan.png/1200px-Flag_of_Uzbekistan.png","Uzbekistan"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Moldova.svg/2560px-Flag_of_Moldova.svg.png","Moldova"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/d/d2/Flag_of_Ukraine.png","Ukraine"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Flag_of_Azerbaijan.png/640px-Flag_of_Azerbaijan.png","Azerbaijan"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_India.png/1280px-Flag_of_India.png","India"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/c/ca/Flag_of_Tajikistan.PNG","Tajikistan"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Flag_of_Belgium.svg/692px-Flag_of_Belgium.svg.png?20221128005359","Belgium"));

    }

    private void loadSouthAmerica() {
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png", "Brazil"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/f/f2/Argentina_Flag.png","Argentina"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/2560px-Flag_of_Colombia.svg.png","Columbia"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png","Chili"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/2560px-Flag_of_Ecuador.svg.png","Ecuador"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/4/48/Venezuela_flag.png","Venezuela"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/f/f1/Peru_flag_with_coat_of_arms_300.PNG","Peru"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/2560px-Flag_of_Uruguay.svg.png","Uruguay"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/2560px-Flag_of_Bolivia_%28state%29.svg.png","Bolivia"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_Guyana.svg/800px-Flag_of_Guyana.svg.png?20230731154017","Guyana"));

    }

    private void loadNorthAmerica() {
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Flag_of_Canada.png/1200px-Flag_of_Canada.png", "Canada"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Flag_of_Mexico.png/1280px-Flag_of_Mexico.png","Mexico"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_Greenland.svg/1280px-Flag_of_Greenland.svg.png","Greenland"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png","Cuba"));
        coutnryModelArrayList.add(new CountryModel("https://flagdownload.com/wp-content/uploads/Flag_of_Panama-4096x2731.png","Panama"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/d/d0/Puerto_rican_Flag.png","Puerto-Rico"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/8/87/State_Flag_of_Costa_Rica_%281906-1964%29.PNG","Kosta-Rika"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/a/a4/Honduras_flag_300.png","Honduras"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Flag_of_El_Salvador.svg/1280px-Flag_of_El_Salvador.svg.png","Salvador"));
        coutnryModelArrayList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/800px-Flag_of_Barbados.svg.png?20221208002018","Barbados"));
    }
}