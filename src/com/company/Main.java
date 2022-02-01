package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	System.out.println("Hello? Java?");
        final int x = 10; // final = const
        int u = 768;
        var y = 12.5;
        boolean b = true;
        double z = 15.2;
        char ch = 120;
        System.out.print("1 ");
        System.out.println(x);
        System.out.println(b);
        System.out.println("y = " + y + " z = " + z);
        System.out.println(ch);
        System.out.println("---------------------------");
        // Scanner in = new Scanner(System.in);
        // System.out.println("Введите число: ");
        // int n = in.nextInt();
        // System.out.println(n);
        int num1 = 6;
        int num2 = 8;
        System.out.println(num1 + "?" + num2);
        if(num1 > num2){ // if ( && ) or ( || ) or ( | ) or ( & )
            System.out.println("Первое число больше второго");
        }
        else if(num1 < num2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
        }
        System.out.println("---------------------------");
        int num = 4;
        int output;
        switch(num){

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output);
        int l = x < u? (x+u) : (x-u);
        System.out.println(l);
        for (int i = 0; i < 2; i++){
            y += i;
            System.out.println(y);

        }
        System.out.println("---------------------------");
        int j = 2; /* цикл do гарантирует хотя бы однократное выполнение действий,
        даже если условие в инструкции while не будет истинно. */
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);
        System.out.println("---------------------------");
        int e = 6;
        while (e > 4){
            System.out.println(e);
            e--;
        }
        System.out.println("---------------------------");
        for (int i = 0; i < 5; i++){
            if (i == 2)
                continue;
            if (i == 4)
                break;
            System.out.println(i);
        }
    }
}
