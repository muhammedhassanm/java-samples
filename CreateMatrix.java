import java.util.*;
import java.io.*;
 
class Matrix {
	char matrix[][];
	int row, column;
	void create() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Number of rows :");
		row = Integer.parseInt(sc.nextLine());
		System.out.println("Number of columns :");
		column = Integer.parseInt(sc.nextLine());
		matrix = new char[row][column];
		System.out.println("Enter the data :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = sc.next().charAt(0);
			}
		}
    }
    void possibilities(){

		System.out.println("Enter The Blocking elements");
		char block=sc.next();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
              {
                  if(i==0 && j==0|| i==0 && j==4 || i==3 && j==0 || i==4 && j==4){

					System.out.println("Only Three Possible Movement");
				  }
				 
              }

        }
    }
	void display() {
		System.out.println("\nThe Matrix is :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
                System.out.print("\t" + matrix[i][j]);

            }
            System.out.println();
            
		}
	}
}
 
class CreateMatrix {
	public static void main(String args[]) {
		Matrix obj = new Matrix();
		obj.create();
        obj.display();
        

	}
}