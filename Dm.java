import java.util.Scanner;
public class Dm
{
    public static void print(int size,int a[])
    {   
        int k = 0;
        
        int[][]dm3 = new int[size][size];
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                 if(i == j) {
                    dm3[i][j] = a[k++];
                    System.out.print(dm3[i][j]+" ");
                }
                 else System.out.print("0"+" ");
            }
            System.out.println();
        }

        }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements of 1st matrix : ");
        int[][]dm = new int[size][size];
        for(int i = 0 ; i < size ; i++)
            for(int j = 0 ; j < size ; j++)
                if(i == j)dm[i][j] = sc.nextInt();
        System.out.println("Enter elements of 2nd matrix : ");
        int[][]dm2 = new int[size][size];
        for(int i = 0 ; i < size ; i++)
            for(int j = 0 ; j < size ; j++)
                if(i == j)dm2[i][j] = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        int c[] = new int[size];
        int d[] = new int[size];   
        int e[] = new int[size];
        int f[] = new int[size];
                
        for(int i = 0 ;i < size ; i++)
            a[i] = dm[i][i];
        for(int i = 0 ;i < size ; i++)
            b[i] = dm2[i][i];
        System.out.println("Matrix1: ");
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.print(dm[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix2: ");
         for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.print(dm2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("One doiamentional Array : ");
        for(int i = 0 ; i < size ; i++)
            System.out.println(a[i] + " ");
        System.out.println();
        System.out.println("One doiamentional Array : ");
        for(int i = 0 ; i < size ; i++)
            System.out.println(b[i] + " ");
        System.out.println();
        System.out.println("The sum of the corresponding arrays : ");
         
        
        //Sum of matrix
        for(int i = 0 ; i < size ; i++)
        {
            c[i] = a[i] + b[i];
        }
        
           for(int i = 0 ; i < size ; i++)
        {
            d[i] = a[i] - b[i];
        }
        
         for(int i = 0 ; i < size ; i++)
        {
            e[i] = a[i] * b[i];
        }
      
        for(int i = 0 ; i < size ; i++)
            System.out.print(c[i] + " ");
        System.out.println();

        System.out.println("Sum Matrix : ");
        print(size , c);
        
        System.out.println("sub Matrix : ");
        print(size , d);

        System.out.println("product Matrix : ");
        print(size , e);
 

    }
}
