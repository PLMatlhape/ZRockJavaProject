/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zrock.project;

/**
 *
 * @author pulel
 */
import java.util.HashMap;
import java.util.Scanner;
import zrock.intern.ArrayElementCount;
import zrock.intern.FibonacciSeries;
import zrock.intern.HashMapLength;
import zrock.intern.MaxOfThreeNums;
import zrock.intern.StringToTupleConversion;

public class MainActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // MaxOfThreeNums
        MaxOfThreeNums max = new MaxOfThreeNums();
        System.out.println("Enter First Number: ");
        int num1 = scan.nextInt();        
        System.out.println("Enter Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = scan.nextInt();
        
        scan.nextLine();
        System.out.println("The Maximum Of Three Numbers: " + max.maxNumber(num1, num2, num3));
        
        // StringToTupleConversion
        StringToTupleConversion tuple = new StringToTupleConversion();
        System.out.println("Enter A String To Convert To Tuple: ");
        String input = scan.nextLine(); 
        int value = input.length();
        tuple.convertToTuple(input, value);
        
        // ArrayElementCount
        ArrayElementCount array = new ArrayElementCount();
        int[] arr = { 90, 13, 57, 64, 38, 75, 81 };
        int count = array.elementCount(arr);
        System.out.println("Count of elements in the array: " + count);
        
        // HashMapLength
        HashMapLength hash = new HashMapLength();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("p", 29);
        map.put("u", 57);
        map.put("c", 83);

        int length = hash.getHashMapLength(map);
        System.out.println("The Length Of The HashMap: " + length);
        
        // FibonacciSeries
        FibonacciSeries fib = new FibonacciSeries();
        fib.printFibonacciSeries(100);
        
    }
}
