import java.io.*;
class StudentRecords1
{
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public void addRecords() throws IOException
 {
 // Create or Modify a file for Database
 PrintWriter pw = new PrintWriter(new BufferedWriter(new
 FileWriter("SRecords.txt",true)));
 String name, Class, address,StudID;
 int RollNo,marks;
 long telephoneNo;
 String s;
 boolean addMore = false;
 // Read Data
 do
 {
  System.out.print("\nEnter Student ID: ");
  StudID = br.readLine();
  
  System.out.print("\nEnter Name of Student: ");
  name = br.readLine();

  System.out.print("Roll No: ");
  RollNo = Integer.parseInt(br.readLine());
  
  System.out.print("Class: ");
  Class = br.readLine();

  System.out.print("Marks: ");
  marks = Integer.parseInt(br.readLine());

  System.out.print("Address: ");
  address = br.readLine();

  System.out.print("Telephone No.: ");
  telephoneNo = Long.parseLong(br.readLine());
  
  // Print to File
  pw.println(StudID);
  pw.println(name);
  pw.println(RollNo);
  pw.println(Class);
  pw.println(marks);
  pw.println(address);
  pw.println(telephoneNo);
  
  System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : ");
  s = br.readLine();
  if(s.equalsIgnoreCase("y"))
  {
   addMore = true;
   System.out.println();
  }
  else
   addMore = false;
 }
 while(addMore);
 pw.close();
 showMenu();
 }
 public void readRecords() throws IOException
 {
 try
 {
  // Open the file
  BufferedReader file = new BufferedReader(new FileReader("SRecords.txt"));
  String name;
  int i=1;
  // Read records from the file
  while((name = file.readLine()) != null)
  {
   System.out.println("S.No. : " +(i++));
   System.out.println("-------------");
   System.out.println("\nName: " +name);
   System.out.println("Student_id"+file.readLine());
   System.out.println("Roll No: "+file.readLine());
   System.out.println("Class: "+file.readLine());
   System.out.println("Marks: "+file.readLine());
   System.out.println("Address: "+file.readLine());
   System.out.println("Tel. No.: "+Long.parseLong(file.readLine()));
   System.out.println();
  }
  file.close();
  showMenu();
 }
 catch(FileNotFoundException e)
 {
  System.out.println("\nERROR : File not Found !!!");
 }
 }
 public void clear() throws IOException
 {
 // Create a blank file
 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("SRecords.txt")));
 pw.close();
 System.out.println("\nAll Records cleared successfully !");
 for(int i=0;i<999999999;i++); // Wait for some time
 showMenu();
 }
 public void showMenu() throws IOException
 {
 System.out.print("1 : Add Records\n2 : Display Records\n3 : Clear All Records\n4 : Exit\n\n Enter Your Choice : ");
 int choice = Integer.parseInt(br.readLine());
 switch(choice)
 {
  case 1:
   addRecords();
   break;
  case 2:
   readRecords();
   break;
  case 3:
   clear();
   break;
  case 4:
   System.exit(1);
   break;
  default:
   System.out.println("\nInvalid Choice !");
   break;
 }
 }
 public static void main(String args[]) throws IOException
 {
 StudentRecords1 call = new StudentRecords1();
 call.showMenu();
 }
}
/*
//Output

aarti@aarti-Vostro-260s:~$ javac StudentRecords1.java 
aarti@aarti-Vostro-260s:~$ java StudentRecords1
1 : Add Records
2 : Display Records
3 : Clear All Records
4 : Exit

 Enter Your Choice : 1

Enter Student ID: pdvvp101 
Enter Name of Student: Aditya Sanjay Patil
Roll No: 1
Class: SE
Marks: 85
Address: Savedi ,Ahmednagar
Telephone No.: 123456789

Records added successfully !

Do you want to add more records ? (y/n) : n
1 : Add Records
2 : Display Records
3 : Clear All Records
4 : Exit

 Enter Your Choice : 2

S.No. :1
-------------
Name: pdvvp101
Student_id: Aditya Sanjay Patil
Roll No: 1
Class: SE
Marks: 85
Address: Savedi ,Ahmednagar
Tel. No.: 123456789

1 : Add Records
2 : Display Records
3 : Clear All Records
4 : Exit

 Enter Your Choice : 4
*/