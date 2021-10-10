import java.util.Scanner;
import java.util.Arrays;
public class Array_Sorting
{
    public void sorting(int A[])
    {
        Arrays.sort(A);
        for(int i=0;i<5;i++)
        {
            System.out.println(A[i]);
        }
    }
}
class fifth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Array_Sorting obj = new Array_Sorting();
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0 ; i<n ;i++)
        {
            A[i] = sc.nextInt();
        }
        obj.sorting(A);
    }
}
