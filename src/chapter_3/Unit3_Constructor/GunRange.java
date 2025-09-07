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

    int gameStatus = 1;
    String command;


    player.setHolding(gun);
    player.setTarget(dummy);

    while(gameStatus == 1){
      command = input.nextLine();

      switch(command){
        case " ":
          player.shoot();
          break;
        case "r":
          player.reloading();
          break;
        case "f":
          player.setAmmo(player.getAmmo() + 30);
          break;
        case "exit":
          gameStatus = 0;
          break;
        default :
          System.out.println("Error: Wrong Command.");
      }
    }
  }

}
