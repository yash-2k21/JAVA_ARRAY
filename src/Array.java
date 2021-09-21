
import java.util.Scanner;

public class Array
{
    int s;
    Scanner sc = new Scanner(System.in);
    int[] A = {33,34,17,2004,15,16};
    int len = A.length;
    //System.out.println("Enter the to be search = ");
    int n = sc.nextInt();
    public void checkNo()
    {
        int s=0;
        for(int i=0 ; i<len ;i++)
        {
            if(A[i]==n)
            {
                s=s+1;
            }
        }
        if(s>=1) {
            System.out.println("Yes");
            //System.out.println(s);
            //System.out.println(len);
        }
        else{
            System.out.println("no");
            //System.out.println(s);
            //System.out.println(len);
        }
    }
    public void print()
    {
       // int s;
        if(s>=1) {
            System.out.println("Yes");
            System.out.println(s);
            System.out.println(len);
        }
        else{
            System.out.println("no");
            System.out.println(s);
            System.out.println(len);
        }
    }
}
class result
{
    public static void main(String[] args) {
        Array obj = new Array();
        obj.checkNo();
        obj.print();
    }
}
