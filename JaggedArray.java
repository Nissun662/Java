public class JaggedArray {
    public static void main(String[] args) 
    { 
        int nums [][] = new int [3][];  //Jagged Array
        nums[0] = new int [3];
        nums[1] = new int [4];
        nums[2] = new int [2];


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