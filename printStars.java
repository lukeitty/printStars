public class printStars
{

	public static void main(String args[])
	{
		reverseStaircase(5);
		System.out.println("----------------");
		staircase(5);
		



	}
	
	/**
	*This method makes a reverse staircase of stars
	*@param takes in an int that represents the amount of rows in the staircase
	*/
	public static void reverseStaircase(int n)
	{
		
		char star = '*';
		int row = 0;
		
		while(row < n)
		{
			int newCount = n - row;
			int col = 0;
			while(col < newCount)
			{
				System.out.print(star);
				col++;
				
			}
			System.out.println();
			row++;	
		}
	}
	
	/**
	*This method makes a staircase of stars
	*@param takes in an int that represents the amount of rows in the stairsscase
	*/
	public static void staircase(int n)
	{
		
		char star = '*';
		int row = 0;
		int count = 1;
		
		while(row < n)
		{
			int newCount = count + row;
			int col = 0;
			while(col < newCount)
			{
				System.out.print(star);
				col++;
				
			}
			System.out.println();
			row++;	
		}
	}





}