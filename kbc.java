package bond;

import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Random;

class Answers {
	int[] nami = new int[2];

	public boolean lifeLines(Scanner scan, HashMap<Character, String> water, HashMap<Character, String> fire) {

		System.out.println("Do you want to choose LifeLines? 1:yes, 2:no");
		int noob = scan.nextInt();
		System.out.println(noob);
		if (noob == 1) {
			repeat(scan, water, fire);
			return true;
		} else if (noob != 2) {
			System.out.println("Please enter the valid input");
			lifeLines(scan, water, fire);
		}
		return true;
	}

	private boolean repeat(Scanner scan, HashMap<Character, String> water, HashMap<Character, String> fire) {
		System.out.println("which lifeline do you want to use" + "\n1: Call_of_friend, 2: Audience_poll, 3: 50-50");
		int utter = scan.nextInt();

		switch (utter) {
		case 1:
			call_of_friend(fire);
			return false;
		case 2:

			audience_poll(fire);

			break;
		case 3:

			fifty_fifty(water, fire);

			break;
		default:

			repeat(scan, water, fire);
		}
		return false;
	}

	String Answers_for_Qestions(int b) {
		HashMap<Integer, String> a = new HashMap<Integer, String>();

		switch (b) {
		case 1:
			a.put(1, "James Gosling");
			break;
		case 2:
			a.put(2, "Malayalam");
			break;
		case 3:
			a.put(3, "8");
			break;
		case 4:
			a.put(4, "JDK");
			break;
		case 5:
			a.put(5, ".java");
			break;
		case 6:
			a.put(6, "OutOfMemoryError");
			break;
		case 7:
			a.put(7, "Unicode escape sequence");
			break;
		case 8:
			a.put(8, "int");
			break;
		case 9:
			a.put(9, "getName()");
			break;
		case 10:
			a.put(10, "Eiichiro Oda");
			break;
		}
		return a.get(b);
	}

	String pat[] = { " ", " ", " ", " " };
	Random r = new Random();
	int z = r.nextInt(4);// 0,1,2,3
	HashMap<Character, String> oop = new HashMap<Character, String>();

	HashMap<Character, String> Options(int c) {

		switch (z + 1) {
		case 1:
			oop.put('A', correctAnswer(c));
			break;
		case 2:
			oop.put('B', correctAnswer(c));
			break;
		case 3:
			oop.put('C', correctAnswer(c));
			break;
		case 4:
			oop.put('D', correctAnswer(c));
			break;
		}
		return oop;
	}

	HashMap<Character, String> wa(HashMap<Character, String> water) {
		for (int k = 0; k < pat.length; k++) // 4
		{
			if (pat[k] == " ") {
				{
					String randomWord = rand(k);
					pat[k] = randomWord;
					switch (k + 1) {
					case 1:
						water.put('A', randomWord);
						break;
					case 2:
						water.put('B', randomWord);
						break;
					case 3:
						water.put('C', randomWord);
						break;
					case 4:
						water.put('D', randomWord);
						break;
					}
				}
			}
		}
		return water;
	}

	String correctAnswer(int c) {
		pat[z] = Answers_for_Qestions(c);
		return pat[z];
	}

	String rand(int len) {
		String name = "";
		int move = r.nextInt(4, 8);
		for (int i = 0; i < move; i++) {
			int v = 1 + (int) (Math.random() * 26);
			char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
			name += c;
		}
		return name;
	}

	private static void call_of_friend(HashMap<Character, String> fire) {
		System.out.println("Your friend is telling you to pick" + fire);

	}

	private static void audience_poll(HashMap<Character, String> fire) {
		Random r = new Random();
		int sanji = r.nextInt(80, 85);
		System.out.println(sanji + " % of the audience have voted for" + fire);
	}

	private static HashMap<Character, String> fifty_fifty(HashMap<Character, String> water,
			HashMap<Character, String> fire) {
		if (fire.containsKey('A')) {
			water.remove('C');
			water.remove('B');
		} else if (fire.containsKey('B')) {
			water.remove('C');
			water.remove('A');
		} else if (fire.containsKey('C')) {
			water.remove('B');
			water.remove('A');
		} else if (fire.containsKey('D')) {
			water.remove('B');
			water.remove('A');
		}
		water.putAll(fire);
		System.out.println(water);
		return water;
	}
}

public class KBC {
	public static void main(String[] args) {
		System.out.println("Welcome to Kaun Banega Crorepati, mai apka Amitabh Bachchan");
		System.out.println("for A press 1, B press 2, C press 3, D press 4");
		int q_no = 1;
		int sam = 1;
		Questions(q_no, sam);
	}

	static int Questions(int q_no, int sam) {
		HashMap<Integer, String> QnA = new HashMap<Integer, String>();
		QnA.put(1, "Who invented Java Programming?");
		QnA.put(2, "The language of Lakshadweep. a Union Territory of India, is?");
		QnA.put(3, "Number of primitive data types in Java are?");
		QnA.put(4, "Which component is used to compile, debug and execute the java programs?");
		QnA.put(5, "What is the extension of java code files?");
		QnA.put(6, "Which exception is thrown when java is out of memory?");
		QnA.put(7, "The \\u0021 article referred to as a");
		QnA.put(8, " What is the return type of the hashCode() method in the Object class? ?");
		QnA.put(9,
				"Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
		QnA.put(10, "who is the Mangaka of One piece");
		System.out.println(q_no + ":" + QnA.get(q_no));
		Answers bot = new Answers();
		Scanner scan = new Scanner(System.in);
		while (true) {
			HashMap<Character, String> fire = bot.Options(q_no);
			HashMap<Character, String> water = new HashMap<Character, String>();
			HashMap<Character, String> smoke = bot.wa(water);
			smoke.putAll(fire);
			System.out.println(smoke);
			if (sam <= 4) {
				switch (sam) {
				case 1:
					boolean yash = bot.lifeLines(scan, water, fire);
					System.out.print("Life-Lines used: " + (sam) + " \n");
					if(yash==true) {
					sam++;}
					break;
				case 2:
					 yash = bot.lifeLines(scan, water, fire);
					System.out.print("Life-Lines used: " + (sam) + " \n");
					if(yash==true) {
						sam++;}
					break;
				case 3:
					 yash = bot.lifeLines(scan, water, fire);
					System.out.print("Life-Lines used: " + (sam) + " \n");
					if(yash==true) {
						sam++;}
					break;
				}
			}

			System.out.println("Please enter the option you think is right");
			int r = scan.nextInt();
			boolean ryuk = AnswerCorrect(r, q_no, fire);

			if (ryuk == true && q_no <= 9) {
				System.out.println("Congratulations its right answer\n");
				q_no++;
				Questions(q_no, sam);
			} else if (q_no > 10) {
			} else {
				System.out.println("Oops you have answered wrong answer\nbetter luck next time");
				break;
			}
		}
		return q_no;

	}

	public static boolean AnswerCorrect(int r, int p, HashMap<Character, String> fire) {
		char ch = ' ';
		switch (r) {
		case 1:
			ch = 'A';
			System.out.println(ch);
			break;
		case 2:
			ch = 'B';
			System.out.println(ch);
			break;
		case 3:
			ch = 'C';
			System.out.println(ch);
			break;
		case 4:
			ch = 'D';
			System.out.println(ch);
			break;
		}
		for (Entry<Character, String> entry : fire.entrySet()) {
			if (entry.getKey() == ch) {
				return true;
			}
		}
		return false;
	}

	static boolean checkAnswer(int f, int p) {
		Answers bot = new Answers();
		String check = bot.correctAnswer(f);
		String orig = bot.Answers_for_Qestions(p);
		if (check == orig) {
			return true;
		} else {
			return false;
		}
	}

}
