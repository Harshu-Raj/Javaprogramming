import java.util.ArrayList;
import java.util.List;
import java.util.*;


class spiral{
    public static void main(String[] args) {
       int  matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       List<Integer> list = new ArrayList<>(); 
       list=spiralOrder(matrix);
       for(int i=0;i<list.size();i++)
       {
        System.out.print(list.get(i)+" ");
       }
        
    }

        public static List<Integer> spiralOrder(int[][] matrix) {
       List<Integer>list= new ArrayList<Integer>() ;
       int i=0,j=0;
       int n=matrix.length;
       int m=matrix[0].length;
       int rsteps=n-1;
       int csteps=m-1;
       while(rsteps>=1 && csteps>=1)
       {
        for(int k=0;k<rsteps;k++)
       {
        list.add(matrix[i][j]);
        j++;
       }
       for(int k=0;k<csteps;k++)
       {
        list.add(matrix[i][j]);
        i++;
       }
       for(int k=0;k<rsteps;k++)
       {
        System.out.println("i="+i+" "+j+" "+k);
        list.add(matrix[i][j]);
        j--;
       }
       for(int k=0;k<csteps;k++)
       {
        list.add(matrix[i][j]);
        i--;
       }
       i++;
       j++;
       rsteps=rsteps-2;
       csteps=csteps-2;
       }
       if(rsteps==0)
      {
        for(int k=0;k<rsteps+1;k++)
       {
        list.add(matrix[i][j]);
        j++;
       }
       if(csteps==0){
        for(int k=0;k<rsteps+1;k++)
       {
        list.add(matrix[i][j]);
        i++;
       }
       }
      }
      
       return list;

    }
}