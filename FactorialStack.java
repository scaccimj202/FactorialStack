/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *@assignment 4b
 *description: Factorial as a stack adapted from Clifford Shaffers Data Structures and Algorithim Analysis, Chapter 4.2.4
 */

public class FactorialStack{

    public static void main(String[] args){
        System.out.println(fact(3));
        System.out.println(fact(4));
        System.out.println(fact(5));
    }

    public static long fact(int n){
        assert (n >= 0 ) && (n <= 20) : "Number is out of range";
        LStack<Integer> stack = new LStack<Integer>(n);
        while(n > 1)
            stack.push(n--);
        long result = 1;
        while (stack.length() > 0)
            result = result * stack.pop();
        return result;
    }
 }