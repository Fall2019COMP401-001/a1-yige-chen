package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int total_number = scan.nextInt();
		
				
		String[] first_names = new String[total_number];
				
		String[] last_names = new String[total_number];
		
		double[] total_cost = new double[total_number];
				
		for (int i=0; i<total_number; i++) {
			first_names[i] = scan.next();
			last_names[i] = scan.next();
		    int number_of_items = scan.nextInt();
				    
			for (int j=0; j<number_of_items; j++) {
				int number = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				total_cost[i] += number * price;
				
			}
		}
		
		scan.close();
		
		for (int i=0; i<total_number; i++) {
			String total_string = String.format("%.2f", total_cost[i]);
			System.out.println(first_names[i].charAt(0) + ". " + last_names[i] + ": " + total_string);
		}
		
	}
}
