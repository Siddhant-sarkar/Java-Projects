package com.company;

public class Slider {
    private int  Number;
    private slider sliding;

    public void setNumber(int number) {
        Number = number;
    }

    public Slider(int number) {
        Number = number;
    }

    public void setSlider(slider slider) {
        this.sliding = slider;
    }
    public void onSlide(){
       this.sliding.onSlide(6514562);
    }

    public interface slider{
        public void onSlide(int number);

    }
}
