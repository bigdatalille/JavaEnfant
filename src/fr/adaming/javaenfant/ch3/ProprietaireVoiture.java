package fr.adaming.javaenfant.ch3;

public class ProprietaireVoiture {
	
 public static void main(String[] args) {
	 
	Voiture maTwingo = new Voiture() ;
	maTwingo.démarrer();
	maTwingo.rouler(30);
	maTwingo.arrêter();
	
	VoitureJamesBond jamesBond = new VoitureJamesBond() ;
	jamesBond.démarrer();
	jamesBond.rouler(30);
	jamesBond.arrêter();
}  
}
