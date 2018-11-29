package de.thb.fim.pizzaPronto.logik.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import de.thb.fim.pizzaPronto.datenobjekt.GerichtVO;
import de.thb.fim.pizzaPronto.datenobjekt.PastaVO;
import de.thb.fim.pizzaPronto.datenobjekt.SpeiseKarte;

public class SpeisekarteImporter {
	public SpeisekarteImporter(){
		
	}

	public ArrayList<SpeiseKarte>  leseSpeisekarte(String meineKleineSpeisekartes){
		try {
		LinkedList<GerichtVO>gericht=new LinkedList<GerichtVO>();
//		gericht.add(a);
		System.out.println(gericht);
		}
		catch(Exception e){			System.err.println(" entweder ist die groesse der Pizza oder die Pasta Sorte noícht gegeben");
		
	}		
		 	ArrayList<SpeiseKarte> speisen = new ArrayList<SpeiseKarte>();
			BufferedReader br = null;

			try{
	String words[];
			
				br = new BufferedReader(new FileReader(new File ("C:/Users/FRANCK COULIBALY/Desktop/cfa/meineKleineSpeisekarte.txt")));
				String line = null;
				while ((line = br.readLine()) != null) {


	words =line.split(":");
	//System.out.println(line);

	if(words[0].equals("speise.art")){
		if(words[1].equals("Pasta")){
			if(words[0].equals("speise.art")){
				if(words[0].equals("speise.art")){
	PastaVO aktSpeise=new PastaVO();
	LinkedList<GerichtVO> gericht=new LinkedList<GerichtVO>();
	gericht.add(aktSpeise);

	System.out.println(line);


	//System.out.println(aktSpeise);
		
		
	}
	}


	}

			
	}
				}
			}
				catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						br.close();
					} catch (IOException e) {
					}

	}
			return speisen;
	
	}
}
