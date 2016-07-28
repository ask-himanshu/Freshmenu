package com.example.freshmenu.adapter;

/**
 * Created by hp on 28-Jul-16.
 */
public class DataModel {
    private int image;
    private String name;

    public DataModel(String name, int image) {

        this.image=image;
        this.name = name;
    }
    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
