/**
 * 
 */
package fr.adaming.javaenfant.ch3;

/**
 * @author IN-LL-008
 *
 */
public class VoitureJamesBond extends Voiture {

public int rouler(int duree) {
	int distance = duree*180;
	//	int distance = duree * 60 ;
		System.out.println("C'est JamesBond qui roule pendant une distance de "+distance );
		return distance ;
	}
	
	
}
