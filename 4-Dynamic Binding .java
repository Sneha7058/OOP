import java.util.Scanner; 

abstract class shape 
{ 
	double l, h; 
	abstract void get_data(); 
	abstract void compute_area(); 
} 

class triangle extends shape 
{ 
	void get_data() 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the base of triangle : "); 
		l = sc.nextDouble(); 
		 
		System.out.print("Enter the Height of triangle : "); 
		h = sc.nextDouble(); 
	} 
	 
	void compute_area() 
	{ 
		double area; 
		area = (l*h)/2; 
		System.out.print("Area of the trangle is "+area); 
	} 
} 

class rectangle extends shape 
{ 
	void get_data() 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the Length of rectangle : "); 
		l = sc.nextDouble(); 
		 
		System.out.print("Enter the Height of rectangle : "); 
		h = sc.nextDouble(); 
	} 
	 
	void compute_area() 
	{ 
		double area; 
		area = l*h; 
		System.out.print("Area of the rectangle is "+area); 
	} 
} 

class shape 
{ 
	public static void main(String args[]) 
	{ 
		triangle t = new triangle(); 
		t.get_data(); 
		t.compute_area(); 
	 
		reactangle r = new rectangle(); 
		r.get_data(); 
		r.compute_area(); 
	} 
} 



/*
Output

Vostro-260s:~$ javac Shape1.java 
Vostro-260s:~$ java Shape1 
Enter the base of triangle : 10 
Enter the Height of triangle : 10 
Area of the trangle is 50.0 
Enter the Length of rectangle : 20 
Enter the Height of rectangle : 21 
Area of the rectangle is 420.0 
*/


