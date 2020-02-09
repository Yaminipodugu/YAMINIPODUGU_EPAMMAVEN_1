package maven_oops_new_year_gif;
import java.util.Comparator;
public class Sorting implements Comparator<Chocolates> {
int option;
Sorting(int n){
this.option=n;
}
public int compare(Chocolates c1,Chocolates c2)
{
switch(option) {
case 1:return c1.cost-c2.cost;
case 2:return c1.weight-c2.weight;
case 3:return c1.number=c2.number;

}
return 0;
}
}