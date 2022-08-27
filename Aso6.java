import java.util.Scanner;

public class Aso6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter num 1= ");
        a= in.nextInt();
        System.out.println("enter num 2= ");
        b= in.nextInt();
        System.out.println("enter num 3=  ");
        c= in.nextInt();
        if(a>b&b>c)
        {
            System.out.println(a+" "+b+" "+c+" increasing");}
        else
            if(a<b&b<c)
            {
                System.out.println(a+" "+b+" "+c+" decreasing");}
            else
            {
                System.out.println(a+" "+b+" "+c+"neitther");}
    }
}
