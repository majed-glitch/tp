package tp22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
	void test() {
		Robot r1=new Robot("alexia");
		r1.avance();
		r1.avance();
		String pos=r1.getPosition();
		assertEquals("(0,2)Nord",pos);
		
	
	}
	@Test
	void tests2() {
		Robot r2=new Robot("robert");
		r2.droite();
		
		String pos=r2.getPosition();
		assertEquals("(0,0)Est",pos);
	}
	@Test
	void test3() {
		Robot r3=new Robot("chayma");
		r3.droite();
		r3.droite();
		String pos=r3.getPosition();
		assertEquals("(0,0)sud",pos);
		
	
	}
	@Test
	void test4() {
		Robot r4=new Robot("mahwa");
		r4.droite();
		r4.droite();
		r4.droite();
		String pos=r4.getPosition();
		assertEquals("(0,0)Ouest",pos);
		
	
	}
	

}
