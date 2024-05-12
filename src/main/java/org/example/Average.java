package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description
 * Please, proceed to Average class and write a program that reads a sequence of integer values from standard input and finds the average value.
 * <p>
 * Details:
 * <p>
 * You must read sequence values until the next one is 0. Zero value means end of the input sequence.
 * The sequence is guaranteed to contain at least one value.
 * Average value is also an integer. Use integer operations.
 * <p>
 * input : 1 2 3 4 5 0  autput : 3
 */

public class Average {

    public static void main(String[] args) {
        avager();
    }
    static public int avager() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int iter = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
            iter++;
        }
        int average = sum / iter;
        System.out.println(average);
        return average;
    }
}


