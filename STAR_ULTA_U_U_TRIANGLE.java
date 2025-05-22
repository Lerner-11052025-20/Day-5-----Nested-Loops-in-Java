import java.util.Scanner;

public class STAR_ULTA_U_U_TRIANGLE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        for(int i=1 ; i<=m ; i++)
        {
            // for(int j=1 ; j<=i-1 ; j++)
            // {
            //     System.out.print("  ");
            // }
            for(int k=1 ; k<=m+1-i ; k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}