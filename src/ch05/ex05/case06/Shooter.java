package ch05.ex05.case06;

public class Shooter {
	private Gun gun;

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() { // dependency
		gun.fire();
	}
}
