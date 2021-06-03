package com.SkarTech;

public class Wall {
    private double height;
    private double width;

    public Wall(){
    }


    public Wall(double width,double height){
        if(width>=0&&height>=0){
            this.width=width;
            this.height=height;
        }
        else if(width<0&&height<0){
            this.width=0;
            this.height=0;
        }
        else if(width<0||height<0){
            if(width<0){
                this.width=0;
                this.height=height;
            }
            else if(height<0){
                this.height=0;
                this.width=width;
            }

        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            this.width=0;
        }
        else{
            this.width = width;

        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
    }
    public double getArea(){
        return height*width;
    }
}
