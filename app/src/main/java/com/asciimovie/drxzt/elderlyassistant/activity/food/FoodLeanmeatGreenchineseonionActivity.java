package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FoodLeanmeatGreenchineseonionActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_back;
    Button btn_collect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_leanmeat_greenchineseonion);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_leanmeat_greenchineseonion);
        btn_collect = findViewById(R.id.btn_collect);
        btn_collect.setOnClickListener(this);
    }