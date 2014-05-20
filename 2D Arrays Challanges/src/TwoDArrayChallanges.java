public class TwoDArrayChallanges
	{
	static int counter2 = 0;
	static int sumOfArray = 0;
	static int counter = 9;

	public static void main(String[] args)
		{
		int array1[][] =
			{
				{ 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		System.out.println(array1[2][1]);

		String mullen[][] = new String[4][3];
		for (int i = 0; i < 4; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				mullen[i][j] = "MHS ";
				}
			}
		for (int i = 0; i < 4; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				System.out.print(mullen[i][j]);
				}
			System.out.println();
			}

		int array3[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				counter++;
				array3[i][j] = counter;
				}
			}
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				System.out.print(array3[i][j] + " ");
				}
			System.out.println();
			}
		System.out
				.println(((array3[0][0]) + (array3[2][0]) + (array3[0][2]) + (array3[2][2])));

		int array4[][][] = new int[3][3][3];
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				for (int k = 0; k < 3; k++)
					{
					counter2++;
					array4[i][j][k] = counter2;
					}
				}
			}
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				for (int k = 0; k < 3; k++)
					{
					sumOfArray = sumOfArray + (array4[i][j][k]);
					}
				}
			}
		System.out.println(sumOfArray);
		}
	}
