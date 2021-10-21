package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FoodTest
{

	public static void main(String[] args)
	{
		ArrayList<Food> foodlist=new ArrayList<>();
		Food food;
		Iterator <Food> it;
		int foodId,choice=0;
		String foodName,foodType;
		double foodPrice;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.Add food\n2.Get all food\n3.Update Food\n4.Delete food\n5.Search food.\n6.Exit");
		System.out.println("Enter your choice");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter food id");
			foodId=sc.nextInt();
			
			System.out.println("Enter the food name");
			foodName=sc.next();
			
			System.out.println("Enter the food Type");
			foodType=sc.next();
			
			System.out.println("Enter the food Price");
			foodPrice=sc.nextDouble();
			
			food=new Food(foodId,foodName,foodType,foodPrice);
			foodlist.add(food);
			
			System.out.println("Food added succesfully");
			
			break;
			
		case 2:
			System.out.println("--------foood-----------");
			it=foodlist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			break;
			
		case 3:
			System.out.println("Enter existing food id to update");
			foodId=sc.nextInt();
			it=foodlist.iterator();
			while(it.hasNext())
			{
				food=it.next();
				if(food!=null&& food.getFoodId()==foodId)
				{
					System.out.println("enter the new name to change");
					foodName=sc.next();
					food.setFoodName(foodName);
					
					System.out.println("enter the new type to change");
					foodType=sc.next();
					food.setFoodType(foodType);
					
					System.out.println("enter the new price to change");
					foodPrice=sc.nextDouble();
					food.setFoodPrice(foodPrice);
					
					System.out.println("food updated sucessfully");	
					
				}
				
			}
			break;
			
		case 4:
			System.out.println("Enter the existing food id to delete");
			foodId=sc.nextInt();
			it=foodlist.iterator();
			while(it.hasNext())
			{
				food=it.next();
				if(food!=null && food.getFoodId()==foodId)
				{
					it.remove();
				}
			}
			break;
			
		case 5:
			System.out.println("Enter the existing food id to search");
			foodId=sc.nextInt();
			it=foodlist.iterator();
			while(it.hasNext())
			{
				food=it.next();
				if(food!=null && food.getFoodId()==foodId)
				{
					System.out.println(food);
				}
			}
			break;
			
		case 6:
			break;
			
			default:
				
		
		
		}
		
		
		}while(choice!=6);

	}

	
	}


