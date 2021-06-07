package matrix;
import java.util.*;

public class Matrix {
   int n;
	int m;
	
	Matrix(int n,int m)
	{
		this.n=n;
		this.m=m;
	
	}
	
	 
	public  int [][]print()
	{
		Random rd=new Random();
		int mat[][]=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=rd.nextInt(10);
			}
			
		}
		return mat;
	}

}
