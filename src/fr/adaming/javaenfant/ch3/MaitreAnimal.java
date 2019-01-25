package fr.adaming.javaenfant.ch3;

public class MaitreAnimal {
	

		  public static void main(String[] args) {

		    String réactionAnimal;	

		    AnimalFamilier monAnimal = new AnimalFamilier();

		    monAnimal.manger();
		    réactionAnimal = "volà ce que l'animal a dit : " ;
		    réactionAnimal = réactionAnimal + monAnimal.dire("Cui !! Cui !!");
		    System.out.println(réactionAnimal);
		    System.out.println(monAnimal.dire("Cui !! Cui !!"));
		    monAnimal.dormir();
		    		    System.out.println("le resultat de add avec 5 et 8   : " + add(5,8));
			System.out.println();  
			
		  }
		  
		  public static int add(int x , int y ) {
			  return x+y ;
		  }
		  
		  
		}
