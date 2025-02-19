public class maxsubarraysum {
    public static void maxsum(int num[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i+1;j<num.length;j++)
            {
                int end=j;
                cs=0;
                for(int k=start;k<=end;k++)
                {
                    cs=cs+num[k];
                }
                System.out.println(cs);
                if(ms<cs)
                {
                    ms=cs;
                }

            }
        }
        System.out.println("maximum sum ="+ ms);
    }
    public static void main(String args[])
    {
       int num[]={1,2,3,4};
       maxsum(num);

    }
}
