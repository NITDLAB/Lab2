package com.androidlab.ray.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView)findViewById(R.id.brand);
        Spinner color = (Spinner)findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandslist = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand : brandslist)
        {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
