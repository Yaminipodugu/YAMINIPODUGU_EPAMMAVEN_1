
package maven_oops_new_year_gif;
import java.util.Arrays;
import java.util.Scanner;
public class New_Year_Gift {
	String childname;
    int ts,tc;
   
New_Year_Gift(String childname,int ts,int tc){
this.childname=childname;
this.ts=ts;
this.tc=tc;
}
public static int Count(Chocolates[] choco,int min,int max) {
int count=0;
for(int i=0;i<choco.length;i++)
if(choco[i].cost>=min && choco[i].cost<=max) count+=choco[i].number;
return count;
}
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter count of children");
int n=sc.nextInt();
int total_sweets,total_choco;
New_Year_Gift[] gift=new New_Year_Gift[n];
Sweets[] sweet;
Chocolates[] choco;
String childname;
 
for(int i=0;i<n;i++) {
System.out.println("Enter name of child");
childname=sc.next();

System.out.println("Enter total number of sweets for children");
   total_sweets=sc.nextInt();
System.out.println("Enter total number of chocolates for children");
  total_choco=sc.nextInt();
sweet=new Sweets[total_sweets];
choco=new Chocolates[total_choco];
   
gift[i]=new New_Year_Gift(childname,total_sweets,total_choco);
int cost,weight,tw=0,num=0;
/*num denotes number of sweets of same type
 * example:total_sweets=2 like gulabjamun and rasagula
 * now num for gulbajamun is 3 means 3 gulabjamun
 * similarly num for rasagula is 2 means 2 rasagula
*/
System.out.println("Enter cost and weight and no.of sweets of same type");
for(int j=0;j<gift[i].ts;j++) {
cost=sc.nextInt();
weight=sc.nextInt();
num=sc.nextInt();
sweet[j]=new Sweets(num,cost,weight);
tw+=weight*num;
}

String type;
System.out.println("Enter cost,weight, type and no. of chocolates of same type");
for(int j=0;j<gift[i].tc;j++) {
cost=sc.nextInt();
weight=sc.nextInt();
type=sc.next();
num=sc.nextInt();
choco[j]=new Chocolates(num,cost,weight,type);
tw+=weight*num;
}


System.out.println("Total weight of child "+gift[i].childname+" is: "+tw);

System.out.println("Sort the chocolates by using one.\n 1.Cost 2.Weight 3.Number of choclates");
int option=sc.nextInt();
Arrays.sort(choco,new Sorting(option));
System.out.println("After sorting..");

for(int j=0;j<total_choco;j++)
System.out.println(choco[j]);

//Finding candies using range

System.out.println("Enter cost range ");
int start=sc.nextInt();
int end=sc.nextInt();

System.out.println("Number of chocolates within the given range of price "+Count(choco,start,end));
}
sc.close();
}
}