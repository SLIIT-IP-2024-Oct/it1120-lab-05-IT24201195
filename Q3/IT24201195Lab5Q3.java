import java.util.Scanner;
public class IT24201195Lab5Q3{
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);

int roomCharge = 48000;

		System.out.print("ENTER START DATE(1-31): ");
		int startDay = input1.nextInt();
		System.out.print("ENTER END DATE(1-31): ");
		int endDay = input1.nextInt();

if(startDay<1 || startDay>31 || endDay<1 || endDay>31){
System.out.println("The dates should be between 1st-31st");
return;
}
if(startDay>=endDay){
System.out.println("ERROR: Start date should be less than end date");
return;
}

int daysBooked = endDay - startDay ; 
System.out.println("Number of Days reserved: " + daysBooked);

int total = daysBooked*48000;
System.out.println("Room Charge per day (LKR) = 48000 ");
System.out.print("Total amount to be paid (LKR) = " + total);

}
}




				


		
		