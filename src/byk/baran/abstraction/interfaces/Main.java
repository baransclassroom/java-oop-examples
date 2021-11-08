package byk.baran.abstraction.interfaces;

import java.math.BigDecimal;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 00:19
 **/

/**
 * 1- What is interface? What is purpose of Interface and where should we use it?
 * 2- What are differences between abstract classes and interfaces
 * 3-W hat is default method in the interfaces? Where should we use it?
 */
public class Main {

    public static void main(String[] args) {
        Discount dailyDiscount = new DailyDiscount(BigDecimal.valueOf(100));
        System.out.println(dailyDiscount.calculate());

        Discount superDiscount = new SuperDiscount(100);
        System.out.println(superDiscount.calculate());

    }
}
