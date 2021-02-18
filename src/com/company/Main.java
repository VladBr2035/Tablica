package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int x = 1;
        int y = 1;
        while (x != 11) {
            System.out.println(x*y + " ");
            y++;
        }
        System.out.println();
        x++;
        y = 1;
    }
    }

