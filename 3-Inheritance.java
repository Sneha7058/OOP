
import java.util.Scanner; 
class Empolyee 
{ 
  String emp_name,emp_id,address,mail_id,mob; 
  
  
  void get_data() 
  { 
   Scanner sc=new Scanner(System.in); 
   System.out.print("Enter Name of employee :"); 
   emp_name = sc.nextLine(); 
   
   System.out.print("Enter ID of employee :"); 
   emp_id = sc.next(); 
   
   System.out.print("Enter Address of employee :"); 
   address = sc.next(); 
   
   System.out.print("Enter Mail_ID of employee :"); 
   mail_id = sc.next(); 
   
   System.out.print("Enter mobile number of employee :"); 
   mob = sc.next(); 
   
  } 
  void display() 
  { 
   System.out.println("-------------------------------------------------------------"); 
   System.out.println("EMP NAME\tID\tADDRESS\t\tMOBILE\t\tEmail_id"); 
   System.out.println(emp_name+"\t"+emp_id+"\t"+address+"\t"+mob+"\t"+mail_id); 
 System.out.println("-------------------------------------------------------------"); 
  } 
} 

class Programmer extends Empolyee 
{ 
	double BP, DA, HRA, PF, club_f, Gross_sal, Net_sal;; 
	void get_sal() 
	{ 
		Scanner sc=new Scanner(System.in); 
  		System.out.print("Enter Basic salary : "); 
   		BP = sc.nextDouble(); 
 	} 
 	 
 	void cal_sal() 
 	{ 
 		DA = BP*0.97; 
 		HRA = BP*0.1; 
 		PF = BP*0.12; 
 		club_f = BP*0.001; 
 		Gross_sal = BP + HRA; 
 		Net_sal = Gross_sal - PF - club_f; 
 	} 
 	 
 	void display1() 
 	{ 
 		System.out.println("\t\tPayslip of programmer :"); 
 		display(); 
 		 
 		System.out.println("\t\tBasic pay      : "+BP); 
 		System.out.println("\t\tDA             : "+DA); 
 		System.out.println("\t\tHRA            : "+HRA); 
 		System.out.println("\t\tPF             : "+PF); 
 		System.out.println("\t\tClub fund      : "+club_f); 
 		System.out.println("\t\tGross salary   : "+Gross_sal); 
 		System.out.println("\t\tNet salary     : "+Net_sal); 
 	} 
} 

class teamlead extends Empolyee 
{ 
	double BP, DA, HRA, PF, club_f, Gross_sal, Net_sal;; 
	void get_sal() 
	{ 
		Scanner sc=new Scanner(System.in); 
  		System.out.println("Enter Basic salary : "); 
   		BP = sc.nextDouble(); 
 	} 
 	 
 	void cal_sal() 
 	{ 
 		DA = BP*0.97; 
 		HRA = BP*0.1; 
 		PF = BP*0.12; 
 		club_f = BP*0.001; 
 		Gross_sal = BP + HRA; 
 		Net_sal = Gross_sal - PF - club_f; 
 	} 
 	 
 	void display1() 
 	{ 
 		System.out.println("\t\tPayslip of Teamlead :"); 
 		display(); 
 		 
 		System.out.println("\t\tBasic pay      : "+BP); 
 		System.out.println("\t\tDA             : "+DA); 
 		System.out.println("\t\tHRA            : "+HRA); 
 		System.out.println("\t\tPF             : "+PF); 
 		System.out.println("\t\tClub fund      : "+club_f); 
 		System.out.println("\t\tGross salary   : "+Gross_sal); 
 		System.out.println("\t\tNet salary     : "+Net_sal); 
 	} 
} 

class ass_pro_manager extends Empolyee 
{ 
	double BP, DA, HRA, PF, club_f, Gross_sal, Net_sal;; 
	void get_sal() 
	{ 
		Scanner sc=new Scanner(System.in); 
  		System.out.println("Enter Basic salary : "); 
   		BP = sc.nextDouble(); 
 	} 
 	 
 	void cal_sal() 
 	{ 
 		DA = BP*0.97; 
 		HRA = BP*0.1; 
 		PF = BP*0.12; 
 		club_f = BP*0.001; 
 		Gross_sal = BP + HRA; 
 		Net_sal = Gross_sal - PF - club_f; 
 	} 
 	 
 	void display1() 
 	{ 
 		System.out.println("\t\tPayslip of ass_pro_manager :"); 
 		display(); 
 		 
 		System.out.println("\t\tBasic pay      : "+BP); 
 		System.out.println("\t\tDA             : "+DA); 
 		System.out.println("\t\tHRA            : "+HRA); 
 		System.out.println("\t\tPF             : "+PF); 
 		System.out.println("\t\tClub fund      : "+club_f); 
 		System.out.println("\t\tGross salary   : "+Gross_sal); 
 		System.out.println("\t\tNet salary     : "+Net_sal); 
 	} 
} 


class pro_manager extends Empolyee 
{ 
	double BP, DA, HRA, PF, club_f, Gross_sal, Net_sal;; 
	void get_sal() 
	{ 
		Scanner sc=new Scanner(System.in); 
  		System.out.println("Enter Basic salary : "); 
   		BP = sc.nextDouble(); 
 	} 
 	 
 	void cal_sal() 
 	{ 
 		DA = BP*0.97; 
 		HRA = BP*0.1; 
 		PF = BP*0.12; 
 		club_f = BP*0.001; 
 		Gross_sal = BP + HRA; 
 		Net_sal = Gross_sal - PF - club_f; 
 	} 
 	 
 	void display1() 
 	{ 
 		System.out.println("\t\tPayslip of pro_manager :"); 
 		display(); 
 		 
 		System.out.println("\t\tBasic pay      : "+BP); 
 		System.out.println("\t\tDA             : "+DA); 
 		System.out.println("\t\tHRA            : "+HRA); 
 		System.out.println("\t\tPF             : "+PF); 
 		System.out.println("\t\tClub fund      : "+club_f); 
 		System.out.println("\t\tGross salary   : "+Gross_sal); 
 		System.out.println("\t\tNet salary     : "+Net_sal); 
 	} 
} 
class Inherit 
{ 
	public static void main(String args[]) 
	{ 
		int c; 
		Scanner sc=new Scanner(System.in); 
		do 
		{ 
			System.out.println("\nEnter following choice for Salary slip..."); 
			System.out.println("1.Programmer"); 
			System.out.println("2.Teamleader"); 
			System.out.println("3.Assistant Project manager"); 
			System.out.println("4.Project manager"); 
			System.out.println("5.Exit"); 
			System.out.print("Enter choice :"); 
			c = sc.nextInt(); 
			 
			switch(c) 
			{ 
				case 1 : 
				Programmer p = new Programmer(); 
		        p.get_data(); 
				p.get_sal(); 
				p.cal_sal(); 
		          												System.out.println("-------------------------------------------------------------"); 
				p.display1(); 
		System.out.println("-------------------------------------------------------------"); 
				break; 
					 
				case 2 : 
				teamlead t = new teamlead(); 
				t.get_data(); 
				t.get_sal(); 
				t.cal_sal(); 
		System.out.println("------------------------------------------------------------"); 
				t.display1(); 
		System.out.println("---------------------------------------------------"); 
	 			break; 
					 
				case 3 : 
				ass_pro_manager a = new ass_pro_manager(); 
				a.get_data(); 
				a.get_sal(); 
				a.cal_sal(); 
		System.out.println("-------------------------------------------------------------"); 
				a.display1(); 
		System.out.println("-------------------------------------------------------------"); 
				break; 
					 
				case 4 : 
				pro_manager m = new pro_manager(); 
				m.get_data(); 
				m.get_sal(); 
				m.cal_sal(); 
		System.out.println("-------------------------------------------------------------"); 
				m.display1(); 
		System.out.println("-------------------------------------------------------------"); 
				break; 
					 
				case 5 : System.out.println("\n---------- THANK YOU ----------\n"); 
				break; 
			} 
			 
		}while(c<5); 
			 
	} 
} 















/*

Output

Vostro-260s:~$ javac Inherit.java 
Vostro-260s:~$ java Inherit 

Enter following choice for Salary slip... 
1.Programmer 
2.Teamleader 
3.Assistant Project manager 
4.Project manager 
5.Exit 
Enter choice :1 
Enter Name of employee :Aditya Bhosale 
Enter ID of employee :1001 
Enter Address of employee :Ahmednagar 
Enter Mail_ID of employee :aditya@gmail.com 
Enter mobile number of employee :9975665454 
Enter Basic salary : 90000 
------------------------------------------------------------- 
		Payslip of programmer : 
------------------------------------------------------------- 
EMP NAME	ID	ADDRESS		MOBILE		Email_id 
Aditya Bhosale	1001	Ahmednagar	9975665454	aditya@gmail.com 
------------------------------------------------------------- 
		Basic pay      : 90000.0 
		DA             : 87300.0 
		HRA            : 9000.0 
		PF             : 10800.0 
		Club fund      : 90.0 
		Gross salary   : 99000.0 
		Net salary     : 88110.0 
------------------------------------------------------------- 

Enter following choice for Salary slip... 
1.Programmer 
2.Teamleader 
3.Assistant Project manager 
4.Project manager 
5.Exit 
Enter choice : 


*/

