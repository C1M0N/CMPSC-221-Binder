/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM10:57
 *
 * Collaboration Statement: By myself
 * Description : 测试假人
 */
package chapter_3.Unit3_Constructor;

public class Dummy {
  private String name;
  private double hp;

  public Dummy(String name, double hp){
    this.name = name;
    this.hp = hp;

  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setHp(double hp) {
    this.hp = hp;
  }

  public double getHp() {
    return hp;
  }
}
