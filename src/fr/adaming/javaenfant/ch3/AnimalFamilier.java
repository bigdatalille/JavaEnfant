package fr.adaming.javaenfant.ch3;

public class AnimalFamilier {
	  int âge;
	  float poids;
	  float taille;
	  String couleur;
	   
	  public void dormir() {
	    System.out.println("Bonne nuit, à demain");
	  }
	 
	  public void manger() {
	    System.out.println(
	            "J'ai si faim&#8230; Donne-moi un biscuit !");
	  }
	 
	  public String dire(String unMot) {
	    String réponseAnimal = "OK !! OK !! " + unMot;
	    return réponseAnimal; 
	  }
	}
