
public interface Client {
	
	//This gets the Maze from the server
	public Maze getMaze();
	//This method checks which game number is being played
	public int getGameNo();
	//This method checks with the gameGUI if the user has not made a move for 100s 
	//or user closes window
	public boolean timeOut();
	//This checks if it individual game is won
	public boolean win();
	//This returns the time of each game
	public int getTime();
}
