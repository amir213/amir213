package exerciceString;


public class StringManagerTest {


      public static void main(String[] args) {
		    StringManager sm = new StringManager();
            String chaine1 = "chocolat";
		
            System.out.println("Appel à printStringInReverseOrderCharByChar(chocolat)"); 
            /**
             * appel a la methode pour afficher chocolat inverse caractere par caractere 
             */
           
            sm.printStringInReverseOrderCharByChar(chaine1);
	        
	       /**
	        *  String [] tab = sm.reverseStringByLetter(chaine1).split("");
	        *for(String str:tab ){ 
	        *System.out.println(str);
	        * }
	        */
           
     	 
            User user1 = new User(1,"safia","gharbi");
            /**
             * j'ai modifier le toString de user pour avoir un affichage qui m'aide plus tard
             */
            System.out.println("user1 :{" + user1.toString() + "}"); 
           
            System.out.println("Appel à trnsformUser(user1)");
            /**
             * le tableau de string separer recoit le toString qu'on a modifier avec la separation "," 
             */
	        String[] separer = sm.transformUser(user1,",");
	        /**
	         * boucle qui nous permet d'afficher string par string du tableau separer contenant nous attributs a afficher 
	         */
	        for (String motSep: separer) {
	            System.out.println(motSep);
	        }
	        
	        User userMin = new User(77,"gharbi","safgharb");
	        System.out.println("userMin :{" + userMin.toString() + "}");
	        System.out.println("Appel à getUserWithUpperCaseAttributes(userMin)");
	        /**
	         * appel a la methode pour convertir en majuscule apres on a qu'afficher notre resultat
	         * mais j'ai reinitialiser mon userMin pour la suite de notre exercice 
	         */
	        sm.getUserWithUpperCaseAttributes(userMin);
            System.out.println("{" + userMin.toString() + "}");
            userMin.setLastName("gharbi");
            userMin.setLogin("safgharb");
             
             
	        User user2 = new User(67,"elqotbi","skymed");
	        System.out.println("user2 :{" + user2+ "}");
	        System.out.println("Appel à compareUserLastName(userMin, user2)");
	        /**
	         * tester l'entier order qu'on recoit de la methode compareUserLastName
	         * afin de savoir qeul nom est avant l'autre  
	         */
	        int order = sm.compareUserLastName(userMin, user2);
	        if (order < 0) {
	        	 
	            System.out.println("{" + userMin.toString() + "}" + " a un nom de famille qui est avant le nom de famille de  " + "{" + user2.toString() + "}");
	         
	        }else if (order == 0) {
	        	 
	        	 System.out.println("{" + userMin.toString() + "}"+ " et " +"{" + user2.toString() + "}"+ " sont identiques"); 
	         
	         }else if (order > 1) {
	        	 
	        	 System.out.println("{" + userMin.toString() + "}"+ " a un nom de famille qui est aprés le nom de famille de "+"{" + user2.toString() + "}"); 

	         }
	        /**
	          * initialiser nous deux userToCompare
	          */
	         
	         User user1ToCompare = new User(8,"gharbi","safgharb");
	         User user2ToCompare = new User(8,"gharbi","safgharb");
	         System.out.println("user1ToCompare :{" + user1ToCompare.toString() + "}");
	         System.out.println("user2ToCompare :{" + user2ToCompare.toString() + "}");
	         System.out.println("Appel à compareUser(user1ToCompare, user2ToCompare)");
	         /**
	          * appel a la methode compareUsers qui nous rends une chaine contenant
	          * le resultat dans resu 
	          */
	         String resu = sm.compareUsers(user1ToCompare, user2ToCompare);
	         System.out.println(resu);
	         /**
	          * mettre a jour notre user1ToCompare
	          */
	         user1ToCompare.setLastName("elqotbi");
	         
	         System.out.println("user1ToCompare :{" + user1ToCompare.toString() + "}");
	         System.out.println("Appel à compareUser(user1ToCompare, user2ToCompare)");
	         /**
	          * appel a la methode compareUsers qui nous rends une chaine contenant
	          * le resultat dans resu on l'a declare pas string car ca etais fais avant
	          */
	         resu = sm.compareUsers(user1ToCompare, user2ToCompare);
	         System.out.println(resu);
	         /**
	          * mettre a jour notre user1ToCompare
	          */
	         user1ToCompare.setLastName("vauquier");
	
	         System.out.println("user1ToCompare :{" + user1ToCompare.toString() + "}");
	         System.out.println("Appel à compareUser(user1ToCompare, user2ToCompare)");
	         /**
	          * appel a la methode compareUsers qui nous rends une chaine contenant
	          * le resultat dans resu 
	          */
	         resu = sm.compareUsers(user1ToCompare, user2ToCompare);
	         System.out.println(resu);
	         
	         System.out.println("Le user qui à le plus grand Id entre :");
	         System.out.println("user1: {" + user1.toString() + "}");
	         System.out.println("user2: {" + user2.toString() + "}");
	         if (sm.getHighterId(user1, user2) == 1) {
		         System.out.println("est : Les deux users ont le même Id");
                
	         }else if (sm.getHighterId(user1, user2) == user1.getId()) {
		         System.out.println("est: user1 :{" + user1.toString() + "}");
 	                 
			}else {
		         System.out.println("est: user2 :{" + user2.toString() + "}");

			 }
	         
	       
	         
	         System.out.println("Le user qui à le plus grand Id entre :");
	         System.out.println("user1: {" + user1.toString() + "}");
	         System.out.println("user1ToCompare: {" + user1ToCompare.toString() + "}");
	         if (sm.getHighterId(user1, user1ToCompare) == 1) {
		         System.out.println("est : Les deux users ont le même Id");
                
	         }else if (sm.getHighterId(user1, user1ToCompare) == user1.getId()) {
		         System.out.println("est: user1 :{" + user1.toString() + "}");
 	                 
			}else {
		         System.out.println("est: user1ToCompare :{" + user1ToCompare.toString() + "}");

			 }
	         
	      
	         
	         

	 }

}

	   


		


