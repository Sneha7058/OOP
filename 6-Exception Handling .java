import java.util.Scanner; 
class Exception_Handling 
{ 
	public static void main(String args[]) 
	{ 
		int c; 
		Scanner sc = new Scanner(System.in); 
		do 
		{ 
			System.out.println("\nEnter following choice for exception"); 
			System.out.println("\t1.Arithmatic Exception"); 
			System.out.println("\t2.Array Index out of bouds Exception"); 
			System.out.println("\t3.Number format Exception"); 
			System.out.println("\t4.Exit"); 
			System.out.print("Enter your choice : "); 
			c = sc.nextInt(); 
			 
			switch(c) 
			{ 
				case 1 : 
				try 
				{ 
					int num1, num2, num3; 
					System.out.print("Enter First number : "); 
					num1 = sc.nextInt(); 
			 
					System.out.print("Enter Second number : "); 
					num2 = sc.nextInt(); 
			 
					num3 = num1/num2; 
					System.out.print("Division = "+num3); 
				} 
		 
				catch(Exception e) 
				{ 
					System.out.println("\n------------------------------------------\n"); 
					System.out.println("Divide by Zero \n"+e); 
					System.out.println("\n------------------------------------------\n"); 
				} 
					break; 
					 
				case 2 : 
				try 
				{ 
					int a[]=new int [8]; 
					a[4] = 10; 
					System.out.println("value at index 4 : "+a[4]); 
					a[9] = 20; 
					System.out.println("value at index 9 : "+a[9]); 
				} 
		 
				catch(ArrayIndexOutOfBoundsException e) 
				{ 
					System.out.println("\n------------------------------------------\n"); 
					System.out.println("Array Index Out Of Bounds \n"+e); 
					System.out.println("\n------------------------------------------\n"); 
				} 
					break; 
					 
				case 3 : 
				try 
				{ 
					int a; 
					a = Integer.parseInt("XYZ"); 
					System.out.println("a = "+a); 
				} 
		 
				catch(Exception e) 
				{ 
					System.out.println("\n------------------------------------------\n"); 
					System.out.println("Number Format Exception \n"+e); 
					System.out.println("\n------------------------------------------\n"); 
				} 
					break; 
					 
				case 4 : break; 
			} 
		}while(c<4); 
	} 
} 




















/*


Output

Vostro-260s:~$ javac Exception_Handling.java 
Vostro-260s:~$ java Exception_Handling 

Enter following choice for exception 
	1.Arithmatic Exception 
	2.Array Index out of bouds Exception 
	3.Number format Exception 
	4.Exit 
Enter your choice : 1 
Enter First number : 100 
Enter Second number : 0 

------------------------------------------ 

Divide by Zero 
java.lang.ArithmeticException: / by zero 

------------------------------------------ 


Enter following choice for exception 
	1.Arithmatic Exception 
	2.Array Index out of bouds Exception 
	3.Number format Exception 
	4.Exit 
Enter your choice : 




*/