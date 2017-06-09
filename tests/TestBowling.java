import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testIfStrike() {
		
		Frame frame=new Frame(10,0);
		assertTrue(frame.isStrike());
		
	}
	
	@Test
	public void testIfSpare() {
		
		Frame frame=new Frame(2,8);
		assertTrue(frame.isSpare());
	}

}
