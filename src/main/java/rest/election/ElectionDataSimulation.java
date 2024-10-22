package rest.election;

import rest.model.ElectionData;
import rest.model.ElectionParty;
import rest.model.ElectionPerson;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElectionDataSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public ElectionData getData(int inID ) {
		
		ElectionData data = new ElectionData();
		data.setRegionID( inID );
		data.setRegionName( "Linz Bahnhof" );
		data.setRegionAddresse("Bahnhofsstrasse 27/9");
		data.setRegionPostalCode(2321);
		data.setFederalState("Austria");

		List<ElectionPerson> l1 = new ArrayList<>();
		l1.add(new ElectionPerson(1, "Anna Müller", getRandomInt(100,400)));
		l1.add(new ElectionPerson(1, "Lukas Schmidt", getRandomInt(100,400)));
		l1.add(new ElectionPerson(1, "Sofia Bauer", getRandomInt(100,400)));
		l1.add(new ElectionPerson(1, "Max Fischer", getRandomInt(100,400)));
		List<ElectionPerson> l2 = new ArrayList<>();
		l2.add(new ElectionPerson(2, "Paul Becker", getRandomInt(100,400)));
		l2.add(new ElectionPerson(2, "Leonie Weber", getRandomInt(100,400)));
		l2.add(new ElectionPerson(2, "Jonas Schäfer", getRandomInt(100,400)));
		l2.add(new ElectionPerson(2, "Clara Hoffmann", getRandomInt(100,400)));
		List<ElectionPerson> l3 = new ArrayList<>();
		l3.add(new ElectionPerson(3, "Felix Richter", getRandomInt(100,400)));
		l3.add(new ElectionPerson(3, "Laura Meyer", getRandomInt(100,400)));
		l3.add(new ElectionPerson(3, "Tim Wolf", getRandomInt(100,400)));
		l3.add(new ElectionPerson(3, "Emma Braun", getRandomInt(100,400)));
		List<ElectionPerson> l4 = new ArrayList<>();
		l4.add(new ElectionPerson(4, "David Krause", getRandomInt(100,400)));
		l4.add(new ElectionPerson(4, "Mia Neumann", getRandomInt(100,400)));
		l4.add(new ElectionPerson(4, "Ben Schulz", getRandomInt(100,400)));
		l4.add(new ElectionPerson(4, "Lina König", getRandomInt(100,400)));
		List<ElectionPerson> l5 = new ArrayList<>();
		l5.add(new ElectionPerson(5, "Noah Fuchs", getRandomInt(100,400)));
		l5.add(new ElectionPerson(5, "Sarah Keller", getRandomInt(100,400)));
		l5.add(new ElectionPerson(5, "Finn Peters", getRandomInt(100,400)));
		l5.add(new ElectionPerson(5, "Patrick Bateman", getRandomInt(100,400)));


		Random random =  new Random();
		int zufaelligerIndex1 = random.nextInt(l1.size());
		int zufaelligerIndex2 = random.nextInt(l2.size());
		int zufaelligerIndex3 = random.nextInt(l3.size());
		int zufaelligerIndex4 = random.nextInt(l4.size());
		int zufaelligerIndex5 = random.nextInt(l5.size());

		ElectionPerson zufaelligername1 = l1.get(zufaelligerIndex1);
		ElectionPerson zufaelligername2 = l2.get(zufaelligerIndex2);
		ElectionPerson zufaelligername3 = l3.get(zufaelligerIndex3);
		ElectionPerson zufaelligername4 = l4.get(zufaelligerIndex4);
		ElectionPerson zufaelligername5 = l5.get(zufaelligerIndex5);



		List<ElectionParty> colleection = new ArrayList<>();

		colleection.add(new ElectionParty("OEVP", getRandomInt(100,800), zufaelligername1));
		colleection.add(new ElectionParty("SPOE", getRandomInt(100,800),zufaelligername2));
		colleection.add(new ElectionParty("FPOE", getRandomInt(100,800),zufaelligername3));
		colleection.add(new ElectionParty("GRUENE", getRandomInt(100,800), zufaelligername4));
		colleection.add(new ElectionParty("NEOS", getRandomInt(100,800), zufaelligername5));

		data.setCountingData(colleection);



		return data;
		
	}

}
