package com.game;

public interface GameElementFactory {

	Enemy createEnemy();
    Weapon createWeapon();
    Powerup createPowerUp();
}

