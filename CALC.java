package src;
import java.util.Scanner;

public class CALC {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        System.out.println("Введите знак");
        Scanner sc3 = new Scanner(System.in);
        char znak = sc3.next().charAt(0);
        calc(num1, num2, znak);
    }
     static void calc(int num1,int num2,char znak) {
        if (znak == '+') {
            int result = num1 + num2;
            System.out.println(result);
        }

        if (znak == '-') {
            int result = num1 - num2;
            System.out.println(result);
        }

        if (znak == '*') {
            int result = num1 * num2;
            System.out.println(result);
        }

        if (znak == '/') {
            float result = (float) num1 / (float) num2;
            System.out.println(result);
        }

        if (znak == '^') {
            int result = (int) Math.pow(num1, num2);
            System.out.println(result);
        }

        if (znak == 's') {
            double num1r = Math.toRadians(num1);
            float result = (float) Math.sin(num1r);
            System.out.println(result);
        }

        if (znak == 'c') {
            double num1r = Math.toRadians(num1);
            float result = (float) Math.cos(num1r);
            System.out.println(result);
        }

        if (znak == 't') {
            double num1r = Math.toRadians(num1);
            float result = (float) Math.tan(num1r);
            System.out.println(result);
        }
        if (znak == 'k') {
             float result = (float) Math.sqrt(num1);
             System.out.println(result);
        }
    }
}


