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
		passengersToFloor[floor] += 1; 

	}

	public void move()
	{
	//	for(int i = 0; i < passengersToFloor.length; i+=direction)
		for(int i = 0; i < FLOOR_NUMBERS; i++)	
		{
			this.unload(i);
			this.toString(i);
		}
	}

	public void unload(int floor)
	{
		passengersToFloor[floor] = 0;
	}

	public void toString(int floor)
	{
		String plural; 
		if (getTotalPassengerNumber() == 1)
		{
			plural = "s";
		} 
		else
		{
			plural ="";
		}
		System.out.println("Floor " + floor + " : " +  this.getTotalPassengerNumber() + " passenger" + plural + ".");
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

		for(int i = 0; i < FLOOR_NUMBERS; i++)
		{
			System.out.println(elevator.getPassengerNumbertoFloor(i));
		}

		System.out.println("number of passenger: "  + elevator.getTotalPassengerNumber());
		elevator.move();
	}
}