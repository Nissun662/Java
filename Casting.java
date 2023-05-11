public class Casting {
    public static void main(String[] args) {
      
      
       /* this wont work unless casting is done
        int a = 257;
        byte b = a;
        System.out.println(b);
        */

       /* Here I did the casting so it worked
       but since 128 is out of the range of byte
       the result will be the modulus(remainder) of 256
       by the byte range which is 256 */
       int a = 257;
       byte b = (byte) a;
       System.out.println(b); 

       //lets try with float
       //we will get 5 as data loss occurs while converting float type to int type
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        //Type promotion done automatically by java without casting.
        //Since the result is 300 and it is not within the range of byte
        byte x = 10;
        byte y = 30;
        int result = x * y;
           System.out.println(result);


    }
}