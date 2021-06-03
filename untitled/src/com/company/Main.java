package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    private static Button printButton=new Button("Print");
    private static Button playButton=new Button("Play");
  private static Slider vloumeSlider=new Slider(225);


    public static void main(String[] args) {

//        class clickListner implements Button.OnClickListner{
//            public clickListner(){
//                System.out.println("I am onnn bro ");
//            }
//            @Override
//            public void OnClick(String title) {
//                System.out.println(title+"   Button Pressed");
//            }
//        }
//        printButton.setOnClickListner(new clickListner());
        /*****
         *These are the button for the program
         */
        printButton.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void OnClick(String title) {
                System.out.println("Print print print P...R...I...N...T... ");
            }
        });
        playButton.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void OnClick(String title) {
                System.out.println("Playing Playing Playing P...L...A...Y...I...N...G...");
            }
        });
        vloumeSlider.setSlider(new Slider.slider() {
            @Override
            public void onSlide(int number) {
                System.out.println("THe NUmber for test is  "+ number);
            }
        });
               listner();

    }
    /***
     *This is only the rapper class for the function
     ***/
    public static  void listner(){
        boolean quit =false;
        int choice;
        while(!quit){
            System.out.println("1 to exit\n" +
                    "2 to print \n" +
                    "3 to play");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 :
                    quit=true;
                    break;
                case 2 :
                    printButton.OnClick();
                    break;
                case 3 :
                    playButton.OnClick();
                    break;
                case 4 :
                    vloumeSlider.onSlide();
                    break;
            }
        }
    }
}
