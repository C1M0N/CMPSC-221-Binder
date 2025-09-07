/*
 * Copyright 2025 Doucheng Peng
 *
 * Author      : Doucheng Peng [C1M0N]
 * Email       : dbp5625@psu.edu / cimon@cementine.ink
 * Course      : CMPSC 221 [Autumn 002]
 * Date        : 9/6/25 PM11:19
 *
 * Collaboration Statement: By myself
 * Description : 射击人物构建
 */
package chapter_3.Unit3_Constructor;

public class Player {

  private String name;
  private double hp;
  private int ammo;
  private Dummy target;
  private Gun holding;

  public Player(String name, double hp) {
    this.name = name;
    this.hp = hp;
    this.ammo = 0;

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setHp(double hp) {
    this.hp = hp;
  }

  public double getHp() {
    return hp;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public int getAmmo() {
    return ammo;
  }

  public void setTarget(Dummy target) {
    this.target = target;
  }

  public Dummy getTarget() {
    return target;
  }

  public void setHolding(Gun holding) {
    this.holding = holding;
  }

  public Gun getHolding() {
    return holding;
  }

  public void shoot(){
    this.shoot(this.holding, this.target);
  }

  public void shoot(Gun gunUsed, Dummy target) {
    this.setHolding(gunUsed);
    this.setTarget(target);

    int maxAmmo = this.holding.getMaxAmmo();
    int currentAmmo = gunUsed.getCurrentAmmo();

    if (currentAmmo >= 1) {
      currentAmmo -= 1;
      gunUsed.setCurrentAmmo(currentAmmo);
      System.out.printf("砰！弹夹状况：%d/%d\n剩余弹药：%d\n\n", currentAmmo, maxAmmo, ammo);
      this.target.setHp(this.target.getHp() - holding.getPower());
      System.out.printf("%s - %fHP\n%f/%f\n\n", this.target.getName(), holding.getPower(),
          this.target.getHp(), this.target.getMaxHp());
    } else {
      System.out.println("子弹不足！\n");
    }
  }

  public void reloading() {
    int ammoUsed;
    int ammoNeed;
    int maxAmmo = this.holding.getMaxAmmo();
    int currentAmmo = this.holding.getCurrentAmmo();

    ammoNeed = maxAmmo - currentAmmo;
    if (ammo >= ammoNeed) {
      ammoUsed = ammoNeed;
      ammo -= ammoUsed;

    } else {
      ammoUsed = ammo;
      ammo = 0;

    }

    currentAmmo += ammoUsed;
    this.holding.setCurrentAmmo(currentAmmo);
    System.out.printf("装弹成功！已消耗弹药%d颗\n弹夹状况：%d/%d\n剩余弹药：%d\n\n", ammoUsed,
        currentAmmo, maxAmmo, ammo);
  }
}
