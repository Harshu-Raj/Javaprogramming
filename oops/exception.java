package oops;
 class exception {
 public static void main(String args[]){
    try{
        System.out.println(3);
        System.out.println("Hello world");
    }
    catch(Exception e){
        System.out.println("Exception:"+e.getMessage());
    }
    finally{
        System.out.println("hero heera lal");
    }
    System.out.println("Harsh");
 }   
}
