import java.util.Scanner;

public class FLOYD_ULTA_TRIANGLE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
    
        int a=1;
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=m+1-i ; j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.print("\n");
        }
    }
}
