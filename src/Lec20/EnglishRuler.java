package Lec20;

public class EnglishRuler {

	public static void main(String[] args) {
		printEnglishRuler(4, 2);
	}

	private static void printEnglishRuler(int tickLength, int inches) {
		for (int i = 0; i < inches; i++) {
			printLine(tickLength, i);
			printInterval(tickLength - 1);
		}
		printLine(tickLength, inches);
	}

	private static void printInterval(int tickLength) {
		if (tickLength == 0) {
			return;
		}
		printInterval(tickLength - 1);
		printLine(tickLength, -1);
		printInterval(tickLength - 1);
	}

	public static void printLine(int tickLength, int num) {
		for (int i = 0; i < tickLength; i++) {
			System.out.print('-');
		}
		if (num != -1) {
			System.out.println(num);
		}else {
			System.out.println();
		}
	}

}
