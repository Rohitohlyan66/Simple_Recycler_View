package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList=findViewById(R.id.programming_list);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] language={"Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello"};
        programmingList.setAdapter(new ProgrammingAdapter(language));
    }
}
