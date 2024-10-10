import java.util.Scanner;
public class ReverseWords
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine()+" ";
        String wd="", res="", f="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
             wd=wd+ch;
            }
            else
            {
                for(int j=0; j<wd.length(); j++)
                res=wd.charAt(j)+res;
                f=f+res+" ";
                res="";
                wd="";
            }
        }
        System.out.println(f);        
    }
}