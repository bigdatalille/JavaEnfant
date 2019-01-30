package fr.adaming.javaenfant.ch4;

public  class Application {  // dans le fichier Application.java  
    
    public  static  void main(String [] args) {  
       Marin marin1 =  new Marin() ;  
    //   Marin marin2 = null ;  
     //  Marin marin3 = new Marin() ;    
        // affiche 1  
      // System.out.println("Nombre de marins = " + Marin.nombreMarins) ;
       
        // affiche 1, méthode non recommandée  
       System.out.println("Nombre de marins = " + marin1.nombreMarins) ; 
       
        // affiche 1, bien que marin2 soit null
      // System.out.println("Nombre de marins = " + marin2.nombreMarins) ;   
   }  
}

