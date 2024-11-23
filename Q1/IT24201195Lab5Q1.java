import java.util.Scanner;
public class IT24201195Lab5Q1 {
	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);

        // Reading three integers 

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        //smallest number
        int smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        //largest number
        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        //results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        
    }
}