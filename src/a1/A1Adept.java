package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int total_item = scan.nextInt();
		
		String[] items = new String[total_item];
		double[] prices = new double[total_item];
		
		for (int i=0; i<total_item; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int total_customer = scan.nextInt();
		
		String[] first_names = new String[total_customer];		
		String[] last_names = new String[total_customer];
		double[] total_spend = new double[total_customer];
		
		for (int i=0; i<total_customer; i++) {
			first_names[i] = scan.next();
			last_names[i] = scan.next();
			int items_bought = scan.nextInt();
			
			for (int j=0; j<items_bought; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int index=0; index<total_item; index++) {
					if (name.contentEquals(items[index])) {
						double price = prices[index];
						total_spend[i] += quantity * price;
					}
					
				}
				
			}
			
		}
		
		int biggest_customer_index = biggest(total_spend);
		int smallest_customer_index = smallest(total_spend);
		double average_spend = average(total_spend);
		
		System.out.println(items[1]);
		System.out.println("Biggest: " + first_names[biggest_customer_index] + " " + last_names[biggest_customer_index] + " (" + String.format("%.2f", total_spend[biggest_customer_index]) + ")");
		System.out.println("Smallest: " + first_names[smallest_customer_index] + " " + last_names[smallest_customer_index] + " (" + String.format("%.2f", total_spend[smallest_customer_index]) + ")");
		System.out.println("Average: " + String.format("%.2f", average_spend));
	}
	
	static int biggest(double[] spend) {
		int index = 0;
		int biggest_index = 0;
		double biggest = 0;
		while (index < spend.length) {
			if (spend[index] > biggest) {
				biggest_index = index;
				biggest = spend[index];
			}
			index++;
		}
		return biggest_index;
	}
	
	static int smallest(double[] spend) {
		int index = 0;
		int smallest_index = 0;
		double smallest = 999;
		while (index < spend.length) {
			if (spend[index] < smallest) {
				smallest_index = index;
				smallest = spend[index];
			}
			index++;
		}
		return smallest_index;
	}
	
	static double average(double[] spend) {
		double total = 0;
		for (int i=0; i<spend.length; i++) {
			total += spend[i];
		}
		double average = total / spend.length;
		return average;
	}
}
