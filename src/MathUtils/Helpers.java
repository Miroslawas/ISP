package MathUtils;

public class Helpers {
	
	public static int[] getMatrixColumn(int[][] matrix, int columnIndex)
	{
		int[]result = new int[matrix.length];
		
		for(int row = 0; row < matrix[0].length; row++)
		{
			result[row] = matrix[row][columnIndex];
		}
		
		return result;
	}
	
	public static int getColumnCount(int[][]matrix)
	{
		return matrix.length;
	}
	
	public static int[][] rotateMatrix(int[][] matrix)
	{
	    int backupH = matrix.length;
	    int backupW = matrix[0].length;
	    int w = backupH;
	    int h = backupW;
	    int[][] ret = new int[h][w];
	    
	    for (int i = 0; i < h; ++i) 
	    {
	        for (int j = 0; j < w; ++j) 
	        {
	            ret[i][j] = matrix[w - j - 1][i];
	        }
	    }

	    return ret;
	}
}
