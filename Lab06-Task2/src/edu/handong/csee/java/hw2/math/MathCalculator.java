package edu.handong.csee.java.hw2.math;
/**
 * This class is for math calculator.
 * It has one privat member and 15 public methods
 */
public class MathCalculator{
    private String name;

    /**
     * Setting name method
     * @param s is string value from user
     */
    public void setName(String s){
        name = s;
    }

    /**
     * Getging name method
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the max value between a and b
     * @param a integer value from user
     * @param b integer value from user
     * @return max value
     */
    public int getMax(int a, int b){
        if (a > b) {
            return a;
        }
        else return b;
    }

    /**
     * Returns the min value between a and b
     * @param a integer value from user
     * @param b integer value from user
     * @return min value
     */
    public int getMin(int a, int b){
        if (a > b) {
            return b;
        }
        else return a;
    }

    /**
     * Returns the absolute value of the input value
     * @param a integer value from user
     * @return absolute value of a
     */
    public int getAbs(int a){
        if (a < 0)
            return (a * -1);
        else return a;
    }

    /**
     * Returns the sum of the input values
     * @param a integer value from user
     * @param b integer value from user
     * @return sum of a and b
     */
    public int getSum(int a, int b){
        return (a+b);
    }

    /**
     * Returns the difference of the input valuess
     * @param a integer value from user
     * @param b integer value from user
     * @return difference of a and b
     */
    public int getDiff(int a, int b){
        return (a-b);
    }

    /**
     * Returns the product of the input values
     * @param a integer value from user
     * @param b integer value from user
     * @return product of a and b
     */
    public int getProduct(int a, int b){
        return (a * b);
    }

    /**
     * Returns quotient when a divided by b
     * @param a integer value from user
     * @param b integer value from user
     * @return quotient of division
     */
    public int getQuotient(int a, int b){
        return (a / b);
    }

    /**
     * Returns remainder when a divided by b
     * @param a integer value from user
     * @param b integer value from user
     * @return remainder of division
     */
    public int getRemainder(int a, int b){
        return (a % b);
    }

    /**
     * Returns a power of b
     * @param a integer value from user
     * @param b integer value from user
     * @return a power of b
     */
    public int getPower(int a, int b){
        int pw = a;
        if (b==0) return 1;
        for(int i = 0; i < b-1; i++){
            pw = pw * a;
        }
        return pw;
    }

    /**
     * Returns factorial of a
     * @param a integer value from user
     * @return factorial of a
     */
    public int getFactorial(int a){
        if (a <= 1) {
            return 1;
        }
        else
            return (getFactorial(a-1) * a);
    }

    /**
     * Returns the greatest common denominator of a and b
     * @param a integer value from user
     * @param b integer value from user
     * @return the greatest common denominator of a and b
     */
    public int getGcd(int a, int b){
        if (a % b == 0)
            return b;
        else
            return getGcd(b, a % b); 
    }

    /**
     * Returns the least common multiple of a and b
     * @param a integer value from user
     * @param b integer value from user
     * @return the least common multiple of a and b
     */
    public int getLcm(int a, int b){
        return (a * b) / getGcd(a, b);
    }

    /**
     * Returns the square of a
     * @param a integer value from user
     * @return the square of a
     */
    public int getSquare(int a){
        return a*a;
    }
}