/*
 * Have a variable int type and anothe with float type.
 * Use a^2+b^2 formula and store the result in double type
 * and convert the result back to int type.
 */
public class Exercise {
    public static void main(String[] args)
    {
        int a = 10;
        float b = 1.5678f;

        double c = (a*a) + (2*a*b) + (b*b);
        System.out.println("Value of the eqn is: "+c);

        int value = (int)c;
        System.out.println("value of the eqn is: " +value);

        



    }
}
