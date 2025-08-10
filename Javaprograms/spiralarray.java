public class spiralarray {
    public static int diagonalsum(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(i==j)
                {
                    sum=sum+matrix[i][j];
                }
                else if(i+j==matrix.length-1)
                {
                    sum=sum+matrix[i][j];

                }
            }
        }
        return sum;
    }
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcolumn=0;
        int endrow=matrix.length-1;
        int endcolumn=matrix.length-1;
        while(startrow<=endrow && startcolumn<=endcolumn)
        {
            //top part
            for(int j=startcolumn;j<=endcolumn;j++)
            {

                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][endcolumn]+" ");
            }
            //bottom
            for(int j=endcolumn-1;j>startcolumn;j--)
            
            {

                if(startcolumn==endcolumn)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>startrow;i--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[i][startcolumn]+" ");
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
      
    }
    public static boolean staircasesearch(int matrix[][],int key)
    {
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0)

        {
            if(matrix[row][col]==key)
            {
                System.out.println("the key is found at"+row+","+col);
                return true;
                
            }
            else if (key<matrix[row][col])
            {
            col--;
            }
            else{
                row++;
            }
           
            
        }
        System.out.println("not found");
        return false;
    }
      public static void main(String args[]){
        int matrix [][]={
            { 10,20,30,40},
            {15,26,37,48},
            {19,27,41,52},
            {23,34,55,56}};
           printspiral(matrix);
        //   System.out.println( diagonalsum(matrix));
        //  staircasesearch(matrix, 15);
           
    }    
}
