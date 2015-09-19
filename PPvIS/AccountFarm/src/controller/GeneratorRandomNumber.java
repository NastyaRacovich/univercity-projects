package controller;

import java.util.Random;

public class GeneratorRandomNumber {
	String randomPath;
	int number;
	int sum = 0;

	public String firstGenerate() {
		Random rnd = new Random();
		number = 1 + rnd.nextInt(3);

		// if (number == 4) path = "1q.png"; // р
		// if (number == 5) path = "2q.png"; // капуста
		if (number == 1)
			randomPath = "1w.png"; // зеленый - растение растет
		if (number == 2)
			randomPath = "2w.png"; // недоступная зона
		if (number == 3)
			randomPath = "3w.png"; // коричн

		return randomPath;
	}

	public String generate() {
		Random rnd = new Random();
		number = 1 + rnd.nextInt(5);
		if (number == 4)
			randomPath = "1q.png"; // р
		if (number == 5)
			randomPath = "2q.png"; // капуста
		if (number == 1)
			randomPath = "1w.png";
		if (number == 2)
			randomPath = "2w.png";
		if (number == 3)
			randomPath = "3w.png"; // коричн
		return randomPath;
	}

	public int converselyGenerete(String path) {
		if (path.equals("1w.png"))
			number = 1;
		if (path.equals("2w.png"))
			number = 2;
		if (path.equals("3w.png"))
			number = 3;
		// if (path.equals("11q.jpg")) number = 0;
		// if (path.equals("2q.png")) number = 5;
		// if (path.equals("1q.png")) number = 4;
		return number;
	}
}
