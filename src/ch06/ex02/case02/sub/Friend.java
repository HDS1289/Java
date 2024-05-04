package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		
//		parent.getRegNum();
		parent.getParentName(); // public
//		parent.getMoney(); // protected ==> 다른 패키지 내에 있으므로 접근이 불가하다.
//		parent.addMoney(1000); // default ==> 다른 패키지 내에 있으므로 접근이 불가하다.
	}
}
