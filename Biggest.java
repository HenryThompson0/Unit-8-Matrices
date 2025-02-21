//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
        int rows = m.length;
        int currentMax = Integer.MIN_VALUE;

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<m[i].length; j++)
            {
                if (m[i][j]>currentMax)
                {
                    currentMax=m[i][j];
                }
            }
        }

		return currentMax;
    }
}
