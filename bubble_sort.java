import java.util.Scanner;
public class bubble_sort
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 elements");
        int a[]=new int[10];
        for(int i=0; i<a.length; i++)
        {
            a[i]=scan.nextInt();
        }
        
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
            
        }
    }
}