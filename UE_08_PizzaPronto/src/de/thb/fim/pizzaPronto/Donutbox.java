package de.thb.fim.pizzaPronto;
import java.util.Iterator;

public class Donutbox {

	public static void main(String[] args)
	{
		 int array_a[] = new int [12];
		 int array_b[]= new int [12];
		 
		int sum_a = 0;

		for (int i = 0; i < 4; i++)
		   sum_a += array_a[i];

		int average_a = sum_a / 4;
		int sum_b = 0;

		for (int i = 0; i < 4; i++)
		   sum_b += array_b[i];

		int average_b = sum_b / 4;
		 String names[] = { "Cheese", "Cheese", " Black Olives" };
		 String[] myStringArray = {"a","b","c"};
		 for (String a : myStringArray) {
			    System.out.println(a+"\n");
			  
			}

		String [] [] donutbox =  
				{
					{"braun", "blau-Loch",  "Zuckerglasur", "blau-streusel"},
					{"grün",  "braun-Loch", "weiß",         "rosa"},
					{"blau",  "gelb-Loch",  "rosa-Loch",    "puderzucker"}
				};
		
		System.out.println(donutbox[2][1]); // a) gelb-Loch
		System.out.println(donutbox[1][0]); // b) grün
		System.out.println(donutbox[1][2]); // c) weiß
		System.out.println(myStringArray[0]);

		// d) for-Schleifen
		System.out.println("\n\nInhalt meiner Donutbox mit For-Schleifen:");
		for (int i = 0; i < donutbox.length; i++)
		{
			for(int k=0; k < donutbox[i].length; k++)
			{
				System.out.print(donutbox[i][k] + " ");
			}
			System.out.println();
		}
		
		// e) for-each-Schleifen
		System.out.println("\n\nInhalt meiner Donutbox mit For-Each-Schleifen:");
		for (String[] reihe : donutbox)
		{
			for (String donat: reihe)
			{
				System.out.print(donat + " ");
			}
			System.out.println();
		}
		
		// f) Mittlere Reihe
		System.out.println("\n\nDie mittlere Reihen:");
		for (int i = 0; i < donutbox[1].length; i++)
		{
			System.out.print(donutbox[1][i] + " ");
		}
		
		// g) Geben Sie die dritte Spalte der Donut Box aus.
		System.out.println("\n\n\nDie dritte Spalte:");
		for (int i = 0; i < donutbox.length; i++)
		{
			System.out.println(donutbox[i][2] + " ");
		}
		
		// h) Tauschen Sie die beiden rosa Donuts aus
		System.out.println("\n\nTauschen der beiden rosa Donuts:");
		System.out.println("x = 3, y = 1: " + donutbox[1][3]);
		System.out.println("x = 2, y = 2: " + donutbox[2][2]);
		
		String temp = donutbox[1][3];
		donutbox[1][3] = donutbox[0][2];
		donutbox[2][2] = temp;
		
		System.out.println("\nGetauscht:");
		System.out.println("x = 3, y = 1: " + donutbox[1][3]);
		System.out.println("x = 2, y = 2: " + donutbox[2][2]);
		
		// i) Zufälliges befüllen einer DonutBox
		System.out.println("\n\nZufälliges befüllen einer Donutbox:");
		donutbox = initDonutbox(3, 3); // donutbox = new String[3][3];
		fillBoxRandom(donutbox);
	}
	
	
	public static void fillBoxRandom(String[][] donutbox)
	{
		for (int i = 0; i < donutbox.length; i++)
		{
			for (int k = 0; k < donutbox[i].length; k++)
			{
				donutbox[i][k] = getRandomDonut();
				System.out.print(donutbox[i][k] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static String getRandomDonut()
	{
		String Donut;
		int zufallszahl = randomInteger(1, 12);
		switch (zufallszahl)
		{
			case 1: Donut = "braun"; break;
			case 2: Donut = "blau-Loch"; break;
			case 3: Donut = "Zuckerglasur"; break;
			case 4: Donut = "blau-streusel"; break;
			case 5: Donut = "grün"; break;
			case 6: Donut = "braun-Loch"; break;
			case 7: Donut = "weiß"; break;
			case 8: Donut = "rosa"; break;
			case 9: Donut = "blau"; break;
			case 10: Donut = "gelb-Loch"; break;
			case 11: Donut = "rosa-Loch"; break;
			case 12: Donut = "puderzucker"; break;
			default: Donut = "NICHT VERFÜGBAR";
		}	
		
		return Donut;
	}

	
	private static String[][] initDonutbox(int x, int y)
	{
		return new String[x][y];
	}

	
	public static int randomInteger(int min, int max)
	{ 
		int randomNum = min + (int)(Math.random() * ((max - min) + 1));
		return randomNum;
	}

}