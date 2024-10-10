import java.util.Scanner;
public class flames1
{
public static int countPairs(String s1, int n1, String s2, int n2)
{
	int freq1[]= new int[26];
	int freq2[]= new int[26];
	int i, count = 0;
	for (i = 0; i<n1; i++)
	freq1[s1.charAt(i) - 'a']++;	
	for (i = 0; i<n2; i++)
	freq2[s2.charAt(i) - 'a']++;

	// Find the count of valid pairs
	for (i = 0; i < 26; i++)
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
	int n1 = s1.length(), n2 = s2.length();
	int c=n1+n2;
	int d=(countPairs(s1, n1, s2, n2));
	int f=c-(2*d);
	System.out.println(f);
	if((f==1 || f==7) || (f==13||f==19))
	System.out.println("f");
	else if((f==2 || f==8) || (f==14||f==20))
	System.out.println("l");
	else if((f==3 || f==9) || (f==15||f==21))
	System.out.println("a");
	else if((f==4 || f==10) || (f==16||f==22))
	System.out.println("m");
	else if((f==5 || f==11) || (f==17||f==23))
	System.out.println("e");
	else if((f==6 || f==12) || (f==18||f==24))
	System.out.println("s");
}
}

