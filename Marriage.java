class getMarried {
    public int boylegal() {
        int m = 20;
        return m;
    }

    public int girllegal() {
        int n = 18;
        return n;
    }
    // public String illegal()
    // {
    // String s = "Wait for it kiddo!";
    // return s;
    // }
}

public class Marriage {
    public static void main(String[] args) {
        getMarried obj = new getMarried();

        // int legal = obj.boylegal(); obj.girllegal();
        // System.out.println("You have legal age to marry!");

        // String notLegal = obj.illegal();
        // System.out.println(obj.illegal());

        if (obj.boylegal() >= 21 && obj.girllegal() >= 18) {
            System.out.println("You have legal age to marry!");
        } else
            System.out.println("Wait for it Kiddo");

    }

}
