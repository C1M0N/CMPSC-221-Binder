/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM9:22
 *
 * Collaboration Statement: By myself
 * Description : 武器构建
 */
package chapter_3.Unit3_Constructor;

public class Gun {

  private String name;
  private int maxAmmo;
  private int currentAmmo;
  private double power;
  private double range;

  public Gun(){
    this("Default Gun", 6, 2, 50);
  }

  public Gun(String name, int maxAmmo, double power, double range) {
    this.name = name;
    this.maxAmmo = maxAmmo;
    this.power = power;
    this.range = range;
    this.currentAmmo = 0;

    System.out.println("你获得一把新枪！\n");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setCurrentAmmo(int forceCurrentAmmo){
    this.currentAmmo = forceCurrentAmmo;
  }

  public int getCurrentAmmo(){
    return currentAmmo;
  }

  public void setPower(int power){
    this.power = power;
  }

  public double getPower(){
    return power;
  }

  public void setRange(double range) {
    this.range = range;
  }

  public double getRange() {
    return range;
  }
}
