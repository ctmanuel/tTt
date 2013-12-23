package MainGame;

import java.util.HashMap;
import java.util.Map;

import javax.tools.JavaFileManager.Location;

public class Board {

	static private Board instance = null;
	Map<Location, Integer> gameBoard = new HashMap<Location, Integer>();
	
	private Board(){
		
	}
	
	//make new instance
	public void makeInstance(){
		instance = new Board();

	}
	
	//get instance
	public Board getInstance(){
		return instance;
	}
	
	public void fillBoard(){
		
	}
	
}
