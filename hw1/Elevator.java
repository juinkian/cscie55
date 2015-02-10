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
	private int totalPassengerNumber= 0;


	//Constructor
	public Elevator()
	{
		for(int i = 0; i < passengersToFloor.length; i++)
	{
			passengersToFloor[i] = 0;
		}
	}

	private void goUp()
	{
		direction = UP;
	}

	private void goDown()
	{
		direction = DOWN;
	}


	public void boardPassenger(int floor)
	{
		passengersToFloor[floor] += 1; 

	}

	public void move()
	{
	//	for(int i = 0; i < passengersToFloor.length; i+=direction)
		int i = 0;
		do 
		{
			this.unload(i);
			System.out.println(this);
			this.checkDirection(i);
			i += direction;
		} while (i != 0); 


	}

	public void unload(int floor)
	{
		passengersToFloor[floor] = 0;
	}

	public void checkDirection(int floor)
	{
		if (floor == 0 )
		{
			this.goUp();
		}
		else if ( floor == 6)
		{
			this.goDown();
		}
	}	
	public String toString()
	{
		String plural; 
		if (getTotalPassengerNumber() == 1)
		{
			plural = "";
		} 
		else
		{
			plural ="s";
		}
		return "Floor " + "1" + " : " +  this.getTotalPassengerNumber() + " passenger" + plural + ".";
	}

	// Getter method
	public int getDirection()
	{
		return direction;
	}

	public int getPassengerNumbertoFloor(int floor)
	{
		return passengersToFloor[floor];
	}

	public int getTotalPassengerNumber()
	{
		totalPassengerNumber = 0;
		for(int i = 0; i < passengersToFloor.length; i++)
			{
					totalPassengerNumber += passengersToFloor[i];
			}

		return totalPassengerNumber;
	}

	public static void main(String argv[])
	{
		Elevator elevator = new Elevator();

		elevator.boardPassenger(3);
		elevator.boardPassenger(3);
		elevator.boardPassenger(5);

		elevator.move();
	}
}