import java.util.Scanner;
public class marks_methods
{
    String name;
    int age;
    int m1, m2, m3, maximum;
    int average;
    public marks_methods()
    {
        name="";
        age=0;
        m1=0;
        m2=0;
        m3=0; 
        maximum=0;
        average=0;
    }
    public void accept()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name");
        name=scan.nextLine();
        System.out.println("Enter the age");
        age=scan.nextInt();
        System.out.println("Enter the 3 marks");
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    public void calc()
    {
        average=(m1+m2+m3)/3;
        maximum=Math.max(m1, (Math.max(m2, m3)));
    }
    public void Display()
    {
        System.out.println("name: "+name);
        System.out.println("age: " +age);
        System.out.println("m1=" +m1);
        System.out.println("m2 "+m2);
        System.out.println("m3 "+m3); 
        System.out.println("maximum="+maximum);
        System.out.println("average="+average);
    }
    public static void main(String args[])
    {
        marks_methods s=new marks_methods();
        s.accept();
        s.calc();
        s.Display();
    }
}