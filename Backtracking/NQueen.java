package Backtracking;
import java.util.*;

public class NQueen {
	static int N=4;
	static void print(int board[][])
	{
		for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			System.out.print(" "+board[i][j]+" ");
		}
	System.out.println();
	}
	}
	
	static boolean isSafe(int board[][],int row,int col)
	{
		int i,j;
		
		for( i=0;i<col;i++)
		{
			if(board[row][i]==1)
				return false;
		}
		for( i=row, j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j]==1)
				return false;
		}
		for(i=row,j=col;j>=0&&i<N;i++,j--)
		{
			if(board[i][j]==1)
				return false;
		}
		return true;
	}
	
	static boolean nQueen(int board[][],int col)
	{
		if(col==N)
		return true;
		for(int i=0;i<N;i++)
		{
			if(isSafe(board,i,col))
			{
			board[i][col]=1;
			if(nQueen(board,col+1))
			return true;
			board[i][col]=0;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		 int board[][] = { { 0, 0, 0, 0 },
                 { 0, 0, 0, 0 },
                 { 0, 0, 0, 0 },
                 { 0, 0, 0, 0 } };
		if(nQueen(board,0)==false)
		System.out.println("Not possible");
		
		
			print(board);
		
		
		
		
	}

}
