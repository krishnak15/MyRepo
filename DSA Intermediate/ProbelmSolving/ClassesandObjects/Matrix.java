/*
Class Matrix

Construct a class called Matrix which stores a 2D Array. It should store

The number of rows

The number of columns

The 2D Array itself

Implement the following functionalities inside this class :-

input() -> Reads the input from the user. This method should read the input from the user and populate the entire array. Each row will be in a new line and all the elements in a row will be space-separated.

add(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

subtract(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

transpose() -> Returns a new matrix containing the transpose of the given original matrix.

print() -> prints the entire matrix row by row. Each row will be in a new line and values in each row should be separated by a single space.

You may define any properties in the class as you see appropriate.
*/
static class Matrix {
    // Define properties here
	    int rows;
        int columns;
		ArrayList<ArrayList<Integer>> arlist=new ArrayList<ArrayList<Integer>>();
		// Define constructor here
		Matrix()
        {
            this.rows=0;
            this.columns=0;
        }

        Matrix(int row,int col)
        {
            this.rows=row;
            this.columns=col;
        }	
			
	void input(Scanner sc){
	    // Use the Scanner object passed as argument for taking input and not a new Scanner object
		// Complete the function
        int i=0;
        int j=0;        
		 ArrayList<ArrayList<Integer>> inputMat=new ArrayList<ArrayList<Integer>>();
            for(i=0;i<this.rows;i++)
            {
                ArrayList<Integer> col=new ArrayList<Integer>();                
                          
                for ( j = 0; j < this.columns; j++) 
                {
                    col.add(sc.nextInt());
                }
                
                inputMat.add(col);
              
            }
            this.arlist=inputMat;
	}	

	Matrix add(Matrix x){
		// Complete the function
		  int i=0;
            int j=0;
            int k=x.rows;
            int l=x.columns;
            ArrayList<ArrayList<Integer>> calmat=this.arlist;
            ArrayList<ArrayList<Integer>> addMat=new ArrayList<ArrayList<Integer>>();
            Matrix addm=new Matrix(x.rows,x.columns);
            for(i=0;i<k;i++)
            {
                ArrayList<Integer> col=new ArrayList<Integer>();    
                for(j=0;j<l;j++)
                {
                        col.add(calmat.get(i).get(j) + x.arlist.get(i).get(j));
                }
                addMat.add(col);
            }
            addm.arlist=addMat;
            return addm;
	}
	
	Matrix subtract(Matrix x){
		// Complete the function
		 int i=0;
            int j=0;
            ArrayList<ArrayList<Integer>> subMat=new ArrayList<ArrayList<Integer>>();
            Matrix subm=new Matrix(x.rows,x.columns);
            for(i=0;i<this.rows;i++)
            {
                ArrayList<Integer> col=new ArrayList<Integer>();    
                for(j=0;j<this.columns;j++)
                {
                        col.add(this.arlist.get(i).get(j) - x.arlist.get(i).get(j));

                }
                subMat.add(col);
            }
            subm.arlist=subMat;
            return subm;
	}
		
	Matrix transpose(){
		// Complete the function
		  int i=0;
            int j=0;
            ArrayList<ArrayList<Integer>> subMat=new ArrayList<ArrayList<Integer>>();
            Matrix subm=new Matrix(this.columns,this.rows);
            for(i=0;i<this.columns;i++)
            {
                ArrayList<Integer> col=new ArrayList<Integer>();    
                for(j=0;j<this.rows;j++)
                {
                        col.add(this.arlist.get(j).get(i));
                }
                subMat.add(col);
            }
            subm.arlist=subMat;
            return subm;
	}
	
	void print(){
		// Complete the function
		 int i=0;
            int j=0;
            for(i=0;i<this.rows;i++)
            {
              
                for(j=0;j<this.columns;j++)
                {
                      System.out.print(this.arlist.get(i).get(j) + " ");

                }
                System.out.println();
            }
	}
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/