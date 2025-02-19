public class leetcode1 {
    public static void main(String args[]){
        int num[]={1,2,3,4};
        int target=5;
        for(int i=0;i<num.length;i++)
        
        {
            for(int j=i;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    System.out.println(i+","+j);
                }
            }
        }
    }
    
}
