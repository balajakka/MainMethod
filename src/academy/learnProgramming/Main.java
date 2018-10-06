package academy.learnProgramming;

/**
 * Created by balajakka on 06/10/2018.
 */
public class Main {
    public static void main(String[] args) {

        //Print's size of arguments

        System.out.println("args size=" + args.length);
     /*
      * printing aruguments
      * another line
     */
        for (int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "]=" + args[i]);
        }

        int addition = sum(2,3);
        System.out.println("sum of 2 and 3 is="+addition);


    }

    /**
     * calculates sum of two integers
     * @param a operand
     * @param b operand
     * @return sum of a and b
     */
    public static int sum(int a, int b){
        return a+b;
    }

}

