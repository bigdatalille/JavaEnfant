package fr.adaming.javaenfant.ch3;

public class Poisson extends AnimalFamilier {

	 int profondeurCourante = 0;

	  public int plonger(int combienDePlus){
		//  int profondeurCourante = 0;
	    profondeurCourante = profondeurCourante + 	combienDePlus;
	    System.out.println("Plongée de " + 	  combienDePlus + " mètres");
	    System.out.println("Je suis à " +
	profondeurCourante + 
	" mètres sous le niveau de la mer");
	    return profondeurCourante; 
	  }
	}
