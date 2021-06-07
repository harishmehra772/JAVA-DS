package matrix;

import matrix.Matrix;
public class Snake {
	
	public static void main(String ars[])
	{
		Matrix mat=new Matrix(3,3);
		int matr[][]=new int[3][3];
		matr=mat.print();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.print(matr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
