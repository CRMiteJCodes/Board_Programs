import java.util.Scanner;
public class BoxAndPyramid 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Box");
            System.out.println("2. Triangle");
            System.out.println("3. Exit");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter number of rows:");
                    int r = scan.nextInt();
                    System.out.println("Enter number of columns:");
                    int c = scan.nextInt();
                    for (int i = 1; i <= r; i++) 
                    {
                        for (int j = 1; j <= c; j++) 
                        {
                            if (i == 1 || i == r || j == 1 || j == c)
                            {
                                System.out.print("$ ");
                            } else {
                                System.out.print("  "); 
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Enter height:");
                    int h = scan.nextInt();
              
                    for (int i = 1; i <= h; i++) 
                    {
                        for (int j = h; j > i; j--) 
                        {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        } while (ch != 3);
    }
}
