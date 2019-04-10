package com.example.roommvp.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "table_pets")
public class Pet {
    public Pet(String name) {
        this.name = name;
    }

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "pet_name")
    public String name;
}
