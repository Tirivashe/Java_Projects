public class Fraction
{
    private int whole;
    private int numerator;
    private int denominator;


    // Create a paramaterless constructor, which sets
    // the whole number and numerator to 0 and the denominator to 1.
    public Fraction()
    {
        whole = 0;
        numerator = 0;
        denominator = 1;
    }


    // Create a constructor that accepts two parameters
    // for the numerator and denominator. When the constructor
    // is used, the whole number value is 0.
    public Fraction(int numerator, int denominator)
    {
        whole = 0;
        this.numerator = numerator;
        this.denominator = denominator;

    }


    // Create a constructor that accepts three parameters
    // for the whole number, numerator, and denominator.
    public Fraction(int whole, int numerator, int denominator)
    {
        Fraction imp = new Fraction();

        this.whole = whole;
        this.numerator = numerator;
        this.denominator = denominator;
        imp.numerator = (whole * denominator) + numerator;
    }

    // This calculates greatest common divisor (GCD)
    // I expect that you will find it useful
    int gcd(int a, int b)
    {
        if( b == 0 )
            return a;
        return gcd(b,a%b);
    }

    // Reduces the Fraction value to the lowest possible denominator
    // example 72/20 should be reduced to 18/5, which is also 3 3/5.
    public void reduce()
    {
        this.numerator = numerator/gcd(numerator,denominator);
        this.denominator = denominator/gcd(numerator,denominator);
        this.whole = numerator/denominator;
    }

    // Add the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction add(Fraction A)
    {
        Fraction result = new Fraction(whole,numerator,denominator);
        if(this.denominator == A.denominator){

            result.numerator = this.numerator + A.numerator;
            result.whole = A.whole + this.whole;
            result.reduce();
            return result;
        }
        else {
            result.numerator = this.numerator + A.numerator;
            result.denominator = this.denominator * A.denominator;
            result.whole = A.whole + this.whole;
            result.reduce();
            return result;
        }
    }

    // Fraction C = this - A;
    // Subtract the current Fraction Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction substract(Fraction A)
    {
        Fraction C = new Fraction();
        C.numerator = this.numerator - A.numerator;
        C.denominator = this.denominator * A.denominator;
        C.whole = A.whole + this.whole;
        C.reduce();
        return C;
    }

    // Multiply the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction multiply(Fraction A)
    {
        Fraction result = new Fraction();
        result.numerator =  A.numerator * this.numerator;
        result.denominator =  A.denominator * this.denominator;
        result.reduce();
        return result;
    }

    // Divide Fractions (this/A), return the result as a new Fraction (reduced, of course)
    // You may assume that A will be a non-zero value
    public Fraction divide(Fraction A)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * A.denominator;
        result.denominator = this.denominator * A.numerator;
        result.reduce();
        return result;
    }

    // returns a string that contains a fraction in the format:
    // whole number, a space, the numerator, a slash (/), and a denominator (e.g: 2 3/4).
    // When the whole number is 0, just display the fraction part (e.g: 1/2 instead of 0 1/2.
    // When the numerator is 0, just display the whole number (e.g: 2 instead of 2 0/3).
    // Also, just display 3 instead of 3/1.
    public String toString()
    {

        if(numerator == denominator ){
            return "1";
        }
        else if(numerator == 0){
            return whole + "";
        }
        else if(denominator == 1){
            return whole + numerator + "";
        }
        else if(numerator == 0 && whole == 0){
            return "0";
        }
        else if(whole == 0){
            return numerator + "/" + denominator;
        }
        return whole + " " + numerator + "/" + denominator;
    }
}