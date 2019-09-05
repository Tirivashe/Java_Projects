public class Inheritance{

    protected String number;
    protected Date expirationDate;
    protected String firstName;
    protected String lastName;
    protected String securityCard;
    protected int PIN;
    protected double balance;
    protected Address address;

    public Inheritance(){

    }

   public void printCardInfo(){
       System.out.println("Card number:\t" + number);
       System.out.println("First name:\t" + firstName);
       System.out.println("Last name:\t" + lastName);
       System.out.println("Balance:\t" + balance);
   }
}
