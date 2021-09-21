import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        int len;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no. = ");
        len = input.nextInt();
        int[] marks = new int[10];
        for(int i=0;i<len;i++)
        {
            marks[i] = input.nextInt();
        }
        for(int j=0 ; j<len ;j++)
        {
            System.out.println(marks[j]);
        }
    }
}
