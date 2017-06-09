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
	private boolean okidac=false;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		if(frames.size()==9)
		{
			bonus.setFirstThrow(firstThrow);
			bonus.setSecondThrow(secondThrow);
		}
		else{
			
			ukupanBonus=firstThrow+secondThrow;
			okidac=true;
		}
		
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		int score=0;
		for(int i=0;i<frames.size();i++)
		{
			if(frames.get(i).isSpare() && i != frames.size()-1)
			{
				if(okidac==true)
				{
				score+=ukupanBonus+frames.get(i).score();
				}else{
					
				okidac=false;
				
				score+= frames.get(i).score()+frames.get(i+1).getFirstThrow() ;
				
				}
			}else if(frames.get(i).isStrike() && i != frames.size()-1){
				
				score+=frames.get(i).score()+frames.get(i+1).score();
				//System.out.println(score+" iz strika");
				
			}
			
			else{
			
				score=score+frames.get(i).score();
			}
			
		}
		
		//System.out.println(score);
		
		return score;
	}
}
