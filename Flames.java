//cancel same letters from both names and count number of letters remaining
import java.util.Scanner;
public class Flames
{
    public static int countPairs(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        int count = 0;
        for (int i = 0; i<s1.length(); i++)
        freq1[s1.charAt(i) - 'a']++;    
        for (int i = 0; i<s2.length(); i++)
        freq2[s2.charAt(i) - 'a']++;
        // Find the count of valid pairs
        for (int i = 0; i < 26; i++)
        count += (Math.min(freq1[i], freq2[i]));
        return count;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st name");
	String s1 =scan.nextLine();
	scan=new Scanner(System.in);
	System.out.println("Enter 2nd name");
	String s2 =scan.nextLine();
	int n1=s1.length(), n2=s2.length();
	int c=n1+n2;
	int d=(countPairs(s1,s2));
	int f=c-(2*d);
	System.out.println(f);
        switch (f % 6) 
        {
            case 1:
                System.out.println("f");
                break;
            case 2:
                System.out.println("l");
                break;
            case 3:
                System.out.println("a");
                break;
            case 4:
                System.out.println("m");
                break;
            case 5:
                System.out.println("e");
                break;
            case 0:
                System.out.println("s");
            break;
        }
    }
}

