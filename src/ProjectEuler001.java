import java.util.ArrayList;
import java.util.Arrays;

public class ProjectEuler001 
{
	public static void main(String[] args) 
	{	
		int[] groundValues = new int[] {3, 5};
		System.out.println("We are calculating the multiples of: " + Arrays.toString(groundValues));
		
		Integer maxValue = 1000;
		System.out.println("But only the ones that are smaller than: '" + maxValue + "'");
		
		Integer[] multiples = getMultiples(groundValues, maxValue);
		System.out.println("The multiples are: " + Arrays.toString(multiples));
		
		int result = sumArrayValues(multiples);
		System.out.println("The sum of them all is: '" + result + "'");
	}
	
	private static Integer[] getMultiples(int[] groundValues, int maxValue)
	{
		ArrayList<Integer> allMultiples = new ArrayList<Integer>();
		
		for (int i = 1; i < maxValue; i++)
		{
			for (int groundValueIndex = 0; groundValueIndex < groundValues.length; groundValueIndex++)
			{				
				if (i % groundValues[groundValueIndex] == 0) 
				{
					allMultiples.add(i);
				}
			}
		}
		
		return (Integer[])allMultiples.toArray(new Integer[0]);
	}
	
	private static int sumArrayValues(Integer[] valuesToMultiplicate)
	{
		if (valuesToMultiplicate.length == 0)
		{
			return 0;
		}
		else
		{
			int result = valuesToMultiplicate[0];
			for (int i = 1; i < valuesToMultiplicate.length; i++)
			{
				result = result + valuesToMultiplicate[i];
			}
			return result;
		}
	}
}
