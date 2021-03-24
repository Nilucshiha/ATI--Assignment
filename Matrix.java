package atiAssignment;

public class Matrix {

	public static void main(String[] args) {
		int [][]arr= new int[2][2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]= j;
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
