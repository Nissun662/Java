public class ThreeCond {
    public static void main(String[] args) 
    {
        int x = 2;
        int y = 17;
        int z =19;

        if (x > y && x > z)
        {
            System.out.println(x);
            System.out.println("Thank You!");
        }
        else if (y > z)
        //also written as (y > x && y > z) but no need to compare y to x as we know y>x from first if stmt.
        //if (y > z) will decrease the process and increase the efficiency. 
            System.out.println(y);
        
        else //if (z > x && z > y) No need to write this
            System.out.println(z);
    }
}