import java.util.Scanner;
class Matrix
{
int value[][];
int row,col;

 Matrix(int row,int col){
  this.row=row;
  this.col=col;
  value = new int[row][col];
 }
 
 void setValue(){
  for(int i=0; i<this.row; i++)
   { 
     System.out.println("\t\tEnter row "+(i+1)+":");
     for(int j =0; j<this.col; j++)
     {  
	    System.out.println("Enter a element:");
        this.value[i][j] = new Scanner(System.in).nextInt();
     }
   }
 }
 
 static Matrix addMatrix(Matrix m1, Matrix m2)
 {
 Matrix m3 = new Matrix(m1.row,m1.col);
   if(m1.row!=m2.row || m1.col!= m2.col)
   System.out.println("Matrices cannot be added!!!");
   else
   {
     for(int i=0; i<m3.row; i++)
     {
       for(int j =0; j<m3.col; j++)
       {
          m3.value[i][j] = m1.value[i][j] + m2.value[i][j];
       }
     }
   }
 return m3;
 }
 
 void print()
 {
	for(int i=0; i<this.row; i++)
     {
		 System.out.println();
       for(int j =0; j<this.col; j++)
       { 
         System.out.print("   "+this.value[i][j]+"   ");
	   }
	 }
 }
 
 public static void main(String...h){
 
 System.out.println("Enter the number of rows and columns of first matrix:");
 int r1=  new Scanner(System.in).nextInt();
 int c1 = new Scanner(System.in).nextInt();
 Matrix m1 = new Matrix(r1,c1);
 m1.setValue();
 System.out.println("Enter the number of rows and columns of second matrix:");
 int r2=  new Scanner(System.in).nextInt();
 int c2 = new Scanner(System.in).nextInt();
 Matrix m2 = new Matrix(r2,c2);
 m2.setValue();
 Matrix m3 = addMatrix(m1,m2);
 System.out.println("Addition is:");
 m3.print();
 }
 
}
