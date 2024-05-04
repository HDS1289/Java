package ch07.ex01.case09;

public class Shooter { // Shooter has a Gun.
	private Gun gun;
	
	public void fire() {
		this.gun.fire(); // dependency
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
