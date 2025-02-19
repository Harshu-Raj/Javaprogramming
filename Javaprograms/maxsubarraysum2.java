public class maxsubarraysum2{
    public static void maxsum2(int num[])
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                // if(start==0)
                // {
                //     cs=prefix[i];
                // }
                // else{
                //     cs=prefix[end]-prefix[start-1];
                // }
                // if(ms<cs)
                // {
                //     ms=cs;
                // }
                cs=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(ms<cs)
                {
                    ms=cs;
                }

                
            }
        }
        System.out.println("max sum ="+ms);
    }
    public static void main(String args[])
    {
        int num[]={1,2,3,4};
        maxsum2(num);
        
    }
}