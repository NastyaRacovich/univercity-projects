package controller;

import java.util.Random;

public class GeneratorRandomNumber {
	String randomPath;
	int number;
	int sum = 0;
	int type;

/*	public GeneratorRandomNumber(int type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}*/

	public String firstGenerate() {
		Random rnd = new Random();
		number = 1 + rnd.nextInt(2);

		if (number == 1)
			randomPath = "kr.jpg"; // недоступная зона
		if (number == 2)
			randomPath = "3w.png"; // коричн

		return randomPath;
	}

	

	public int converselyGenerete(String path) {
		if (path.equals("3w.png"))
			number = 2;
		if (path.equals("kr.jpg"))
			number = 1;

		return number;
	}
}
