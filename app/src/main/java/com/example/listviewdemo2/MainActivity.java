package com.example.listviewdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Task> arrayList = new ArrayList<>();
        arrayList.add(new Task(LocalDate.of(2022,12,12),"牛乳を買う"));
        arrayList.add(new Task(LocalDate.of(1998,12,30),"ピクニックへ行く"));
        arrayList.add(new Task(LocalDate.of(2021,10,11),"公演へ行く"));

        ArrayList<String> tasklist = new ArrayList<>();
        for(Task task: arrayList){
            tasklist.add(task.getDate() + " " + task.getTask());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tasklist);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}