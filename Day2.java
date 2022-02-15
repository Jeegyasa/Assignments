Program 1:

import java.util.Scanner;
class leap_year{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter the year");
				int year=sc.nextInt();
				if(((year%4==0) && (year%100!=0)) || (year%400==0))
						System.out.println("Year is leap");
				else
						System.out.println("Year is not leap");
		}
}

Program 2:

import java.util.Scanner;
class alphabet{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter any value");
				char c =sc.next().charAt(0);
				String str=(c>='a' && c<='z') || (c>='A' && c<='Z') 
							? c+" is an alphabet" 
							: c+" is not an alphabet";
				System.out.println(str);
		}
}

Program 3:

import java.util.Scanner;
import java.io.*;
class CI{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter principal");
				double p=sc.nextDouble();
				System.out.println("Enter rate");
				double r=sc.nextDouble();
				System.out.println("Enter time");
				double t=sc.nextDouble();
				double ci=p*(Math.pow((1+r/100),t));
				System.out.println("Principal: " +p);
				System.out.println("Rate: " +r);
				System.out.println("Time: " +t);
				System.out.println("Compound Interest is: " +ci);
		}
}

Program 4:

import java.util.Scanner;
class maximum{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
				System.out.println("Enter third number");
				int c=sc.nextInt();
				if((a>=b && a>=c))
						System.out.println(a+ " is maximum.");
				elseif(b>=a && b>=c)
						System.out.println(b+ " is maximum");
				else
						System.out.println(c+ " is maximum");
		}
}

Program 5:

import java.util.Scanner;
class program_5{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter any character");
				char c=sc.next().charAt(0);
				if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				{
					if(c>='a' && c<='z') 
						System.out.println( c+ " is lowecase");
					else if(c>='A' && c<='Z')
						System.out.println(c+ " is an uppercase");
				}
				else
					System.out.println("Special case....Enter character between A to Z");
		}
}

Program 6:

import java.util.Scanner;
import java.io.*;
class program_6{
		public static void main(String[] args){
			double r1=0,r2=0;
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
				double a=sc.nextDouble();
				System.out.println("Enter second number");
				double b=sc.nextDouble();
				System.out.println("Enter third number");
				double c=sc.nextDouble();
				double d=(b*b)-(4*a*c);
				double sqrt=Math.sqrt(d);
				if(d>0)
				{
					r1=(-b+sqrt)/(2*a);
					r2=(-b-sqrt)/(2*a);
						System.out.println("Roots are: " +r1+ " and " +r2);
				}
				else if(d==0)
						System.out.println("Root is: " +(-b+sqrt)/(2*a));
		}
}

Program 7:

import java.util.Scanner;
import java.io.*;
class program_7{
		public static void main(String[] args){
			double r1=0,r2=0;
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
				int n=sc.nextInt();
				System.out.println("Prime factors of " +n+ " are: ");
				for(int i=2;i<n;i++)
				{
					while(n%i==0)
					{
						System.out.println(i+ " ");
						n=n/i;
					}
				}
			    if(n>2)
						System.out.print(n);
		}
}

Program 8:

import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
	static boolean isArmstrong(int i){
        int n, count = 0,temp,r,sum = 0;
			temp=i;
			while(temp!=0)
			{
				temp=temp/10;
				count=count+1;
			}
			temp=i;
            while(temp > 0)
            {
                r= temp % 10;
                sum = sum + (int)(Math.pow(r,count));
                temp=temp/ 10;
            }
            if(sum == i)
            {
				return true;
            }
            else
			{
				return false;
			}
        }
	public static void main(String[] args) 
    {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit");
		n=sc.nextInt();
        System.out.print("Armstrong numbers from 1 to " +n+ " are: ");
        for(int i = 1; i <=n; i++)
        {
			if(isArmstrong(i))
				System.out.print(i+ " ");
		}
    }
}

Program 9:

import java.io.*;
import java.util.Scanner;
class program9 {
    static int hexadecimalToDecimal(String hexVal)
    {
        int len = hexVal.length();
        int base = 1;
 
        int d = 0;
 
        for (int i = len - 1; i >= 0; i--) {

            if (hexVal.charAt(i) >= '0'
                && hexVal.charAt(i) <= '9') {
                d+= (hexVal.charAt(i) - 48) * base;
                base = base * 16;
            }
 
            else if (hexVal.charAt(i) >= 'A'
                     && hexVal.charAt(i) <= 'F') {
                d+= (hexVal.charAt(i) - 55) * base;
                base = base * 16;
            }
        }
        return d;
    }
 
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
        String str=sc.nextLine();
		String hex="";
		hex=hex.toUpperCase();
        System.out.println(hexadecimalToDecimal(hex));
    }
}

Program 10:

import java.util.Scanner;
 
public class program10
{
    static int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
 
    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y;
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
		System.out.println("Enter second number: ");
        int b = input.nextInt();
 
        System.out.println("The GCD of two numbers is: " + gcd(a,b));
        System.out.println("The LCM of two numbers is: " + lcm(a,b));
    }
}

Program 11:

import java.util.Scanner;
import java.io.*;

public class program11
{
public static void main(String[] args)
{
    double a, b, c;
    double root1, root2, imaginary;
    double d;
	int flag=0;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): ");
	System.out.println("Enter value of a:");
    a=sc.nextDouble();
	System.out.println("Enter value of b:");
    b=sc.nextDouble();
	System.out.println("Enter value of c:");
    c=sc.nextDouble();

    d= (b * b) - (4 * a * c);
	if(d>0)
	{
		flag=1;
	}
	else if(d==0)
	{
		flag=2;
	}
	else{
		flag=3;
	}
    switch(flag)
    {
        case 1: 
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two distinct and real roots exists:" + root1+ " " +root2);
            break;

        case 3:
                    root1 = root2 = -b / (2 * a);
                    imaginary = Math.sqrt(-d) / (2 * a);

                    System.out.println("Two distinct complex roots exists: root 1= "+root1+ " and image 1= " +imaginary);
					System.out.println("Root 2= " +root2+" and image 2= "+imaginary);
                    break;

        case 2:
                    root1 = root2 = -b / (2 * a);

                    System.out.println("Two equal and real roots exists:" + root1+ " " +root2);

                    break;
    
    }
	}
}

Program 12:

import java.util.Scanner;
import java.util.*;
public class program12{
	public static void main(String[] args){
		
		int n,j=0;
		int[] a=new int[100];
		int arr[]=new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
		 	a[i]=sc.nextInt();
		}
		
		System.out.print("Original array is :");
		for(int i=0;i<n;i++)
		{
		 	System.out.print(a[i]+ " ");
		}
		
		for(int i=0;i<n;i++)
		{
				arr[j]=a[i];
				j++;
		}
		System.out.println("Array containing elements of first array is :");
		for(int i=0;i<(j-1);i++)
		{
			System.out.print(arr[i]+",");
		}
		
	}		
}

Program 13:

import java.util.Scanner;
public class program13
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n,pos;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
 
     
 System.out.println("Enter the position of the number which is to be deleted");
 pos = sc.nextInt();
    
 for(i=pos;i<n-1;i++)
     	{
         a[i]=a[i+1];
     }
     n=n-1;
     
 System.out.println("\nOn deleting new array we get is\n");
     for(i=0;i<n;i++) 
     {
         System.out.println("a["+i+"] = "+a[i]);
     }
 }
}


Program 14:

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class program14{
	public static void main(String[] args){
		
		int[] a=new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
		 	a[i]=sc.nextInt();
		}
		System.out.println("Original array is :");
		for(int i=0;i<n;i++)
		{
		 	System.out.print(a[i]+ " ");
		}
		int m=0;
		for(int i=0;i<n;i++)
		{
			m=Math.max(m,a[i]);
		}
		int f[]=new int[m+1];
		for(int i=0;i<m+1;i++)
		{
			f[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			f[a[i]]++;
		}
		System.out.println("After removing duplicate elements:");
		for(int i=0;i<m+1;i++)
		{
			if(f[i]>0)
			{
				System.out.print(i+" ");
			}
		}
		
	}		

}

Program 15:

import java.util.Scanner;
import java.util.*;
public class program15{
	public static void main(String[] args){
		
		int n,j=0,k=0;
		int[] a=new int[100];
		int odd[]=new int[100];
		int even[]=new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
		 	a[i]=sc.nextInt();
		}
		
		System.out.println("Original array is :");
		for(int i=0;i<n;i++)
		{
		 	System.out.print(a[i]+ " ");
		}
		for(int i=0;i<n;i++)
		{
		 	if(a[i]%2!=0)
			{
				odd[j]=a[i];
				j++;
			}
			else
			{
				even[k]=a[i];
				k++;
			}
		}
		System.out.println("Array containing odd elements is :");
		if(j>1)
		{
		for(int i=0;i<(j-1);i++)
		{
			System.out.println(odd[i]+",");
		}
		System.out.println(odd[j-1]+",");
		}
		else
		{
			System.out.println("No number");
		}
		System.out.println("Array containing even elements is :");
		if(k>1)
		{
		for(int i=0;i<(k-1);i++)
		{
			System.out.println(even[i]+",");
		}
		System.out.println(even[j-1]+",");
		}
		else
		{
			System.out.println("No number");
		}
	}		
}

Program 16:

import java.util.Scanner;
import java.util.*;
public class program16{
	public static void main(String[] args){
		
		int[] arr=new int[10];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
		 	arr[i]=sc.nextInt();
		}
		
		System.out.print("Original array is :");
		for(int i=0;i<n;i++)
		{
		 	System.out.print(arr[i]+ " ");
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("");
		System.out.print("Array in descending order is:");
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+ " ");
		}
	}		
}

Program 17:

import java.util.Scanner;
import java.util.*;
public class program17{
	public static void main(String[] args){
		
		String str2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
		{
			System.out.println("String " +str+ " is palindrome");
		}
		else
		{
			System.out.println("String " +str+ " is not palindrome");
		}
	}		
}

Program 18:

import java.util.Scanner;
import java.util.*;
public class program18{
	public static void main(String[] args){
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();

		int freq[]=new int[str.length()];
		char maxChar=str.charAt(0);
		int max;
		char a[]=str.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<a.length;j++){
		 	if((a[i]==a[j]) && (a[i]!=' ') && (a[i]!='0'))
			{
				freq[i]++;
				a[j]='0';
			}
			}
		}
		max=freq[0];
		for(int i=0;i<freq.length;i++)
		{
			if(max<freq[i])
			{
				max=freq[i];
				maxChar=a[i];
			}
		}
		System.out.println("Maximum frequency character is:" +maxChar);
		
	}		
}

Program 19:

import java.util.Scanner;
import java.util.*;
public class program19{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int a[]=new int[100];
		int r=0;
		while(num>0){
			r=num%10;
			a[r]++;
			num=num/10;
		}
		for(int i=0;i<a.length;i++)
		{
			int count=a[i];
			if(count!=0){
				System.out.println(i+ " occurs " +count +" times");
			}
		}
		
	}		
}

Program 20:

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
public class program_20{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		int left,right=a.length-1;
		for(left=0;left<right;left++,right--)
		{
			char temp=a[left];
			a[left]=a[right];
			a[right]=temp;
		}
		for(int ch=0;ch<a.length;ch++)
		{
			if((ch==0 && a[ch]!=' ') || (a[ch]!=' ' && a[ch-1]==' '))
			{
				if(a[ch]>='a' && a[ch]<='z')
				{
					a[ch]=(char)((int)a[ch]-32);
				}
			}
		}
		String str2=new String(a);
		System.out.println(str2);
		
	}		
}