package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TrainDao {
    @Query("SELECT * FROM train")
    List<Train> getAll();

    @Insert
    void insertOne(Train train);
    @Delete
    void delete(Train train);

}
