package com.example.rambolu.androidadapter.Model;

/**
 * 作者：RamboLu 创建时间： 2017/6/23 18:00
 */

public class CustomListViewModel {

    private int icon;
    private String name;
    private String subName;
    private String minName

    public CustomListViewModel(int icon,String name,String subName,String minName){
        this.icon = icon;
        this.name = name;
        this.subName = subName;
        this.minName = minName;
    }

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getSubName() {
        return subName;
    }

    public String getMinName() {
        return minName;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setMinName(String minName) {
        this.minName = minName;
    }
}
