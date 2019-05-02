package com.stackroute;
import java.lang.String;
import java.util.Scanner;

public class Gueesingnumber {
    public static void main(String args[]) {
            int target = 50;
            Scanner scn = new Scanner(System.in);
            while (true) {
                System.out.println("enter the number");
                int num = scn.nextInt();
                if (num < target) {
                    System.out.println("Lesser thn expectation");
                }
                else if (num > target) {
                    System.out.println("greater than expectation");
                }
                else {
                    System.out.println("target reached");
                    break; }

            }
        }
    }

