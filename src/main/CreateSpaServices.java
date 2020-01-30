package main;

import java.util.Scanner;

public class CreateSpaServices {

	public static void main(String[] args) 
	{
		String Service;
		double price;
		String getString = null;
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner input = new Scanner(System.in);
		
		pl("Enter service >>");
		Service = input.nextLine();
		pl("Enter price >>>");
		price = input.nextDouble();
		
		firstService.setServiceDescription(Service);
		firstService.setPrice(price);
		
		input.nextLine();
		pl("Enter service >>");
		Service = input.nextLine();
		pl("Enter price >>>");
		price = input.nextDouble();
		
		secondService.setServiceDescription(Service);
		secondService.setPrice(price);
		
		pl("First service details");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		
		pl("Second service details");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
	}
	public static void pl(String getString)
	{
		System.out.println(getString);
	}
	
}
