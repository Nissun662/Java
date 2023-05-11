/*
public class CondStmt {
    public static void main(String[] args) 
    {
        int x = 20;

        //if (x < 20) //result Bye
        //if (x > 18) //result Welcome
        //if (x > 21 && x<= 30) //F T --> F so Bye
        if (x > 1 && x<= 30) // T T --> T so Welcome
        {
            System.out.println("Welcome");
            System.out.println("What is your Name: ");
        }
        else
            System.out.println("Bye");
    }
}
*/


public class CondStmt {
    public static void main(String[] args) 
    {
        int x = 8;
        int y = 9;

        if (x > y) //More than 2 line of code use {  }
            {          
            System.out.println(x);
            System.out.println("Thank you");
            }
        else
            System.out.println("y");
            System.out.println("Thank you");
        
    }
}

