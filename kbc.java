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
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+": the Question is:\n"+QnA.get(i)+"\n");
		Options(i);
		Answer(i);
	}
}
	static String Answer(int b)
	{
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(1,"Sep8");
		a.put(2,"Malayalam");
		a.put(3,"Prayag. Haridwar, Ujjain,. Nasik");
		a.put(4,"Jainism");
		a.put(5,"Oct 14");
		a.put(6,"Dignity for all - focus on Children'");
		a.put(7,"World Tourism Day");
		a.put(8,"Amrit Lal Nagar");
		a.put(9,"Mahatma Oandhi");
		a.put(10,"Eiichiro Oda");
		switch(b)
		{
		
		}
		return a.get(b);
	}

	
static void Options(int c)
	{
		String p[];
		Random r = new Random();
		int z = r.nextInt(3);//2
		p[z] = Answer(c);//0,1,2,3

		
			
		}
	}
	
