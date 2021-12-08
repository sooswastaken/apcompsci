public class FractionDriver {
    public static void main(String[] args) {
        Fraction fraction_one = new Fraction(9, 273);
        Fraction fraction_two = new Fraction(4, 1);


        System.out.println("Adding fraction two to fraction one");
        System.out.println(fraction_one.add(fraction_two));
        
        System.out.println("Subtracting fractione two from fraction one ");
        System.out.println(fraction_one.subtract(fraction_two));

        System.out.println("Multipling fraction two and one");
        System.out.println(fraction_one.multiply(fraction_two));
        
        System.out.println("Dividing fraction one by fraction two");
        System.out.println(fraction_one.divide(fraction_two));
        
        
        System.out.println("Simplifing fraction one");
        Fraction.simplify(fraction_one);
        // The simplify static method doesnt return anything, so we have to print it out.
        System.out.println(fraction_one);
    }
}