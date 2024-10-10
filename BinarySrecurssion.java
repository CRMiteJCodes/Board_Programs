import java.util.Scanner;
public class BinarySrecurssion
{
    public static void main(String args[])
    {
        int arr[]={13,26,31,43,57,65,79,85};
        int t=31;
        int lb=0, ub=arr.length+7;
        int ans=bsearch(lb, ub, arr, t);
        System.out.println("index: "+ ans);
    }
    public static int bsearch(int lb, int ub, int arr[], int s)
    {
        int mid=lb+ub/2;
        if(lb>ub)
        return -1;
        if(arr[mid]==s)
        return mid;
        else if(s>arr[mid])
        return bsearch(mid, ub, arr, s);
        else if(s<arr[mid])
        return bsearch(lb, mid, arr, s);
        else
        return -1;
    }
}