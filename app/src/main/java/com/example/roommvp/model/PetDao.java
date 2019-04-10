package com.example.roommvp.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.roommvp.model.Pet;

import java.util.List;

@Dao
public interface PetDao {
    @Query("SELECT * FROM TABLE_PETS")
    List<Pet> getAll();

   @Insert
    void insertPet(Pet... pet);
}
