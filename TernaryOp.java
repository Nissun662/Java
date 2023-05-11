public class TernaryOp {
    public static void main(String[] args) 
    {
        int n = 201;
        String result = " ";

        // if (n%2==0)
        //     result = "Even";
        // else
        //     result = "Odd";
    

        //Using Ternary Operator (?:) the above code will be
        result = n%2==0 ? "Even" : "Odd";

        System.out.println(result);
    }
}