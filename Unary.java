package Lab1;

public class Unary {
	int a;
	
	int c,b;
	public void unary(int a,int b)
	{
		a++;//a value is used first and incremented by 1 now value is 6
		System.out.println("the value of res is:"+a);//same thing printed here
		int c=a+b;//6 and 6 after adding 12 is assigned to c
		System.out.println("the value of c is:"+c);//12 printed as expected
		a--;//6 used first and then decremented by 1 
		System.out.println("the value of a is:"+a);//5 printed
		--c;//12-1=11 printed
		System.out.println("the value of c is:"+c);
		c=((a*a)+(--a)-(a+b));
		System.out.println("the value of c is:"+c);//((5*5)+(4)-(4+6))
		
		
	}

	public static void main(String[] args) {
		Unary u1=new Unary();
		u1.unary(5,6);
		
	}

}
