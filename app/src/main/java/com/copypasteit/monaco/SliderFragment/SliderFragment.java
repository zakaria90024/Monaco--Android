package com.copypasteit.monaco.SliderFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.copypasteit.monaco.R;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class SliderFragment extends Fragment {


    ImageSlider imageSlider;
    public SliderFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.layout_slider, container, false);

        List<SlideModel> imageList = new ArrayList<>();
        imageSlider = View.findViewById(R.id.imege_slider);


        imageList.add(new SlideModel("https://apps.bncodeing.com/public/frontend/monako_slider/1676439477679408.jpg", "Monaco Harbor with Luxury Yachts."));
        imageList.add(new SlideModel("https://apps.bncodeing.com/public/frontend/monako_slider/1676439946690273.jpg", "Monaco Carlo skyline, French Riviera."));
        imageList.add(new SlideModel("https://apps.bncodeing.com/public/frontend/monako_slider/1676440645411418.jpg", "Monaco Fantastic Ville"));
        imageList.add(new SlideModel("https://apps.bncodeing.com/public/frontend/monako_slider/1676440612795271.jpg", "Monaco City Nignt"));
        imageList.add(new SlideModel("https://apps.bncodeing.com/public/frontend/monako_slider/1676441154346454.jpg", "Monaco Nice Awesome Nignt"));


        imageSlider.setImageList(imageList, true);

        return View;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



}
