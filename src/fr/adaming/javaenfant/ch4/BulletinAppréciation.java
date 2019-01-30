package fr.adaming.javaenfant.ch4;

public class BulletinAppréciation {

	 private static char niveau;
	
public static char getNiveau() {
		return niveau;
	}

	public static void setNiveau(char niveau) {
		BulletinAppréciation.niveau = niveau;
	}

/**
* Cette méthode attend un argument entier - la note du devoir - 
* et retourne une mention, I, P, A, B, T ou E, en fonction de sa valeur. 
*/
  public char convertirNiveaux(int noteDevoir) {
  

    if (noteDevoir >= 18) {
      niveau = 'E';
    }
    else if (noteDevoir >= 16 && noteDevoir < 18) {
	niveau = 'T';
    }
    else if (noteDevoir >= 14 && noteDevoir < 16) {
	niveau = 'B';
    }
    else if (noteDevoir >= 12 && noteDevoir < 14) {
	niveau = 'A';
    }
    else if (noteDevoir >= 10 && noteDevoir < 12) {
	niveau = 'P';
    }
    else {
	niveau = 'I';
    }
    return niveau;
  }

  public static void main(String[] args) {

	  niveau = 'A' ;
	  
    BulletinAppréciation convertisseur = 
new BulletinAppréciation();
		
    char tonNiveau = convertisseur.convertirNiveaux(17);
    System.out.println("Ton premier niveau est " + 
                                          tonNiveau);
		
    tonNiveau = convertisseur.convertirNiveaux(15);
    System.out.println("Ton second niveau est " +  
                                          tonNiveau);
  }			
}
