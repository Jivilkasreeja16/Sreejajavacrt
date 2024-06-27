import java.util.*;
class merge intervels
{
public static void main(String args[])
{
Scanner s=s.new Scanner(Sytem.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
     {
     a[i]=s.nextInt();
      }
      for(i=0;i<n-1;i++)
       {
          if(a[i]<a[i+1])
            {
               System.out.print(a[i]+" ");
             }
      }
      System.out.print(a[n-1]);
}
}
             

