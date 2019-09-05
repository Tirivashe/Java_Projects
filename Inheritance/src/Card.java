public class Card extends Inheritance {
    private double limit;

    public void printCardInfo(){
        System.out.println("This is a credit card.");
        super.printCardInfo();
        System.out.println("Limit:\t" + limit);
    }
}
