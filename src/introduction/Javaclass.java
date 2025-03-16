package introduction;

public class Javaclass {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a * 10);

        if(a > 10)
        {
            System.out.println("Greater than 10");
        }
        else if (a < 10)
        {
            System.out.println("less than 10");
        }

        else
        {
            System.out.println("Less than or equal to 10");
        }

        for(int i = 0; i < a; i++);
        {
            System.out.println( i );
        }
    }
}
