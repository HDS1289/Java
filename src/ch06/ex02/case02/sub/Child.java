package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
//		this.getRegNum(); // private
		this.getMoney(); // protected ==> 다른 패키지(다른 동네)에 있으므로 접근이 안 된다.
//		this.addMoney(1000); // default ==> 다른 동네에 있으므로 접근이 안 된다.
		this.getParentName(); // public
	}
}
