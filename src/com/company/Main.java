package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int res = 0;
        int i=1;
  while (i<=100) {
      if (i % a == 0) {
          res++;
          System.out.print(i + " ");
      }
      i++;
  }
        System.out.println();
        System.out.println(res);
    }
}
