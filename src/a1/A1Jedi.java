package a1;

import java.util.Scanner;

public class A1Jedi {

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
			int[] customer_quantity = new int[total_item];
			int[] item_quantity = new int[total_item];
			
			for (int i=0; i<total_customer; i++) {
				first_names[i] = scan.next();
				last_names[i] = scan.next();
				int items_bought = scan.nextInt();
				String[] item_list = new String[items_bought];
				
				for (int j=0; j<items_bought; j++) {
					int quantity = scan.nextInt();
					String name = scan.next();
					item_list[j] = name;
				    for (int index=0; index<total_item; index++) {
				    	if (name.contentEquals(items[index])) {
				    		item_quantity[index] += quantity;
				    		customer_quantity[index] += 1;
				    		for (int n=0; n < j; n++) {
				    			if (name.contentEquals(item_list[n])) {
				    				customer_quantity[index] -= 1;
				    				if (n >= 1) {
					    				if (item_list[n].contentEquals(item_list[n-1])) {
					    					customer_quantity[index] += 1;
					    				}
					    			}
		    					}
				    			
				    		}
				    	}
				    }
				
				}
				
			}
			for (int i=0; i<total_item; i++) {
				if (item_quantity[i] == 0) {
					System.out.println("No customers bought " + items[i]);
				} else {
					System.out.println(customer_quantity[i] + " customers bought " + item_quantity[i] + " " + items[i]);
				}
			}
	}
}
