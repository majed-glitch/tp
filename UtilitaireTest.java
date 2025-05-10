package tp22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilitaireTest {

	@Test
	void testNbOccurence() {
	        Utilitaire util = new Utilitaire("banana");
	        assertEquals(3, util.nbOccurence('a'));
	        assertEquals(1, util.nbOccurence('b'));
	        assertEquals(0, util.nbOccurence('z'));
	 }
	 @Test
	 void testEstPalindrome() {
		 
		        Utilitaire util1 = new Utilitaire("radar");
		        Utilitaire util2 = new Utilitaire("hello");
		        Utilitaire util3 = new Utilitaire("");
		        Utilitaire util4 = new Utilitaire("a");
		        assertTrue(util1.estPalindrome());
		        assertFalse(util2.estPalindrome());
		        assertTrue(util3.estPalindrome());
		        assertTrue(util4.estPalindrome()); 
	    }
    
	}


