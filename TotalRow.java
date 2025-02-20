//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
        int rows = m.length;
        List<Integer> totals = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i<rows; i++)
        {
            for(int j : m[i])
            {
                sum+=j;
            }
            totals.add(sum);
            sum=0;
        }
		return totals;
    }
}
