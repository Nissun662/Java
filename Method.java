class Ipod {
    public void PlayMusic() //method
    {
        System.out.println("Playing. . .");
    }

    public String BuyPen(int cost) //method
    {
        if (cost < 10)
            return "No money no pen!";
        else
            return "No money no pen";

    }
}

public class Method {
    public static void main(String[] args) 
    {
    Ipod obj = new Ipod(); //Created object
    obj.PlayMusic();
    String str = obj.BuyPen(8); //Returing string as per the price
    System.out.println(str); //prints string in if else
    }
    

}
