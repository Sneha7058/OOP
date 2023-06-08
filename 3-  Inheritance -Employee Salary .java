import java.util.*; 
class Employee 
{ 
int empid; 
long mobile; 
String name, address, mailid; 
double salary,bp,da,hra,pf,club,net,gross,basic; 
Scanner get = new Scanner(System.in); 
void getdata() 
{ 
System.out.println("Enter Name of the Employee"); 
name = get.nextLine(); 
System.out.println("Enter Mail id"); 
mailid = get.nextLine(); 
System.out.println("Enter Address of the Employee:"); 
address = get.nextLine(); 
System.out.println("Enter employee id "); 
empid = get.nextInt(); 
System.out.println("Enter Mobile Number"); 
mobile = get.nextLong(); 
} 
void display() 
{ 
System.out.println("Employee Name: "+name); 
System.out.println("Employee id : "+empid); 
System.out.println("Mail id : "+mailid); 
System.out.println("Address: "+address); 
System.out.println("Mobile Number: "+mobile); 
} 
void salary() 
{ 
da=(0.97*basic); 
hra=(0.10*basic); 
pf=(0.12*basic); 
club=(0.01*basic); 
gross=(basic+da+hra); 
net=(gross-pf-club); 
System.out.println("GROSS PAY: Rs. "+gross); 
System.out.println("NET PAY: Rs. "+net); 
} 
} 

class Programmer extends Employee 
{ 
 Programmer (int sal){ 
 basic=sal; 
 } 
} 

class TeamLead extends Employee{ 
 TeamLead(int sal){ 
  basic=sal; 
 } 
} 

class AsstProjManager extends Employee{ 
 AsstProjManager(int sal){ 
 basic=sal; 
 } 
} 
class ProjManager extends Employee{ 
 ProjManager(int sal){ 
 basic=sal; 
 } 
} 

class NewSalary 
{ 
public static void main(String args[]) 
{ 
int choice,cont; 
do 
{ 
System.out.println("PAYROLL"); 
System.out.println(" 1.PROGRAMMER \n 2.Team Leader \n 3.ASSISTANT PROJECT MANAGER \n 4.PROJECT MANAGER "); 
Scanner c = new Scanner(System.in); 
System.out.print("Enter Your Choice:"); 
choice=c.nextInt(); 
switch(choice) 
{ 
case 1: 
Programmer p=new Programmer(30000); 
p.getdata(); 
p.display(); 
p.salary(); 
break; 

case 2: 
TeamLead T=new TeamLead(40000); 
T.getdata(); 
T.display(); 
T.salary(); 
break; 

case 3: 
AsstProjManager A=new AsstProjManager(50000); 
A.getdata(); 
A.display(); 
A.salary(); 
break; 
 
case 4: 
ProjManager M=new ProjManager(70000); 
M.getdata(); 
M.display(); 
M.salary(); 
break; 
} 
System.out.print("Please enter 0 to quit and 1 to continue: "); 
cont=c.nextInt(); 
}while(cont==1); 
} 
} 
/*
Output
Vostro-260s:~$ javac NewSalary.java 
Vostro-260s:~$ java NewSalary 
PAYROLL 
 1.PROGRAMMER 
 2.Team Leader 
 3.ASSISTANT PROJECT MANAGER 
 4.PROJECT MANAGER 
Enter Your Choice:1 
Enter Name of the Employee 
Rohit 
Enter Mail id 
rohit@gmail.com 
Enter Address of the Employee: 
Ahmednagar 
Enter employee id 
1111 
Enter Mobile Number 
767657656 
Employee Name: Rohit 
Employee id : 1111 
Mail id : rohit@gmail.com 
Address: Ahmednagar 
Mobile Number: 767657656 
GROSS PAY: Rs. 62100.0 
NET PAY: Rs. 58200.0 
Please enter 0 to quit and 1 to continue: 




*/