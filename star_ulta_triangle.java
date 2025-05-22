import java.util.Scanner;

public class star_ulta_triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        //  first methodology
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=m ; j>=i ; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("*************NEW METHOD***************");
        //  second methidology
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=m+1-i ; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}