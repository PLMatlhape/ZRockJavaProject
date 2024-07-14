/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zrock.intern;

import java.util.Scanner;

/**
 *
 * @author pulel
 */
public class StringToTupleConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A String To Convert To Turple: ");
        String input = scan.nextLine();
        int value = input.length();

        Tuple<String, Integer> tuple = convertToTuple(input, value);

    }

    public static Tuple<String, Integer> convertToTuple(String input, int value) {
        Tuple<String, Integer> tuple = new Tuple<>(input, value);

        System.out.println("String tuple: " + tuple.getFirst() + ", " + tuple.getSecond());
        return tuple;
    }

}

class Tuple<T1, T2> {

    private T1 first;
    private T2 second;

    public Tuple(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}
