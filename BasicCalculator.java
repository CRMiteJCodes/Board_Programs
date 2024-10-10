//Ex: 45/32*54-78+92
//give no space
import java.util.Scanner;
public class BasicCalculator
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a equation with 2 digit nos");
        String E=scan.nextLine();
        int n=0, c=0;
        for(int i=0; i<E.length(); i++)
        {
            char ch=E.charAt(i);
            if(Character.isDigit(ch))
            n++;
        }
        c=E.length()-n;
        int num[]=new int[n];
        char op[]=new char[c];
        int x=0, y=0;
        int a=0;
        String b="";
        for(int i=0; i<E.length()-1; i++)
        {           
            char ch=E.charAt(i);
            char ch1=E.charAt(i+1);
            if(Character.isDigit(ch) && Character.isDigit(ch1))
            {
                b+=ch+""+ch1;
                a=Integer.parseInt(b);
                num[x++]=a;
            }
            b="";
        }
        for(int i=0; i<E.length(); i++)
        {
            if (!Character.isDigit(E.charAt(i)))
            {
                op[y++]=E.charAt(i);
            }
        }
        for(int i=0; i<x; i++)
        System.out.println("Numbers: "+num[i]);
        for(int i=0; i<y; i++)
        System.out.println("Operators: "+op[i]);
        double ans = num[0];
        for (int i=0; i<c; i++) 
        {
            switch (op[i]) 
            {
                case '+':
                ans += num[i+1];
                break;
                case '-':
                ans-= num[i+1];
                break;
                case '*':
                ans*= num[i+1];
                break;
                case '/':
                ans/= num[i+1];
                break;
                default:
                System.out.println("Invalid Operator found!!");
            }
        }
        System.out.println("Final Answer: "+E+" = "+ ans);
    }
}
