public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int _numerator) {
        numerator = _numerator;
    }

    
    public void setDenominator(int _denominator) {
        denominator = _denominator;
    }

    public Fraction(int _numerator, int _denominator) {
        numerator = _numerator;
        denominator = _denominator;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(
            numerator * fraction.getDenominator() + denominator * fraction.getNumerator(),
            denominator * fraction.getDenominator()
        );

    }

    public Fraction subtract(Fraction fraction) {
        return new Fraction(
            numerator * fraction.getDenominator() - denominator * fraction.getNumerator(),
            denominator * fraction.getDenominator()
        );
    }

    public Fraction multiply(Fraction fraction) {
        return new Fraction(
            numerator * fraction.getNumerator(),
            denominator * fraction.getDenominator()
        );
    }

    public Fraction divide(Fraction fraction) {
        return new Fraction(
            numerator * fraction.getDenominator(),
            denominator * fraction.getNumerator()
        );
    }

    public String toString() {
        return numerator + "/" + denominator + "\n";
    }
    
    // Simplify Fraction
    // Parms:: Fraction fraction_to_simplify
    // Returns:: Nothing, just simplifies the given fraction.
    
    public static void simplify(Fraction fraction_to_simplify) {
        int numerator_ = fraction_to_simplify.getNumerator(); // This will give us extra unneeded loops
        boolean can_be_simplified = true;

        while(can_be_simplified) {
        can_be_simplified = false;
        // Loops in java finish the last on going itteration even if the conditioanl is False, so we give the fraction a chance to be simplied, and if can, it will try to simplify again until the fraction cannot be anymore.
        for(int i=2; i<=numerator_; i++) {
            if(fraction_to_simplify.getNumerator() % i == 0 && fraction_to_simplify.getDenominator() % i == 0) {
                can_be_simplified = true;
                fraction_to_simplify.setNumerator(fraction_to_simplify.getNumerator() / i);
                fraction_to_simplify.setDenominator(fraction_to_simplify.getDenominator() / i);
            }
        }
        }
    }
}