import java.util.Scanner;

public class HalfPyramid
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 65; // or 'A';
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(ch); // ch || * || j(1 12 123 1234 12345)
                ch++;
            }
            System.out.println();
        }

    }
}