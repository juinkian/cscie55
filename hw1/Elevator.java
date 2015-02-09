package cscie55.hw1.Elevator

public class Elevator
{
	//Class constant
	private static final int FLOOR_NUMBERS = 7;
	public static final int UP = 1; 
	public static final int DOWN = -1; 

	private int direction = UP;

	int currentFloor = 1;

	public void goUp()
	{
		direction = UP;
	}

	public void goDown()
	{
		direction = DOWN;
	}

	public void boardPassenger(int floor)
	{

	}

	public String toString()
	{
		return currentFloor + " :" + + " passengers".
	}

}