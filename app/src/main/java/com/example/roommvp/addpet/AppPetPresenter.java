package com.example.roommvp.addpet;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.roommvp.model.AppDatabase;
import com.example.roommvp.model.Pet;

public class AppPetPresenter {
    Context context;
    AppDatabase db;
    public AppPetPresenter(Context context) {
        this.context = context;
        db = Room.databaseBuilder(context,AppDatabase.class,"db")
                .allowMainThreadQueries()
                .build();

    }

    public void insertData(String name){
        db.petDao().insertPet(new Pet(name));
    }
}
