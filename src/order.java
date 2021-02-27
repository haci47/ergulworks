import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt the user to enter two cities
        System.out.println("Enter the first city : ");
        String city1 = scan.nextLine();
        System.out.println("Enter the second city : ");
        String city2 = scan.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are" + " " +city1 +" " +city2);
        else
            System.out.println("The cities in alphabetical order are" +" " +city2 +" " +city1);
    }
}
