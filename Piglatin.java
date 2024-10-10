//london - ondonlay
import java.util.Scanner;
public class Piglatin
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name");
        String a=scan.nextLine();
        String bv="";
        String av="";
        int posv=0;
        for(int i=0; i<a.length(); i++)
        {
            String q=Character.toLowerCase(a.charAt(i))+"";
            if(q.equals("a") || q.equals("e") || q.equals("i") || q.equals("o") || q.equals("u"))
            {
                posv=i;
                break;           
            }
            else
            {
            bv=bv+q;
            }
        }
        av=a.substring(posv);
        String p=av+bv+"ay";
        System.out.println("pig: "+p);
    }
}