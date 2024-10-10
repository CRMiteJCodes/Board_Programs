import java.util.Scanner;
public class binary_search
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
        System.out.println("Enter the search element");
        int s =scan.nextInt();
        int lb=0;
        int ub=a.length-1; 
        int mid=0;
        int index=-1;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(s==a[mid])
            {
            index=mid; break;
            }
            else if(s>a[mid]){
            lb=mid+1;}
            
            else{
            ub=mid-1;}
        }
        if(index!=-1)
        System.out.println("Search ele");
        else
        System.out.println("lol");;
    }
}
