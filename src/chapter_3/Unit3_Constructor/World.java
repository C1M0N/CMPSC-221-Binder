/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/7/25 AM2:39
 *
 * Collaboration Statement: By myself
 * Description : 世界相关初始设置
 */
package chapter_3.Unit3_Constructor;


public class World {

  public static final String CMD_SHOOT = " ";
  public static final String CMD_RELOAD = "r";
  public static final String CMD_ADD_AMMO = "f";
  public static final String CMD_EXIT = "exit";

  public static boolean processCommand(String command, Player player) {
    switch (command) {
      case CMD_SHOOT:
        player.shoot();
        break;
      case CMD_RELOAD:
        player.reloading();
        break;
      case CMD_ADD_AMMO:
        player.setAmmo(player.getAmmo() + 30);
        break;
      case CMD_EXIT:
        return false;
      default:
        System.out.println("Error: Wrong Command.");
    }
    return true;
  }
}
