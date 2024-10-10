import java.util.Scanner;
public class InvertedTriangle2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size");
        int q=scan.nextInt();
        int p=q;
        for(int i=q; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(q+" ");
                q--;
            }
            System.out.println();
            q=p;
        }
    }
}