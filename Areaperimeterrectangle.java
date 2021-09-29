package Lab1;

public class Areaperimeterrectangle {

	int l;
	int w;
	int area;
	int perimeter;
	public void area(int l,int w)
	{
		area=l*w;
		System.out.println("the area of rectangle value is----"+area);
		
	}
	public void perimeter(int l,int w)
	{
		perimeter=(2*(l+w));
		System.out.println("the perimeter of the rectangle is-----"+perimeter);
	}
	public static void main(String[] args) {
		Areaperimeterrectangle obj1=new Areaperimeterrectangle();
		obj1.area(5,6);
		obj1.perimeter(5,5);

	}

}
