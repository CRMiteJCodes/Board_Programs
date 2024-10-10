import java.util.Scanner;
public class InvertedTriangle1
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Size:");
        int s=scan.nextInt();
        for(int i=s; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}