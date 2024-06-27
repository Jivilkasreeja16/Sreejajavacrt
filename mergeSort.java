import java.util.*;
class mergeSort
{
   public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int a[]=new int[m];
    for(int i=0;i<m;i++)
    {
        a[i]=s.nextInt();
    }
    int n=s.nextInt();
    int b[]=new int[n];
    for(int j=0;j<n;j++)
    {
        b[j]=s.nextInt();
    }
    int c[]=new int[m+n];
     int i=0;j=0;k=0;
     while(i<m && j<n)
     {
        if(a[i]<b[j])
         {
             c[k]=a[i];
              i++;
                 k++;
           }
        else
        {
             c[k]=b[j];
                 j++;
                 k++;
           }
        }
     while(i<m)
     {
        c[k]=a[i];
          k++;
             i++;
      }
     while(j<n)
       {
         c[k]=b[j];
         k++;
         j++;
       }
      for(i=0;i<k;i++)
{
      System.out.print(c[i]+" ");
    
}
}
}



