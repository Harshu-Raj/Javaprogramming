public class table {
    public static void main(String args[]){
        int cp=32500;
        float profit=.27f*cp;
        System.out.println("Profit="+profit);
        
        float vat=.127f*cp;
        System.out.println("VAT="+vat);
        float sc=(3.87f*cp)/100;
        System.out.println("Service charge="+sc);
        float sp=cp+profit+vat+sc;
        System.out.println("Selling price="+sp);
    }
}
