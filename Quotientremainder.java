package Lab1;

public class Quotientremainder {
int n1,n2;
int q;
int r;
public void cal(int n1,int n2)
{
	System.out.println("enter first numbers:"+n1);
	System.out.println("enter second numbers:"+n2);
	q=n1/n2;
	r=n1%n2;
	System.out.println("the value of quotient is:"+q);
	System.out.println("the value of remainder is"+r);
	

}
	public static void main(String[] args) {
	Quotientremainder r1=new Quotientremainder();
	r1.cal(50,10);

	}

}
