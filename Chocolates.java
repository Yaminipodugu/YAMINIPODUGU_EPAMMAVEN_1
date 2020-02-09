
package maven_oops_new_year_gif;
public class Chocolates extends Sweets{
	String type;
	Chocolates(int number,int cost,int weight,String type)
	{
	 super(number,cost,weight);
	 this.type=type;
	}
	public  String toString()
	{
	  String str="Cost: "+this.cost+" Weight: "+this.weight+" Total_Number: "+this.number+"Type: "+this.type;
	  return str;
	}  
	
	
}
