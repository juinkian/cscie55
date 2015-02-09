package cscie55.hw1;

public class Elevator
{
	//Class constant
	private static final int FLOOR_NUMBERS = 7;
	public static final int UP = 1; 
	public static final int DOWN = -1; 

	private int direction = UP;
	private int currentFloor = 1;
	private int [] passengersToFloor = new int [FLOOR_NUMBERS];


	//Constructor
	public Elevator()
	{
		for(int i = 0; i < passengersToFloor.length; i++)
	{
			passengersToFloor[i] = 0;
		}
	}

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
		return currentFloor + " :" + "" + " passengers";
	}

	public static void main(String argv[])
	{
		Elevator elevator = new Elevator();
		System.out.println("hi");
	}
}