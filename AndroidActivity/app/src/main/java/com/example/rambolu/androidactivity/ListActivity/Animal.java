package com.example.rambolu.androidactivity.ListActivity;

/**
 * Created by RamboLu on 2017/6/12.
 */

public class Animal {

    private String name;
    private String speak;
    private int icon;

//    public Animal() {
//    }

    public Animal(String Name, String Speak, int Icon) {
        this.name = Name;
        this.speak = Speak;
        this.icon = Icon;
    }

    public String getNames() {
        return name;
    }

    public String getSpeaks() {
        return speak;
    }

    public int getIcons() {
        return icon;
    }

    public void setNames(String Name) {
        this.name = Name;
    }

    public void setSpeaks(String Speak) {
        this.speak = Speak;
    }

    public void setIcons(int Icon) {
        this.icon = Icon;
    }
}
