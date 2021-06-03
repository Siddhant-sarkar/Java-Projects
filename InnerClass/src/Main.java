import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static  Button buttonprint=new Button("Print ");

    public static void main(String[] args) {
//        Gearbox mcLaren=new Gearbox(6);
//        mcLaren.addGears(1,1.25);
//        mcLaren.addGears(2,2.22);
//        mcLaren.addGears(3,56.1);
//
//        mcLaren.Clutchin(true);
//        mcLaren.changeGears(2);
//        mcLaren.Clutchin(false);
//        mcLaren.wheelSpeed(100);
        /*****
         * This is a Class declaration
         */
        class Click implements Button.OnClickListner{
                public Click(){
                    System.out.println("I have been Added");
                }
                @Override
                public void onClick(String name) {
                    System.out.println(name +"Was Clicked ");
                }
            }
            buttonprint.setOnClickListner(new onClick());
    }
    public void listen(){
        boolean quit=false;

        while(!quit){
            System.out.println("to quit press 1\n"+"To enter press 2");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 :
                    quit=true;
                    System.out.println("Singing out ");
                    break;
                case 2:
                    buttonprint.OnClick();
            }

        }
    }


}
