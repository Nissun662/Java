class Calculator {
    public int add(int n1, int n2)
    {
        //int result = n1 + n2;
        //return result;
        return n1 + n2;
    }

    public int add( int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(int n1, int n2, int n3, int n4)
    {
        return n1 + n2 + n3 + n4;
    }

}

public class MoreMethod {
    public static void main(String[] args)
    {
    Calculator obj = new Calculator();
    double r = obj.add(1, 2, 3);
    System.out.println(r);   
    }
}

//Method overloading by creating the same NAME methods in Class Calculator
