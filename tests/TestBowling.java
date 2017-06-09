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
	
	@Test
	public void testGame4() {
		
		BowlingGame game=new BowlingGame();
		Frame frame1=new Frame(1,5); //6
		game.addFrame(frame1);
		Frame frame2=new Frame(2,8);	//10+1
		game.addFrame(frame2);
		Frame frame3=new Frame(1,7);	//8
		game.addFrame(frame3);	
		//14+11
		assertEquals(25,game.score());
		
	}
	
	
	
	
	


}
