import java.util.Scanner;
public class FunEncodeString
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=scan.nextLine();
        String n="";
        for(int i=0; i<a.length(); i++)
        {
            char ch=Character.toLowerCase(a.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='o')
            {
                n=n+'*';
            }
            else if(a.charAt(i)==' ')
            {
                n=n+'@';
            }
            else
            {
                n=n+a.charAt(i);
            }
        }
        System.out.println(n);
    }
}
   