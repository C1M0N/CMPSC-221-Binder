/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM10:55
 *
 * Collaboration Statement: By myself
 * Description : 测试射击功能
 */
package chapter_3.Unit4_FloatingPoint;

import java.util.Scanner;

public class GunRangeV2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String userCommand;

    // 对象初始化
    PlayerV2 playerV2 = new PlayerV2("Steve", 100);
    DummyV2 dummyV2 = new DummyV2("test1", 100);
    GunV2 gunV2 = new GunV2();

    // 变量初始化
    boolean isRunning = true;

    playerV2.setHolding(gunV2);
    playerV2.setTarget(dummyV2);

    while (isRunning) {
      userCommand = input.nextLine();
      isRunning = WorldV2.processCommand(userCommand, playerV2);
    }
  }

}
