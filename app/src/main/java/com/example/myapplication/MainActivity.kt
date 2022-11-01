package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nav = findViewById<NavigationView>(R.id.nav_view);
        nav.setNavigationItemSelectedListener(this);

        var rc = findViewById<RecyclerView>(R.id.rc_view);

        var studeMassive = ArrayList<Students>();
        studeMassive.add(Students("Мария", "Иванова", "Плавание", "2"));
        studeMassive.add(Students("Алевтина", "Николаева", "Бег", "1"));
        studeMassive.add(Students("Диана", "Матусевич", "Стрельба из лука", "4"));
        studeMassive.add(Students("Анастасия", "Кабанова", "Шахматы", "3"));
        rc.hasFixedSize();
        rc.layoutManager = LinearLayoutManager(this);
        rc.adapter = MyAdapter(studeMassive, this);

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.studentsV -> Toast.makeText(this, "Список Студентов", Toast.LENGTH_SHORT).show();
            R.id.studentsPoGroup -> Toast.makeText(this, "Список по группам", Toast.LENGTH_SHORT).show();
            R.id.studentsPoKursam -> Toast.makeText(this, "Список по курсам", Toast.LENGTH_SHORT).show();
            R.id.otchOne -> Toast.makeText(this, "Отчёт", Toast.LENGTH_SHORT).show();
            R.id.otchTwo -> Toast.makeText(this, "Табель", Toast.LENGTH_SHORT).show();
            R.id.addActiv -> Toast.makeText(this, "Добавить человека", Toast.LENGTH_SHORT).show();
            R.id.feedbackActivity -> Toast.makeText(this, "Фидбэк", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}