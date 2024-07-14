/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zrock.intern;

import java.util.HashMap;

/**
 *
 * @author pulel
 */
public class HashMapLength {
    public static void main(String[] args){
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 29);
        map.put("B", 57);
        map.put("C", 83);

        int length = getHashMapLength(map);
        System.out.println("Length of HashMap: " + length);
    }
    
    public static int getHashMapLength(HashMap<?, ?> map) {
        return map.size();
    }
}
