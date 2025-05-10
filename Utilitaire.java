package tp22;

public class Utilitaire {
	 private String chaine;

	    
	    public Utilitaire(String chaine) {
	        this.chaine = chaine;
	    }

	    //nbre d'occurence
	    public int nbOccurence(char c) {
	        int count = 0;
	        for (char ch : chaine.toCharArray()) {
	            if (ch == c) {
	                count++;
	            }
	        }
	        return count;
	    }

	    //verification (palindrome)
	    public boolean estPalindrome() {
	        String reverse = new StringBuilder(chaine).reverse().toString();
	        return chaine.equals(reverse);
	    }
	

}
