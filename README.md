# 1BM18CS044-JAVA1
FIBONACCI SERIES

import java.util.*;
class Fibnocci
{
public static void main(String args[])
{
System.out.println("enter number of terms in the series");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i;
int a=0;
int b=1;
if(n==1)
{
System.out.println(a);
}
else
if(n==2)
{
System.out.println(a);
System.out.println(b);
}
else
System.out.println(a);
System.out.println(b);
for(i=2;i<n;i++)
{
int c=a+b;
a=b;
b=c;
System.out.println(c);

}
}
}
