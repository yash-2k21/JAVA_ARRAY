import java.util.Scanner;

public class student
{
    Scanner sc = new Scanner(System.in);
    String name;
    int marks;
    public void student()
    {
        name = sc.next();
        marks = sc.nextInt();
    }
    public void print()
    {
        System.out.println(name +" "+marks);
    }
}
class Test
{
    public static void main(String[] args)
    {
        student st =  new student();
        student st1 =  new student();
        student st2 =  new student();
        st.student();
        st.print();
        st1.student();
        st1.print();
        st2.student();
        st2.print();
    }
}
