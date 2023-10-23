import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, chemistry, uyghur, history, music ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your math score: ");
        math = inp.nextInt();

        System.out.println("Enter your physics score:");
        physics = inp.nextInt();

        System.out.println("Enter your chemistry score:");
        chemistry = inp.nextInt();

        System.out.println("Enter your uyghur score:");
        uyghur = inp.nextInt();

        System.out.println("Enter your history score:");
        history = inp.nextInt();

        System.out.println("Enter your music score:");
        music = inp.nextInt();

        int total = (math+ physics + chemistry + uyghur + history + music );

        double average = (double) total / 6 ;

        System.out.println("your average:" + total/ 6);

        boolean result = average >= 60 ;

        String str = result ? "passed" : "failed" ;
        System.out.println(str);







    }
}