import java.util.Scanner;
public class Trib_Fib_onacci
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ch=0;
        do
        {
            System.out.println("1.Fibbonacci");
            System.out.println("3.Tribonacci");
            System.out.println("Enter your choice");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the limit");
                int l=scan.nextInt();
                int f1=-1, f2=0;
                System.out.print(f1+" "+f2);
                for(int i=1; i<=l-2; i++)
                {
                    int sum=f1+f1;
                    System.out.print(" "+sum);
                    f1=f2;
                    f2=sum;
                }
                System.out.println();
                break;
                case 2:
                System.out.println("Enter the limit");
                int l1=scan.nextInt();
                int t1=-1, t2=0, t3=1;
                System.out.print(t3+" "+t2+" "+t3);
                for(int i=1; i<=l1-3; i++)
                {
                    int sum=t1+t2+t3;
                    System.out.print(" "+sum);
                    t1=t2; t2=t3; t3=sum;
                }
                System.out.println();
                break;
                case 3:
                System.out.println("Exit");
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!=3);
    }
}