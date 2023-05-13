public class MultiArray {
    public static void main(String[] args) 
    { 
        int nums [][] = new int [3][4];
      /*This will create an array of 3 rows
       * and inside that array there will me
       * 3 arrays of size 4 and by default all
       * value is Zero
       */

       for(int i = 0; i < 3; i++) //outter array with 3 rows
       {
            for (int j = 0; j < 4; j++) //inner arrays with 3 array 4 slots
            {
                nums[i][j] = (int)(Math.random() * 100); //Math.random library to generate random numbers
                System.out.print(nums[i][j] + " "); //will print 4 elements with space in 1 line
            }
            System.out.println(); //will change the line after printing one array
       }
        
    }
}