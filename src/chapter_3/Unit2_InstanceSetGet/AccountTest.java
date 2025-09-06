/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM6:41
 *
 * Collaboration Statement: By myself
 * Description : 测试是否成功
 */
package chapter_3.Unit2_InstanceSetGet;

import java.util.Scanner;

public class AccountTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Account bankAccount = new Account();

    System.out.printf("系统初始名为%s%n%n", bankAccount.getName());

    System.out.print("请为你的新银行账户设置开户名称: ");
    String accountName = input.nextLine();

    bankAccount.setName(accountName);

    System.out.printf("开户完成,您的账户名为：%s%n", bankAccount.getName());

    String confirm;
    do {
      System.out.println("如果正确请输入yes结束程序");
      confirm = input.nextLine().trim();
    } while (!confirm.equalsIgnoreCase("yes"));

  }
}
