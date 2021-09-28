public class count_object
{
    static int i;
    public void counter()
    {
        i++;
    }
    public void print()
    {
        System.out.println("no. of objects = "+i);
    }
}
class count_object1
{
    public static void main(String[] args){
        count_object obj = new count_object();
        obj.counter();
        count_object obj2 = new count_object();
        obj2.counter();
        count_object obj3 = new count_object();
        obj3.counter();
        count_object obj4 = new count_object();
        obj3.print();
    }
}
