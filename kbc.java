package bond;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
public class KBC {
	public static void main(String[] args)
	{
	System.out.println("kon banega kororpathi\n"); 
	HashMap<Integer,String> QnA = new HashMap<Integer,String>();
	QnA.put(1, "The International Literacy Day is observed on?" );//key(Index) and object(value)"Sep8",
	QnA.put( 2,"The language of Lakshadweep. a Union Territory of India, is?");//"Malayalam",
	QnA.put( 3,"In which group of places the Kumbha Mela is held every twelve years?" );//"Prayag. Haridwar, Ujjain,. Nasik",
	QnA.put(4,"Bahubali festival is related to?");//"Jainism",
	QnA.put( 5,"Which day is observed as the World Standards  Day?");// "Oct 14",
	QnA.put( 6, "Which of the following was the theme of the World Red Cross and Red Crescent Day?");//"Dignity for all - focus on Children'",
	QnA.put(7,"September 27 is celebrated every year as?");//"World Tourism Day", 
	QnA.put( 8,"Who is the author of 'Manas Ka-Hans' ?");// "Amrit Lal Nagar",
	QnA.put( 9,"The death anniversary of which of the following leaders is observed as Martyrs' Day?");// "Mahatma Oandhi",
	QnA.put(10, "who is the Mangaka of One piece");//"Eiichiro Oda"
	start(QnA);
}

	private static void start(HashMap<Integer, String> QnA)
	{
		System.out.println("please enter the question number");
		System.out.println(p + ": the Question is:\n" + QnA.get(p) + "\n");
		Scanner scan = new Scanner(System.in);
		int p;
		p = scan.nextInt();
		while(p<=10)
		{
		Options(p);
		LifeLines(scan);
		System.out.println("Please enter the option you think is write\nA\nB\nC\nD");
		char f = scan.next();
		checkAnswer(f);
		start();
		}
	}

static void checkAnswer(char f) 
{
	correctAnswer();
	
}

static void LifeLines(Scanner scan)
{
	System.out.println("Do you want to select a Lifeline?");
	boolean i = scan.nextBoolean();
	if(i = true)
	{
		System.out.println("Which LifeLine Do you want\npress 1 for fifty-fifty"
				+ "\npress 2 for Audience_poll\npress 3 for call_of_friend");
		int v = scan.nextInt();
		if(v==1)
		{
			static void fifty_Fifty()
			{
				
			}
		}
		if(v==2)
		{			
			static void Audience_poll()
			{
				
			}
		}
		if(v==3)
		{
			static void call_of_friend()
			{
				
			}	
		}
	}
	else 
	{
		System.out.println("Very good all the best");
	}
}

static String Answer(int b) {
	HashMap<Integer, String> a = new HashMap<Integer, String>();

	switch (b) {
	case 1:
		a.put(1, "Sep8");
		break;
	case 2:
		a.put(2, "Malayalam");
		break;
	case 3:
		a.put(3, "Prayag. Haridwar, Ujjain,. Nasik");
		break;
	case 4:
		a.put(4, "Jainism");
		break;
	case 5:
		a.put(5, "Oct 14");
		break;
	case 6:
		a.put(6, "Dignity for all - focus on Children'");
		break;
	case 7:
		a.put(7, "World Tourism Day");
		break;
	case 8:
		a.put(8, "Amrit Lal Nagar");
		break;
	case 9:
		a.put(9, "Mahatma Oandhi");
		break;
	case 10:
		a.put(10, "Eiichiro Oda");
		break;
	}
	return a.get(b);
}

static void Options(int c) {
	String p[] = { " ", " ", " ", " " };

	String h = correctAnswer(c, p);
	for (int k = 1; k < p.length; k++) {
		if (p[k] == " ") {
			String m = rand(k);
		}
	}
}

private static String correctAnswer(int c, String[] p) {
	HashMap<Character, String> oop = new HashMap<Character, String>();
	Random r = new Random();
	int z = r.nextInt(4);// 2
	p[z] = Answer(c);// 0,1,2,3
	switch (z + 1) {
	case 1:
		oop.put('A', p[z]);
		break;// System.out.println("A:"+p[z]+"\n");
	case 2:
		oop.put('B', p[z]);
		break;// System.out.println("B:"+p[z]+"\n");break;
	case 3:
		oop.put('C', p[z]);
		break;// System.out.println("C:"+p[z]+"\n");break;
	case 4:
		oop.put('D', p[z]);
		break;// System.out.println("D:"+p[z]+"\n");break;
	}
	return p[z];
}

static String rand(int k)
{
	// write your random word generator code here
	return w;
}

}
