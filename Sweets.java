package maven_oops_new_year_gif;

public class Sweets {
	int number,cost,weight;
	Sweets(int no_of_sweets, int cost_of_sweet, int weight_of_sweet){
	this.number=no_of_sweets;
	this.cost=cost_of_sweet;
	this.weight=weight_of_sweet;
	}

	public  String toString() {
	String str=" Weight: "+this.weight+"cost: "+ this.cost+"Total Number: "+this.number;
	return str;
	}
}