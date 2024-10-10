import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Size:");
        int s=scan.nextInt();
        for(int i=1; i<=s; i++)
        { 
            for(int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}