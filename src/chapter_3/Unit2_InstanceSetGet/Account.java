/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM6:28
 *
 * Collaboration Statement: By myself
 * Description : 声明类
 */
package chapter_3.Unit2_InstanceSetGet;

public class Account {

  private String name;

  public void setName(String nameIn) {
    this.name = nameIn;
  }

  public String getName() {
    return name;    // 返回存入的名字
  }


}
