package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;
import java.util.Date;

@Entity
public class Train {
    public Train()
    {

    }
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Exer")
    private String exer;

    @ColumnInfo(name = "Rep")
    private int rep;

    @ColumnInfo(name = "Set")
    private int set;

    @ColumnInfo(name = "Weight")
    private double weight;

//    @ColumnInfo(name = "Date")
//    private Calendar date;

    public int getId(){
        return id;
    }

    public String getExer() {
        return exer;
    }

    public int getRep() {
        return rep;
    }

    public int getSet() {
        return set;
    }

    public double getWeight() {
        return weight;
    }

//    public Calendar getDate() {
//        return date;
//    }

    public void setId(int id){this.id = id;}

    public void setExer(String exer) {
        this.exer = exer;
    }
    public void setRep(int rep) {
        this.rep = rep;
    }

    public void setSet(int set) {
        this.set = set;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

//    public void setDate(Calendar date) {
//        this.date = date;
//    }


}
