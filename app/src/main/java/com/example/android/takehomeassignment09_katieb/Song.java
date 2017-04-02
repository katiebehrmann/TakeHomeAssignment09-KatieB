package com.example.android.takehomeassignment09_katieb;

import java.io.Serializable;

/**
 * Created by katie on 4/1/17.
 */

public class Song implements Serializable {
    private String name;
    private int length;
    private boolean onVinyl;

    public Song(String name, int length, boolean onVinyl) {
        this.name = name;
        this.length = length;
        this.onVinyl = onVinyl;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isOnVinyl() {
        return onVinyl;
    }

    public void setOnVinyl(boolean onVinyl) {
        this.onVinyl = onVinyl;
    }

    @Override
    public String toString() {
        return "Song: " + "\n" +
                "Title: " + name + "\n" +
                "Length: " + length + "\n" +
                "Vinyl: " + onVinyl + "\n" + "\n";
    }
}
