package newyeargift.new_year_gift_demo;

import java.util.ArrayList;

public class Gift {
	ArrayList<Chocolates> ch;
	ArrayList<Candies> c;
	double weight;
	String child_name;
	//constructor of Gift class
	Gift(String child_name,ArrayList<Chocolates> ch,ArrayList<Candies> c)
	{
		this.child_name=child_name;
		this.ch=ch;
		this.c=c;
		weight=0.0;
	}
	//calculating the total weight of child's gift
	void calculate_weight()
	{
		System.out.println("Name of child is "+child_name);
		for(int i=0;i<ch.size();i++)
		{
			weight+=ch.get(i).get_weight();
		}
		for(int i=0;i<c.size();i++)
		{
			weight+=c.get(i).get_weight();
		}
		System.out.println("Total weight of "+child_name+" gift is : "+weight+"\n");
	}
	//sorting chocolates based on their weight
	void sortByWeight()
	{
		for(int i=0;i<ch.size();i++)
		{
			for(int j=i;j<ch.size();j++)
			{
				if(ch.get(i).get_weight()>ch.get(j).get_weight())
				{
					Chocolates temp = ch.get(i);
					ch.set(i,ch.get(j));
					ch.set(j,temp);
				}
			}
		}
		System.out.println("Sorted order of Chocolates in a gift based on weight is : ");
		for(int i=0;i<ch.size();i++)
		{
			System.out.println("Chocolate name : "+ch.get(i).name+"\tWeight : "+ch.get(i).get_weight()); 
		}
		System.out.println();
	}
	//finding cost of candies in range of 10 and 20
	void findCandies()
	{
		System.out.println("List of Candies whose cost is in between 10 and 20 : "); 
		for(int i=0;i<c.size();i++)
		{
			if(c.get(i).get_price()>=10 && c.get(i).get_price()<=20)
			{
				System.out.println("Candie name : "+c.get(i).name+"\tRate : "+c.get(i).get_price());
			}
		}
		System.out.println();
	}
}