import java.util.Scanner;
public class UniqueDigits {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        int t = a;
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (t != 0) {
            int b = t % 10; 
            arr[b]++;
            t = t / 10;
        }
        boolean isUnique = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) { // If any digit appears more than once
                System.out.println("Not Unique");
                isUnique = false; 
                break; 
            }
        }
        if (isUnique) {
            System.out.println("Unique");
        }
    }
}
