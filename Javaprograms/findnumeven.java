public class findnumeven {
    public int findnum(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
                if(even(nums[i])){
                    count++;
                }

        }
        return count;
    }
  

     static int digit(int num){
        int count=0;
        if(num<0){
            num=num*-1;

        }
        if(num==0){
            return 0;

        }
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static boolean even(int num) {
        int noofdig=digit(num);
        return noofdig%2==0;
    }
      
   
    public static void main(String args[]){
        findnumeven num=new findnumeven();
        int arr[]={12,1234,123456,11231234,1111111111};
        
        System.out.println(num.findnum(arr));
    }
}
