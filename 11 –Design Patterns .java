
import java.util.Scanner; 

interface PaymentProcessor 
{ 
 void pay(int amount); 
} 

class CreditCard implements PaymentProcessor 
{ 
  Scanner sc =new Scanner (System.in); 
  String name,ExpDate; 
  double CardNo; 
  
  CreditCard() 
  { 
   super(); 
   System.out.println("--------------------------------------------------"); 
   System.out.print("\tCard holder Name :: "); 
   this.name =sc.next(); 
   System.out.print("\tCard Number :: "); 
   this.CardNo =sc.nextDouble(); 
   System.out.print("\tCard Expire Date :: "); 
   this.ExpDate =sc.next(); 
   System.out.println("--------------------------------------------------"); 
  } 
	  
  @Override 
  public void pay(int amount) 
   { 	 
     System.out.println("---------------------------------------------------"); 
     System.out.println("Paying through CreditCard payment: Charging $"+amount);         
     System.out.println("----------------------------------------------------"); 
  } 
} 

class PayPal implements PaymentProcessor 
 { 
	PayPal() 
	{ 
	  super(); 
	   System.out.println("\nChecking Internet Connection........");  
	} 
	   
	@Override 
	 public void pay(int amount) 
	 { 
	  System.out.println("----------------------------------------------"); 
	  System.out.println("Paying through PayPal payment: Charging Rs." + amount); 
	  System.out.println("----------------------------------------------"); 
	 } 
} 

class BitCoin implements PaymentProcessor 
{ 
  Scanner sc =new Scanner (System.in); 
  String add; 
	   
  BitCoin() 
  { 
   super(); 
   System.out.print("\nEnter Transaction 'Input Address' :: "); 
   add= sc.next();  
  } 
  @Override 
   public void pay(int amount) 
   { 
    System.out.println("---------------------------------------------------"); 
    System.out.println("Paying through BitCoin payment: Charging Rs." + amount); 
    System.out.println("----------------------------------------------------"); 
   } 
} 
class Order 
{ 
  private final PaymentProcessor paymentProcessor; 
  private final int amount; 
  public Order(int amount, PaymentProcessor paymentProcessor) 
  { 
    this.amount = amount; 
    this.paymentProcessor = paymentProcessor; 
  } 
	   
  public void process() 
  { 
    paymentProcessor.pay(amount); 
  } 

} 
public class Main_11 
{ 
 public static void main(String[] args) 
 { 
  int c,amt=0; 
  Order order; 
  Scanner sc = new Scanner(System.in); 
  while(true) 
  { 
   System.out.println(); 
   System.out.println("**** SHOPING CART ****"); 
   System.out.print("1.Credit Card \n2.PayPal \n3.BitCoin \n4.Exit"); 
   System.out.print("\n\nEnter the Choice ::"); 
   c=sc.nextInt(); 
   System.out.println("------------------------------------------------------"); 
   if(c==1||c==2||c==3) 
   { 
     System.out.print("\nEnter amount tobe Tranfer :: "); 
     amt = sc.nextInt(); 
     System.out.println("-----------------------------------------------------"); 
   } 
			 
  switch(c) 
  { 
      case 1: 
	 order = new Order(amt, new CreditCard()); 
	 order.process(); 
	 break; 
				 
      case 2: 
        order = new Order(amt, new PayPal()); 
	order.process(); 
				 
      case 3: 
	order = new Order(amt, new BitCoin()); 
	order.process(); 
	break; 
				 
      case 4: 
	System.out.println("\nThank you For Shopping !!!! "); 
	System.out.println("----------------------------------------------------"); 
	return; 
	 
      default: 
	System.out.println("Invalid Payment Mode !!!"); 
	System.out.println("-----------------------------------------------------"); 
	 
       } 
     } 
   } 
} 



/*
Output
Vostro-260s:~$ javac Main_11.java 
Vostro-260s:~$ java Main_11 

**** SHOPING CART **** 
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 

Enter the Choice ::1 
------------------------------------------------------ 

Enter amount tobe Tranfer :: 10000 
----------------------------------------------------- 
-------------------------------------------------- 
	Card holder Name :: Ramesh 
	Card Number :: 12334 
	Card Expire Date :: 1/25 
-------------------------------------------------- 
--------------------------------------------------- 
Paying through CreditCard payment: Charging $10000 
---------------------------------------------------- 

**** SHOPING CART **** 
1.Credit Card 
2.PayPal 
3.BitCoin 
*/