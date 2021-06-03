package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String Name;
    private int hitPoints;
    private int Strength;

    @Override
    public List<String> write() {
        List<String>temp=new ArrayList<>();
        temp.add(0,this.Name);
        temp.add(1,""+this.hitPoints);
        temp.add(2,""+this.Strength);
        return temp;
    }

    @Override
    public void read(List<String> SavedValue) {
        if(SavedValue!=null&&SavedValue.size()>0){
            this.Name=SavedValue.get(0);
            this.Strength=Integer.parseInt(SavedValue.get(1));
            this.hitPoints=Integer.parseInt(SavedValue.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "Name='" + Name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + Strength +
                '}';
    }

    public String getName() {
        return Name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return Strength;
    }

    public Monster(String name, int hitPoints, int strength) {
        Name = name;
        this.hitPoints = hitPoints;
        Strength = strength;
    }
}
