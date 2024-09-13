package com.game;

	public class HardLevelFactory implements GameElementFactory {
		public Enemy createEnemy() {
	        return new OrcEnemy();
	    }

	    public Weapon createWeapon() {
	        return new SwordWeapon();
	    }

	    public Powerup createPowerUp() {
	        return new SheildPowerup();
	    }
	}


