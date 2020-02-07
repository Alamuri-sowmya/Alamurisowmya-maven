package newyeargift.new_year_gift_demo;

//creating abstract class
public abstract class Sweets {
	// attributes of sweets class
	String name;
	protected double weight;
	double sugarlevel;
	protected int price;
	//abstract methods
	abstract double get_weight();
	abstract double get_price();
}