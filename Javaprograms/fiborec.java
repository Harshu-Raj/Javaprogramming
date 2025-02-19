import java. util.*;
class fiborec {
  public static int fibo(int n){
    int n1=1;
    int n2=1;
    int n3=0;
    if(n>0){
      n3=n1+n2;
      n1=n2;
      n2=n3;
return n3;
    }
    return fibo(n-1);
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  System.out.println(fibo(n));
    }
  }

  
