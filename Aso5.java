import java.util.Scanner;

public class Aso5 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("enter num 1= ");
        x= in.nextInt();
        System.out.println("enter num 2= ");
        y= in.nextInt();
        System.out.println("enter num 3=  ");
                z= in.nextInt();
        if(x==y&y==z){
            System.out.println("all the same ");}
        else
            if(x!=y&y!=z){
                System.out.println("all the different");}
                else
                System.out.println("neither");
        }

    }

