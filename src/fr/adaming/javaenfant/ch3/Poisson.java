package fr.adaming.javaenfant.ch3;

public class Poisson extends AnimalFamilier {

	 int profondeurCourante = 0;

	  public int plonger(int combienDePlus){
		//  int profondeurCourante = 0;
	    profondeurCourante = profondeurCourante + 	combienDePlus;
	    System.out.println("Plong�e de " + 	  combienDePlus + " m�tres");
	    System.out.println("Je suis � " +
	profondeurCourante + 
	" m�tres sous le niveau de la mer");
	    return profondeurCourante; 
	  }
	}
