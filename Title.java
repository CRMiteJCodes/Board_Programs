import java.util.Scanner;
public class Title
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a title");
        String a=scan.nextLine();
        String n="";
        for(int i=0; i<a.length(); i++)
        {
        if(i==0 || a.charAt(i-1)==' ')
        {
            n+=Character.toUpperCase(a.charAt(i));
        }
        else
        {
            n+=Character.toLowerCase(a.charAt(i));
        }
        }
        System.out.println("New Sentence: "+n);
    }
}