Program 1:

import java.util.Scanner;
public class Program_1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Input a string: ");
String str=sc.nextLine();
System.out.println("The middle character in the string is: " +middle(str));
}
public static String middle(String str)
{
int len=str.length();
if(str.length()%2==0)
{
return str.charAt((len/2)-1)+ " ";
}
else
{
	return str.charAt(len/2)+ " ";
}
}
}

Program 2:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic
{
public int add(int a,int b)
{
int sum=a+b;
return sum;
}
}
class Adder extends Arithmetic
{
public int callAdd(int a,int b)
{
return add(a,b);
}
}
public class Solution 
{
public static void main(String[] args)
{
Adder a=new Adder();
System.out.println("My superclass is: " +a.getClass().getSuperclass().getName());
System.out.print(a.add(10,32)+ " " +a.add(10,3) + " " +a.add(10,10));
}
}

Program 3:

Member inner class cannot have static member in them.


Program 4:

3131
3131
3131

Program 5:
new ABC().new XYZ().i

Program 6:

class Student
{
private String stdName;
private int stdRollNo;
private int stdId;
public String getStdName()
{
return stdName;
}
public int getStdRollNo()
{
	return stdRollNo;
}
public int getStdId()
{
	return stdId;
}
public void setStdName(String name)
{
	stdName=name;
}
public void setStdRollNo(int rollNo)
{
	stdRollNo=rollNo;
}
public void setStdId(int id)
{
	stdId=id;
}
}
public class EncapTest
{
public static void main(String[] args)
{
Student ob=new Student();
ob.setStdName("Jeegyasa");
ob.setStdRollNo(12);
ob.setStdId(901);
System.out.println("Student Name: " +ob.getStdName());
System.out.println("Student rollno: " +ob.getStdRollNo());
System.out.println("Student id: " +ob.getStdId());
}}