/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isndivisiblebyxandy;

/**
 *
 * @author xrist
 */
public class IsNDivisibleByXAndY {

    public static void main(String[] args) {

    }

    public static boolean isDivisible(long n, long x, long y) {
        if (x <= 0 || y <= 0) {
            return false;
        }
        return n % x == 0 && n % y == 0;
    }
}
