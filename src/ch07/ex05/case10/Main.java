package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		
		List<AutoBot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(AutoBot autobot: corps) {
			autobot.run();
			autobot.fight();
			if(autobot instanceof Bumblebee bot) bot.guard(); // autoBot 객체를 Bumblebee type의 bot variable에 담는다.
			if(autobot instanceof Prime bot) bot.command();
			
		}
	}
}
