import  java.util.Scanner; 
abstract class Publication 
{ 
String title; 
float price; 
int copies; 
abstract void setprice(); 
abstract void salecopy(); 
} 
class Book extends Publication 
{ 
String author; 
void ordercopies() 
{ 
} 
public void salecopy() 
{ 
System.out.println("name of book:"+title); 
System.out.println("name of author:"+author); 
System.out.println("price of book:"+price); 
System.out.println("number of copies:"+copies); 
System.out.println("total sale="+copies*price); 
} 
public void setprice() 
{ 
Scanner  sc=new Scanner(System.in); 
System.out.println("enter the name of book "); 
title=sc.next(); 
System.out.println("enter the name of author "); 
author=sc.next(); 
System.out.println("enter price "); 
price=sc.nextInt(); 
System.out.println("enter copies "); 
copies=sc.nextInt(); 
} 
} 
class Magzine extends Publication 
{ 
int quantity; 
String currentIssue; 
public void salecopy() 
{ 
System.out.println("name of magzine "+title); 
System.out.println("Price of magzine "+price); 
} 
 public void setprice() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("enter name of magzine "); 
title=sc.next(); 
System.out.println("order quantity"); 
quantity=sc.nextInt(); 
System.out.println("price of magzine  "); 
price=sc.nextInt(); 
System.out.println("enter number of copies  "); 
copies=sc.nextInt(); 
} 
public void receiveIssue() 
{ 
System.out.println(" enter currentIssue "); 
Scanner sc=new Scanner(System.in); 
currentIssue=sc.next(); 
System.out.println("you will receive" +currentIssue+ "soon"); 
} 
} 
class Polymorphism 
{ 
public static void main(String args[]) 
{ 
Book b=new Book(); 
b.setprice(); 
b.salecopy(); 
Magzine m=new Magzine(); 
m.setprice(); 
m.salecopy(); 
m.receiveIssue(); 
} 
} 






















/*
Output

Vostro-260s:~$ javac Polymorphism.java 
Vostro-260s:~$ java Polymorphism 
enter the name of book 
c++ 
enter the name of author 
Balaguruswamy 
enter price 
300 
enter copies 
10 
name of book:c++ 
name of author:Balaguruswamy 
price of book:300.0 
number of copies:10 
total sale=3000.0 
enter name of magzine 
Sciencedirect 
order quantity 
10 
price of magzine 
200 
enter number of copies 
10 
name of magzine Sciencedirect 
Price of magzine 200.0 
 enter currentIssue 
hello 
you will receive hello soon 

*/