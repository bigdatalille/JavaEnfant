package fr.adaming.javaenfant.ch3;

public class ProprietaireVoiture {
	
 public static void main(String[] args) {
	 
	Voiture maTwingo = new Voiture() ;
	maTwingo.d�marrer();
	maTwingo.rouler(30);
	maTwingo.arr�ter();
	
	VoitureJamesBond jamesBond = new VoitureJamesBond() ;
	jamesBond.d�marrer();
	jamesBond.rouler(30);
	jamesBond.arr�ter();
}  
}
