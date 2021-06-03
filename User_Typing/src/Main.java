import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your year of birth");
        int year=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wreite your name");
        String name= scanner.nextLine();
        System.out.println(name);
        System.out.println(year);

    }
}
