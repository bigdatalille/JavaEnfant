package fr.adaming.javaenfant.ch3;

public class MaitreAnimal {
	

		  public static void main(String[] args) {

		    String r�actionAnimal;	

		    AnimalFamilier monAnimal = new AnimalFamilier();

		    monAnimal.manger();
		    r�actionAnimal = "vol� ce que l'animal a dit : " ;
		    r�actionAnimal = r�actionAnimal + monAnimal.dire("Cui !! Cui !!");
		    System.out.println(r�actionAnimal);
		    System.out.println(monAnimal.dire("Cui !! Cui !!"));
		    monAnimal.dormir();
		    		    System.out.println("le resultat de add avec 5 et 8   : " + add(5,8));
			System.out.println();  
			
		  }
		  
		  public static int add(int x , int y ) {
			  return x+y ;
		  }
		  
		  
		}
