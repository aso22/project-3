import java.util.Scanner;

public class Aso9 {
    public static void main(String[] args) {
        int month,day;
        String season;
        Scanner in=new Scanner(System.in);
        System.out.println("enter num of month : ");
        month=in.nextInt();
        System.out.println("enter the day");
        day=in.nextInt();
        if(month==1||month==2 ||month==3){
            season="winter";
            if(month%3==0&&day<=21) season="spring";
            System.out.println(season);}
       else if(month==4||month==5 ||month==6){
           season="spring";
            if(month%3==0&&day<=21)season="summer";
            System.out.println(season);}
        else if(month==7||month==8 ||month==9){
            season="summer";
            if(month%3==0&&day<=21)season="fall";
            System.out.println(season);}
        else if(month==10||month==11 ||month==12){
            season="fall";
            if(month%3==0&&day<=21)season="winter";
            System.out.println(season);}


        }
    }

