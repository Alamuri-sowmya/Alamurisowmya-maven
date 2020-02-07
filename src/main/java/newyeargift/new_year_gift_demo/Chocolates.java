package newyeargift.new_year_gift_demo;

public class Chocolates extends Sweets{
	//Initializing members of chocolates class
	public Chocolates(String name,double weight,double sugarlevel,int price)
	{
		this.name=name;
		this.weight=weight;
		this.sugarlevel=sugarlevel;
		this.price=price;
	}
	//getter method of weight
	double get_weight()
	{
		return weight;
	}
	//getter method of price
	double get_price()
	{
		return price;
	}
}