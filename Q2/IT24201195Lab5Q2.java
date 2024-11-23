import java.util.Scanner;

public class IT24201195Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //new members introduced
        System.out.print("number of new members introduced: ");
        int newMembers = input.nextInt();

        // Validate
        if (newMembers < 0) {
            System.out.println("Invalid number.");
        } else {
            // Determining the prize 
            switch (newMembers) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("your prize is a Pen");
                    break;
                case 2:
                    System.out.println("your prize is an Umbrella");
                    break;
                case 3:
                    System.out.println("your prize is a Bag");
                    break;
                case 4:
                    System.out.println("your prize is a Travelling Chair");
                    break;
                default:
                    System.out.println("your prize is a Headphone");
                    break;
            }
        }
    }
}
