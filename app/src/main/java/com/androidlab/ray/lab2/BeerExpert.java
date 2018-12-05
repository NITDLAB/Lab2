package com.androidlab.ray.lab2;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Rad Moose");
        }
        else
        {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
