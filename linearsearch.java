import java.util.*;
class Test
{
   static int linearserach(int a[],int n,int key)
{
for(int i=0;i<n;i++)
{
if(key==a[i])
{
return i;
}

}
return -1;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int key=s.nextInt();
int r=linearsearch(a,n,key);
if(r==-1)
{
System.out.println("Element is not found");
}
else
{
System.out.println("Element is found");
}
}
}


