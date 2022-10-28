package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position ==  0)
                {
                    Intent intentOne = new Intent(MainActivity.this, SwimmingCategoryActivity.class);
                    startActivity(intentOne);
                }
                else if (position == 1)
                {
                    Intent intentTwo = new Intent(MainActivity.this, BorbaCategoryActivity.class);
                    startActivity(intentTwo);
                }
                else if (position == 2)
                {
                    Intent intentThree = new Intent(MainActivity.this, BorbaCategoryActivity.class);
                    startActivity(intentThree);
                }
                else if (position == 3)
                {
                    Intent intentFour = new Intent(MainActivity.this, BorbaCategoryActivity.class);
                    startActivity(intentFour);
                }
            }
        };
        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}