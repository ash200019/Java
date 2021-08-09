// Program for QUICK SORT

import java.util.Scanner;

class Quick
{
    public static void main(String args[])
    {
         Data ob = new Data();
         //ob.MakeArray();
         ob.GetElements();
         ob.Display();
    }
}


class Data
{
   int a[],size,temp,i,j;
   Scanner ob = new Scanner(System.in);

   /*void MakeArray()
   {
      System.out.print("\n\tEnter the size of the list: ");
      size=ob.nextInt();
   
      if(size<=0)
      {
         System.out.print("\n\tWrong Input ");
         System.exit(0);
     }
     else
        a=new int[size];
   }*/


  void GetElements()
  {
       System.out.print("\n\tEnter the size of the list: ");
       size=ob.nextInt();

       a=new int[size];
      System.out.print("\n\tEnter the elements: ");
      for(i=0;i<a.length;i++)
     {
       System.out.print("\n\tARR["+(i+1)+"]= ");
       a[i]=ob.nextInt();
     } 
     QSORT(a,0,a.length-1);
  } 

void QSORT(int a[],int low,int high)
{
     if(low<high)
     {
        int key=low;
        int i=low;
        int j= high;
        while (i<j)
            {
               while (a[i]<=a[key] && i<high)
                               i++;
                while(a[j]>a[key]&& j>low)
                               j--;
               if(i<j)
                  {
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                  }
              }
         
         int tem=a[key];
          a[key]=a[j];
         a[j]=tem;
            
      QSORT(a,low,j-1);
      QSORT(a,j+1,high);
    }
}

void Display()
{
    System.out.print("\n\tTHe sorted list is as follows: ");
    for(i=0;i<a.length;i++)
        System.out.print("\n\tARR["+(i+1)+"]= "+a[i]);
    System.out.println();
}
}
