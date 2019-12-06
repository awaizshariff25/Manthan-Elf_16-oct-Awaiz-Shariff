package com.manthan.hotelapp.test;

import java.util.Scanner;

import com.manthan.hotelappoperation.test.Foodoperation;
import com.manthan.hoteluserdata.test.UserFoodData;


public class HomePage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to 'Display all food'");
		System.out.println("Press 2 to 'Order from customer'");
		System.out.println("Press 3 to 'operate on food items'");
		System.out.println("Press 4 to 'Total bill of the day'");
		int input=0;
		do{
			input=sc.nextInt();
			switch (input) 
			{
			case 1:
				AllFood food=new AllFood();
				food.showAll();

				break;

			case 2:
				UserFoodData data = new UserFoodData();
				data.userorder();
				break;
			case 3:
				System.out.println("press 'A' to Add Food Item");
				System.out.println("press 'B' to Remove Food Item");
				System.out.println("press 'c' to Modify Food Item");


				String ch = sc.next();
				if(ch.equalsIgnoreCase("A")) {
					Foodoperation foodoperation=new Foodoperation();
					foodoperation.addFood();
				}
				else if(ch.equalsIgnoreCase("B")) {
					Foodoperation foodoperation=new Foodoperation();
					foodoperation.removeFood();
				}
				else if(ch.equalsIgnoreCase("C")) {
					Foodoperation foodoperation=new Foodoperation();
					foodoperation.modifyFood();
				}
				else {
					System.out.println("Invalid Input");
				}				
				break;

			case 4:
				UserFoodData user= new UserFoodData();
				user.totalbill();

				break;

			default:
				System.out.println("Invalid Input");
				break;
			} // end of switch

			System.out.println();
			System.out.println("=====================================================");
			System.out.println("Press 1 to 'Display all food'");
			System.out.println("Press 2 to 'Order from customer'");
			System.out.println("Press 3 to 'operate on food items'");
			System.out.println("Press 4 to 'Total bill of the day'");
			System.out.println("Press -1 to 'Exit'");
			input=sc.nextInt();
		}while(input!=-1);// end of while




	}// end of home

}// end of class



