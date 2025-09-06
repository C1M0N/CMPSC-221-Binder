/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM5:29
 *
 * Collaboration Statement: By myself
 * Description : 第一个像样的程序！
 */
package chapter_2;

import java.util.Scanner;

public class Unit5_AddingIntegers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入第一个数");
    int num1 = input.nextInt();
    System.out.println("已输入" + num1 + ",请输入下一个数");
    num1 += input.nextInt();
    System.out.printf("结果为:%d%n", num1);
  }
}
