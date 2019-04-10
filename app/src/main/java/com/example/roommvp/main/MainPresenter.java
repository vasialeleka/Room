package com.example.roommvp.main;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.roommvp.model.AppDatabase;
import com.example.roommvp.model.Pet;

import java.util.List;

public class MainPresenter {
    Context context;
    AppDatabase db;
    public MainPresenter(Context context) {
        this.context = context;
         db = Room.databaseBuilder(context,AppDatabase.class,"db")
                .allowMainThreadQueries()
                .build();
    }

    public List<Pet> getAllPets(){
        return db.petDao().getAll();
    }

}
