package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SwimmingCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming_category);

        ArrayAdapter<StudentDataPlavanie> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                StudentDataPlavanie.drinks);

        ListView listDrinks = findViewById(R.id.swimmingCategory);
        listDrinks.setAdapter(listAdapter);
    }
}

