import java.util.Scanner;
public class RollaDice
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        char ch;
        do
        {
            System.out.println("o to roll");
            System.out.println("x to exit");
            ch=scan.next().charAt(0);
            switch(ch)
            {
                case 'o':
                int n=(int)(6*Math.random()+1);
                System.out.println(n);
                break;
                case'x':
                System.out.println("******Exit*****");
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!='x');
    }
}