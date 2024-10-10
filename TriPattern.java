import java.util.Scanner;
public class TriPattern
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size");
        int s=scan.nextInt();
        System.out.println();
        for(int i=s; i>=1; i--)
        {
            for(int j=i; j<=s; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}