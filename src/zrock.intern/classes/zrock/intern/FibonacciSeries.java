/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zrock.intern;

/**
 *
 * @author pulel
 */
public class FibonacciSeries {
    public static void printFibonacciSeries(int limit) {
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci series up to 100: " + num1 + ", " + num2);

        while (num1 + num2 <= limit) {
            int next = num1 + num2;
            System.out.print(", " + next);
            num1 = num2;
            num2 = next;
        }
    }
}
