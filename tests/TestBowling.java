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
	
	@Test
	public void testScore() {
		
		Frame frame=new Frame(2,4);
		int x=6;
		assertEquals(x,frame.score());
		
	}
	
	@Test
	public void testGame1() {
		
		BowlingGame game=new BowlingGame();
		Frame frame1=new Frame(2,4);
		game.addFrame(frame1);
		assertEquals(6,game.score());
		
	}
	
	@Test
	public void testGame2Spare() {
		
		BowlingGame game=new BowlingGame();
		Frame frame1=new Frame(6,4);
		game.addFrame(frame1);
		game.setBonus(5, 0);
		assertEquals(15,game.score());
		
	}
	
	@Test
	public void testGame3Strike() {
		
		BowlingGame game=new BowlingGame();
		Frame frame1=new Frame(10,0);
		game.addFrame(frame1);
		game.setBonus(5, 2);
		assertEquals(17,game.score());
		
	}
	
	
	


}
