import java.util.Scanner;
class Triangle2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the start number");
        int a=scan.nextInt();
        int s=a;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(a);
                a=a-2;
            }
            a=s;
            System.out.println();
        }
    }
}