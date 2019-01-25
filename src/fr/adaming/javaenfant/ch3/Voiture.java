package fr.adaming.javaenfant.ch3;

public class Voiture {

	public void démarrer() {
		System.out.println("je demarre " );
	} 
	public void arrêter() {
		System.out.println("j'arrete " );
	}
	
	public int rouler(int duree) {
		
		int distance = duree * 60 ;
		System.out.println("je roule pendant une distance de "+distance );
		return distance ;
	}
	
	
}
