public class single {
    public static void main(String args[]){
        dog a1=new dog();
        a1.eats();
        a1.breathe();
        a1.leg=10;
        System.out.println(a1.leg);
    }
}
class Animal{
    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class dog extends Animal{
    int leg;
    // System.out.println("legs="+leg);
}
