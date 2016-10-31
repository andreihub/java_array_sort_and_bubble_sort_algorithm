import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		int[] array = {3, 1, 9, 5, 4};
		//SortAndPrint(array);
		BubbleSort(array);
	}
	
	public static void SortAndPrint(int[] m)
	{
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		for (int i=m.length-1; i>=0; i--)
			System.out.print(m[i] + " ");
		System.out.println("");
	}
	
	public static void BubbleSort(int[] m)
	{
		int povtoriv = 0;
		boolean vidbulasZamina = true;
		while(vidbulasZamina)
		{
			vidbulasZamina=false;
			for (int i=0; i<m.length-1-povtoriv; i++)
			{
				if (m[i]>m[i+1])
				{
					int tmp = m[i];
					m[i] = m[i+1];
					m[i+1] = tmp;
					vidbulasZamina=true;
				}
			}
			povtoriv++;
		}
		for (int i: m)
			System.out.print(i + "  ");
	}
	
}