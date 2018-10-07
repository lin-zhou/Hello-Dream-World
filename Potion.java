package Characters;

import java.util.*;

import Characters.Character;

public class Potion {
	private String _size;
	private int _healAmount;

	public Potion () {
		_size = pSize();
	}

	public String pSize() {
		Random rand = new Random();
		int i = rand.nextInt(2);
		if (i == 0) {
			return "small";
		} else if (i == 1) {
			return "medium";
		} else 
			return "large";
	}

}