package com.study.fooddeliveryapplication.adapters;

import android.widget.Button;

import com.study.fooddeliveryapplication.model.Food;

import java.util.List;

public interface UpdateRestFoodItems {
    void callBack(int position, List<Food> foods);
}
