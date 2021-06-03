import java.util.Scanner;

public class Sum_Finder {
   public static void Sum10(){
       Scanner scanner = new Scanner(System.in);
       int current_number=1;
       int running_sum=0;

       while(true){

           System.out.println("Enter number #"+current_number);
           boolean temp=scanner.hasNextInt();
           if (temp){
               int running_sum;
               
               current_number++;
               if (current_number==10){
                   break;
                   System.out.println(running_sum);
//                   return true;
               }
           }
           else{
//               return false;
               System.out.println("Invalid value");
           }

       }
   }

}
