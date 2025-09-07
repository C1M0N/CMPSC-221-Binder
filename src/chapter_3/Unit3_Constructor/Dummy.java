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
  private double maxHp;
  private double hp;

  public Dummy(String name, double maxHp){
    this.name = name;
    this.maxHp = maxHp;
    this.hp = maxHp;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setMaxHp(double maxHp) {
    this.maxHp = maxHp;
  }

  public double getMaxHp() {
    return maxHp;
  }

  public void setHp(double hp) {
    this.hp = hp;
  }

  public double getHp() {
    return hp;
  }
}
