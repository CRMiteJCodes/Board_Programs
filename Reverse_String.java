import java.util.Scanner;
public class Reverse_String
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=scan.nextLine();
        String rev="";
        for( int i=0; i<a.length(); i++)
        {
            rev=a.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}