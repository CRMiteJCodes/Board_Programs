import java.util.Scanner;
public class ArrayBinarytoDecimal
{
    int b;
    public int BtoD(int d, int i) 
    {
        if (d!=0) 
        {
            int r=d%10;
            b=b+r*(int)Math.pow(2,i++);
            return BtoD(d/10,i);
        }
        else
        return b;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row size");
        int r=scan.nextInt();
        System.out.println("Enter the column size");
        int c=scan.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Array elements with 0 And 1");
        int k=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(k>0)
                break;
                arr[i][j]=scan.nextInt();
                int m=arr[i][j];
                if(!(m==0 || m==1))
                {
                System.out.println("Only 0 and 1");
                k++;
                break;
                }
            }
        }
        if(k==0)
        {
        System.out.println("Original array:");
        int B[]=new int[r];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                B[i]=B[i]*10+arr[i][j];
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        ArrayBinarytoDecimal C=new ArrayBinarytoDecimal();
        System.out.println("Binary\tDecimal");
        for(int i=0; i<B.length; i++)
        {
            int m=B[i];
            System.out.println(m+"\t"+(C.BtoD(m,0)));
        }
        }
    }
}