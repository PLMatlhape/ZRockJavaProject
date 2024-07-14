/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zrock.intern;

/**
 *
 * @author pulel
 */
public class MaxOfThreeNums {
  public static int maxNumber(int num1, int num2, int num3){
      int maximum = Math.max(Math.max(num1, num2), num3);
      return maximum;
  }
}
