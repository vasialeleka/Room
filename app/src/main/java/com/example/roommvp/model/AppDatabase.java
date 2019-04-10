package com.example.roommvp.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Pet.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PetDao petDao();
}
