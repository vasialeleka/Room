package com.example.roommvp.main;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.roommvp.addpet.AddPet;
import com.example.roommvp.model.AppDatabase;
import com.example.roommvp.model.Pet;
import com.example.roommvp.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Pet> list;
    Button button;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        recyclerView=findViewById(R.id.recView);
        MainPresenter presenter = new MainPresenter(getApplicationContext());
        list = presenter.getAllPets();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter adapter = new MainAdapter(list);
        recyclerView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddPet.class);
                startActivity(intent);

            }
        });
    }
}
