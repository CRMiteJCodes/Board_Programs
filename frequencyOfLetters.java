import java.util.Scanner;
public class frequencyOfLetters
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine();
        int c=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                for(int j=0; j<s.length(); j++)
                {   
                    char ch1=Character.toLowerCase(s.charAt(i));
                    char ch2=Character.toLowerCase(s.charAt(j));
                    if(ch1==(ch2))
                    { 
                        c++;
                    }
                }            
                System.out.println(s.charAt(i) +" :"+c);
                c=0;
            }
        }
    }
}

        