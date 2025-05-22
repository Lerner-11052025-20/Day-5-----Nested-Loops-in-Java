import java.util.Scanner;

public class STAR_PLUS
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int m = sc.nextInt();

        int a = (m/2)+1 ;
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=m ; j++)
            {
                if(i==a || j==a)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}