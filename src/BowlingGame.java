import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int ukupanBonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		ukupanBonus=firstThrow+secondThrow;
		
		
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		int score=0;
		for(int i=0;i<frames.size();i++)
		{
			if(frames.get(i).isSpare())
			{
				score=ukupanBonus+frames.get(i).score();
				
			}else{
			
				score=score+frames.get(i).score();
			}
			
		}
		
		
		return score;
	}
}
