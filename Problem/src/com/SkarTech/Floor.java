package com.SkarTech;

public class Floor {
    private double width;
    private double length;

    public Floor(double width,double length){
        if(width>0&&length>0){
            this.length=length;
            this.width=width;
        }
        else if (width<0||length<0){
            if(width<0){
                this.width=0;
                if(length<0){
                    this.length=0;
                }
                this.length=length;
            }
            else if(width>0){
                this.width=width;
                if(length<0){
                    this.length=0;
                }
                this.length=length;

            }
        }
    }

    public double getArea() {
        return length*width;
    }
}
