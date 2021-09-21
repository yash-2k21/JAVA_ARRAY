import java.util.Scanner;

public class ascii
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        char[] value = new char[10];
        int[] change_value=new int[10];
        System.out.println("enter the limit = ");
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            value[i] = sc.next().charAt(0);
        }
        for(int j=0 ;j<n;j++)
        {
            //final char c = value[j];
            change_value[j] = value[j];
           System.out.println(change_value[j]);
        }
      /*  int p = 97;
        int q= 98;
        int ch1 = p;
        int ch2 = q;
        System.out.println(ch1+" " +ch2);  */
    }
}
