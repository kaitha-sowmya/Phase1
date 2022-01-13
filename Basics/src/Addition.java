import java.util.Scanner;

class Add{
	int res=0;
	Add(int x,int y)
	{
	 res=x+y;
	}
}
public class Addition {
	
	public static void main(String[] args) {
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			Add c=new Add(a,b);
			System.out.println("Addition of two numbers is : "+c.res);
		
	}

}
