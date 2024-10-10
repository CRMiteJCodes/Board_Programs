import java.util.Scanner;
public class DoubleLetterWords
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=scan.nextLine();
        int b=0;
        for(int i=0; i<a.length()-1; i++)
        {
            if(a.charAt(i)==(a.charAt(i+1)))
            {
                b++;
                System.out.println(a.charAt(i)+""+a.charAt(i+1));
            }
        }
        System.out.println("No of double letter words "+b);
    }
}
