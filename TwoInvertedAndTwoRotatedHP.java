import java.util.Scanner;

public class TwoInvertedAndTwoRotatedHP
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i-1 ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=n+1-i ; j++)  // maximum star thi starting thay chhe n+1-i aave j 
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}