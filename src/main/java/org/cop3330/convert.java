/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class convert {
    public static double toC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toF(double c) {
        return (c * 9 / 5) + 32;
    }
}
