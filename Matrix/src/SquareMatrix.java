class SquareMatrix extends Matrix
{
    // Constructor that takes 2D array of integers
    public SquareMatrix (int[][] data)
    {
        super(data);
    }

    // return true if the matrix is diagonal.
    // Otherwise, return false. (5pts)
    public boolean isDiagonal()
    {
         if(super.row == super.column){
             for(int i = 0; i < data.length; i++){
                 for(int j = 0; j < data.length; j++){
                     if(data[i][i] !=0 && data [i][j] == 0){
                         return true;
                     }
                 }
             }
         }
        return false;
    }

    // returns true if it is an upper triangular matrix.
    // Otherwise, return false. (5pts)
    public boolean isUpperTriangle ()
    {
        /* YOUR CODE HERE */
    }

    // returns true if it is a lower triangular matrix.
    // Otherwise, return false. (5pts)
    public boolean isLowerTriangle ()
    {
        /* YOUR CODE HERE */
    }
}