package newyeargift.new_year_gift_demo;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args)
	{
		//objects of chocolates
		Chocolates ch1=new Chocolates("Milky Bar",13.6,60.0,10);
		Chocolates ch2=new Chocolates("Dairy Milk",10.0,100.5,40);
		Chocolates ch3=new Chocolates("Five Star",15.0,15.0,5);
		//Chocolates of first gift
		ArrayList<Chocolates> choco=new ArrayList<Chocolates>(2);
		choco.add(ch1);
		choco.add(ch2);
		//Candies of first gift
		Candies cn1=new Candies("Cadbury Gems",100.0,75.1,10);
		Candies cn2=new Candies("Lollypop",20.0,60.8,35);
		Candies cn3=new Candies("Chewing Gums",22.0,30.0,15);
		//Chocolates of first gift
		ArrayList<Candies> candy=new ArrayList<Candies>(2);
		candy.add(cn2);
		candy.add(cn3);
		//First Gift
		Gift gift1=new Gift("Jhansi",choco,candy);
		gift1.calculate_weight();
		gift1.sortByWeight();
		gift1.findCandies();
		
		
		System.out.println("========================================================"+"\n");
		
		
		//Chocolates of second gift
		ArrayList<Chocolates> choco1=new ArrayList<Chocolates>(2);
		choco1.add(ch1);
		choco1.add(ch3);
		//Candies of second gift
		ArrayList<Candies> candy1=new ArrayList<Candies>(3);
		candy1.add(cn1);
		candy1.add(cn2);
		candy1.add(cn3);
		//Second Gift
		Gift gift2=new Gift("Bharat",choco1,candy1);
		gift2.calculate_weight();
		gift2.sortByWeight();
		gift2.findCandies();
		
	}
}