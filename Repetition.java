import java.util.Scanner;
 
/**
 * Lab 3: Repetition
 */
public class Repetition {
 
    /**
     * Program entry point.
     * Use as a driver for testing and debugging purpose.
     * 
     * @param args
     *
     */
    public static void main(String[] args) {
        /* Your testing can go here */
     
        even();
        System.out.println("");
        powers();
        System.out.println("");
        alphabet();
        System.out.println("");
        vertical("Hello");
        System.out.println("");
        testResults();
        //change as you need
    }
 
    /**
     * Generate and print out all even numbers from 0 to 100 (inclusive) on the same line.
     * 
     * output should be formatted exactly like what is between [].
     * [0 2 4 6 8 10 12 14 16 18 20 22 24 26 28  ... 98 100]
     */
    public static void even()
    {
        /* Your Code Goes Here */
      for(int i = 0; i <= 100; i++){
        System.out.print( i++ + " ");
      }
    }
 
    /**
     * Generate and print out all positive powers of 2 that are less than 1000.
     * 
     *  1. Declare an integer named exp (short for exponent). Initialize it with value 0.
     *  2. Iterate over increased values of exp. for every 2^(exp) less than 1000 
     *     (note that this is the loop exit condition); print that value out in the format below.
     *  3. To get the value of 2^(exp), use the expressionMath.pow(2, exp).
     * 
     * output should be exactly like what is between [].
     * [1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 512.0,]
     */
    public static void powers()
    {
        /* Your Code Goes Here */
      int exp = 0;
      for(int g = ((int)Math.pow(2, exp)) ; g <= 1000; ){
        if(g < 1000){
        System.out.print( ((double)(g)) + ", ");
        }
        g = g*2;
      }

    }
 
 
    /**
     * Print out the alphabet using Characters and a 'for loop'.
     * 
     * Make use of the below fact about type char to be able to iterate printing all the alphabet in small case.
     * 
     * 
     * Type char( like byte & short) is an integral type. 
     * Which means:
     *     - it is internally represented as an integer,and hence can accept integer arithmetic and logical operations.
     *     - A variable of type char initialized to value 'a' is internally represented as 97 
     *       (you can verify that by printing a variable of type char as an integer). 
     *     - Adding 1 to a char of value 'a' will yield 98 which is the representation of char 'b'.
      *    - The expression ('a' < 'z') is a valid boolean expression that evaluates to true. 
     * 
     * 
     * output should be exactly like what is between [].
     * 
     *  [abcdefghijklmnopqrstuvwxyz]
     */
    public static void alphabet()
    {
        /* Your Code Goes Here */
      for( char h = 97; h <= 'z' ; h++){
        System.out.print(h);
      }
 
    }
 
 
    /**
     * Print out every letter of the string s, each on its own line.
     * Sample Output for argument "Hello":
     * ===================================
     * H
     * e
     * l
     * l
     * o
     * 
     *  Hints
     *  =====
     *  - To convert String to character array consult class String api.
     *  - To test this method, write the line vertical(?Hello?) in your main method 
     *    (?Hello? can be replaced by any string)
     * 
     * @param s : input string.
     * @see http://docs.oracle.com/javase/6/docs/api/java/lang/String.html#toCharArray().
     */
    public static void vertical ( String s) {
        /* Your Code Goes Here */
      char data[] = s.toCharArray();
      //int n = new int(data);
      Character[] array = new Character[s.length()];
      for( int k = 0; k < s.length() ; k++){
        System.out.println(s.charAt(k));
      }
 
    }
 
    /**
     * Print test result summary.
     * Requirements
     * 
     *  - Print out ?Enter scores now:?
     *  - Takes in scores (ints) from the user until they 
     *     enter a -1.
     *  - After the user enters -1, you will print out the
     *     lowest score, the highest score, and the average 
     *     of the scores (rounded to the floor, or greatest integer not exceeding the average).
     *     See the format outlined in the instructions' sample execution.
     * 
     * Hints 
     *  - You can calculate the average by maintaining the sum of all the grades and the count
     *    of all the grades and only calculating the average when the user is done supplying the grades.
     *  - Maintain one variable for each statistic (count, sum, lowest, highest), 
     *    updating each of them for each grade entered.
     *  - When printing the output; note that the output statistics are right justified.
     * 
     */
    public static void testResults() {
        /* Your Code Goes Here */
      Scanner scanner = new Scanner(System.in);
     // Array myArray = new Array[j];
      int score = 0;
      int avg = 0;
      int low = 0;
      int high = 0;
      int count = 0;
      System.out.println("Enter scores now:");
      //score = scanner.nextInt();
      while (scanner.hasNextInt() ){
      score = scanner.nextInt();
      count = count + 1;
      }
      for(int j = 0; j <= count; j++){
        avg = (avg + score)/(count);
      }
      if(score <= 98){
        low = score;
        if(score < low)
          score = low;
      }
      
      if(score >= 99){
        high = score;
        if(score > high)
          score = high;
      }
      
      if(score < 0){
      
        System.out.println("=====-----=====-----=====-----=====");
        System.out.println("=            Test Results         =");
        System.out.println("= Average:                     " + avg + " =");
        System.out.println("= Lowest:                      " + low + " =");
        System.out.println("= Highest:                      " + high + " =");
        System.out.println("=====-----=====-----=====-----=====");
      }
      
      
    }
}