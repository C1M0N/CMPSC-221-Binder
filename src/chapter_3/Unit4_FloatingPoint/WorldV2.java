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
package chapter_3.Unit4_FloatingPoint;


public class WorldV2 {

  public static final String CMD_SHOOT = " ";
  public static final String CMD_RELOAD = "r";
  public static final String CMD_ADD_AMMO = "f";
  public static final String CMD_EXIT = "exit";

  public static boolean processCommand(String command, PlayerV2 playerV2) {
    switch (command) {
      case CMD_SHOOT:
        playerV2.shoot();
        break;
      case CMD_RELOAD:
        playerV2.reloading();
        break;
      case CMD_ADD_AMMO:
        playerV2.setAmmo(playerV2.getAmmo() + 30);
        break;
      case CMD_EXIT:
        return false;
      default:
        System.out.println("Error: Wrong Command.");
    }
    return true;
  }
}
