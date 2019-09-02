package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int total_number = scan.nextInt();
				
		//String[] first_names = new String[total_number];
				
		//String[] last_names = new String[total_number];
				
				
				
		for (int i=0; i<total_number; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
		    int number_of_items = scan.nextInt();
		    double total_cost = 0;
				    
			for (int j=0; j<number_of_items; j++) {
				total_cost += scan.nextInt() * scan.nextDouble();
				String item = scan.next();
			}
				    
		    System.out.println(first_name.charAt(0) + ". " + last_name + ": " + total_cost);
		}
		
	}
}
