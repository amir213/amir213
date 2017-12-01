package exerciceString;

public class StringManager {
	
	/**
	 *methode qui appele a la methode reverseStringByLetter 
	 * et qui imprimre la chaine recu caractere par caractere 
	 * avec charAt(i)
	 */
	public void printStringInReverseOrderCharByChar(String chaine) {
	  	   
	  	for(int i=0; i<chaine.length(); i++) {
	  	System.out.println(reverseStringByLetter(chaine).charAt(i));
	   }
	  	
	  	//TODO boucle décrémentale
	} 
		
	/**
	 * methode qui prend en entrée une chaine 
	 * et retourne la chaine renversee dans 
	 */
	private String reverseStringByLetter(String chaine) {
	    	
	    StringBuilder sb = new StringBuilder(chaine);
	    String motRenverse = sb.reverse().toString();
	    return motRenverse;
	}
		 
	/**
	 * methode qui nous retourne un tableau qui contient
	 * les attributs de chaque user separer qrace au separator
	 * dans notre cas "," apres on aura qu'a afficher le contenue 
	 * du tableau case par case
	 * 
	 */
	public String[] transformUser(User user, String separator) {
	    return user.toString().split(separator);
	    
	   // String[] userString = new String[3];
	    
	    
	    
	    //return userString;
	    
			   
	}
		
	/**
	 * methode qui prend en entree un user et met a jour en majuscule 
	 * ces deux attributs string et retourne le user en majuscule
	 * apres dans le main on affiche au format souhaite
	 */
	
	User getUserWithUpperCaseAttributes(User user) {
		user.setLastName(getUpperCaseString(user.getLastName()));
		user.setLogin(getUpperCaseString(user.getLogin()));
	    return user;
	}
		 
	/**
	 * methode qui utilise la methode toUpperCase() qui change le miniscule 
	 * en majuscule et rend la chaine modifier, mais nous on a besoin
	 * que la methode nous rends un User 
	 */
	
	private String getUpperCaseString(String chaine) {
		return chaine.toUpperCase();
	} 
		  
		 
	/**
	 * 
	 * methode recois en entrée deux users et qui utilse le getLastName pour avoir leur nom  
	 * afin de les comparer grace à compareTo, cet dérnière nous rends un entier qu'on 
	 * va pouvoir tester dans le main et savoir qui a le nom avant l autre
	 */
	
	public int compareUserLastName (User user1, User user2) {
		    	
		return user1.getLastName().compareTo(user2.getLastName());
	}

	/**
	 * methode qui nous rend le resultat mais en string cette fois ou elle utilise 	  
	 * la methode précedente pour avoir l'entier order et on aura  
	 * qu'a faire le traitement inverse c a dire de faire les tests necessaire
	 * pour afficher le string attendu
	 */
	
	String compareUsers(User u1, User u2) {
			  
        int order = compareUserLastName(u1, u2);
		if (order == 0) {
		        	 
		   return "les deux users ont le même nom de famille";
		         
		}
		    else if (order < 0) {
		        	 
		         return u1.getLastName() + " est avant " + u2.getLastName();
                     
		         }else {
		        	 
		        	return u1.getLastName() + " est aprés " + u2.getLastName();

		         }
	}
				
	public int getHighterId(User us1, User us2) {
			int orderId1 = us1.getId();
			int orderId2 = us2.getId();
			
			if (orderId1 == orderId2) {
	            return 1;
			}
				else if (orderId1 < orderId2) {
				         return orderId2;
		                 
				}else {
				       return orderId1;
				 }
		}       
	
	
	
	
}
