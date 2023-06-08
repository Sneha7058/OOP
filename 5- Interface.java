import java.util.Scanner; 
interface vehicle 
{ 
	public void gear_change(); 
	public void speed_up(); 
	public void apply_break(); 
} 

class bicycle implements vehicle 
{ 
	bicycle() 
	{ 
		System.out.println("------------------------------------"); 
		System.out.println("\tBicycle Start : "); 
		System.out.println("------------------------------------"); 
	} 
	 
	public void gear_change() 
	{ 
		System.out.println("\n\tGear Change - Bicycle"); 
	} 
	 
	public void speed_up() 
	{ 
		System.out.println("\tSpeed Up - Bicycle"); 
	} 
	 
	public void apply_break() 
	{ 
		System.out.println("\tApply Break - Bicycle\n"); 
	} 
	 
} 

class car implements vehicle 
{ 
	car() 
	{ 
		System.out.println("------------------------------------"); 
		System.out.println("\tCar Start : "); 
		System.out.println("------------------------------------"); 
	} 
	 
	public void gear_change() 
	{ 
		System.out.println("\n\tGear Change - car"); 
	} 
	 
	public void speed_up() 
	{ 
		System.out.println("\tSpeed Up - car"); 
	} 
	 
	public void apply_break() 
	{ 
		System.out.println("\tApply Break - car\n"); 
	} 
	 
} 

class bike implements vehicle 
{ 
	bike() 
	{ 
		System.out.println("------------------------------------"); 
		System.out.println("\tBike Start : "); 
		System.out.println("------------------------------------"); 
	} 
	 
	public void gear_change() 
	{ 
		System.out.println("\n\tGear Change - bike"); 
	} 
	 
	public void speed_up() 
	{ 
		System.out.println("\tSpeed Up - bike"); 
	} 
	 
	public void apply_break() 
	{ 
		System.out.println("\tApply Break - bike\n"); 
	} 
	 
} 

class interfaces 
{ 
	public static void main(String args[]) 
	{ 
		int c; 
		do 
		{ 
			System.out.println("Enter option for vehicle : "); 
			System.out.println("\t1.Bicycle"); 
			System.out.println("\t2.Car"); 
			System.out.println("\t3.Bike"); 
			System.out.println("\tExit"); 
			Scanner sc = new Scanner(System.in); 
			System.out.print("Enter choice : "); 
			c = sc.nextInt(); 
			 
			switch(c) 
			{ 
				case 1 : 
					bicycle b = new bicycle(); 
					b.gear_change(); 
					b.speed_up(); 
					b.apply_break(); 
					System.out.println("------------------------------------"); 
					break; 
					 
					case 2 : 
					car c1 = new car(); 
					c1.gear_change(); 
					c1.speed_up(); 
					c1.apply_break(); 
					System.out.println("------------------------------------"); 
					break; 
					 
					case 3 : 
					bike b1 = new bike(); 
					b1.gear_change(); 
					b1.speed_up(); 
					b1.apply_break(); 
					System.out.println("------------------------------------"); 
					break; 
					 
					case 4 : break; 
			} 
		}while(c<4); 
	} 
} 



















/*

 
Output

Vostro-260s:~$ javac interfaces.java 
Vostro-260s:~$ java interfaces 
Enter option for vehicle : 
	1.Bicycle 
	2.Car 
	3.Bike 
	Exit 
Enter choice : 1 
------------------------------------ 
	Bicycle Start : 
------------------------------------ 

	Gear Change - Bicycle 
	Speed Up - Bicycle 
	Apply Break - Bicycle 

------------------------------------ 
Enter option for vehicle : 
	1.Bicycle 
	2.Car 
	3.Bike 
	Exit 
Enter choice :
*/