import java.util.Scanner;
public class ArrayName_Sort
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of words in the array ");
        int size=scan.nextInt();
        scan.nextLine();  // Consume leftover newline after nextInt() because nextInt() doesn't read the newline, which would cause nextLine() to skip input.
        String a[]=new String[size];
        System.out.println("Enter "+a.length+" words: ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=scan.nextLine();
        }
        //sort
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1])>0)
                {
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted: ");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Enter a name to search");
        String s=scan.nextLine();
        int index=-1;
        int lb=0;
        int ub=size-1;
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(a[mid].equalsIgnoreCase(s))
            {
                index=mid;
                break;
            }
            else if(s.compareToIgnoreCase(a[mid])>0)
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }
        if(index>-1)
        {
            System.out.println("Element found at "+ (index+1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
