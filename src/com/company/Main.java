package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);

        int res = 0;
        int i=1;
  while (i<=50) {
      if (i % 3 == 0 && i% 5 == 0) {
          res+=i;
          System.out.print(i + " ");
      }
      i++;
  }
        System.out.println();
        System.out.println(res);
    }
}
