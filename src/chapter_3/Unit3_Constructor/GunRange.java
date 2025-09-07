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
package chapter_3.Unit3_Constructor;

import java.util.Scanner;

public class GunRange {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Player player = new Player("Steve", 100);
  Dummy dummy = new Dummy("test1", 100);
  Gun gun = new Gun();

  System.out.println(player.getAmmo());

  player.setAmmo(30);
  System.out.println(player.getAmmo());

  player.shoot(gun, dummy);
  player.reloading();
  player.shoot(gun, dummy);
  player.reloading();
  player.shoot(gun, dummy);
  }

}
