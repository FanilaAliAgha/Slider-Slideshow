package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderview;
    int[] images = {R.drawable.one,
    R.drawable.two,
    R.drawable.three,
    R.drawable.four};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderview =findViewById(R.id.sliderview);


        slideradapter slideradapter =new slideradapter(images);
        sliderview.setSliderAdapter(slideradapter);
        sliderview.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderview.startAutoCycle();

    }
}