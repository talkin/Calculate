package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculate calculate = null;
        Float numberResult = null;

        while (true) {

            System.out.println("please input the calculate(1 2 3):");
            String chooseCalculate = scanner.nextLine();
            int choose = Integer.valueOf(chooseCalculate);

            System.out.println("please input the first number:");
            String numberOne = scanner.nextLine();
            Float one = Float.valueOf(numberOne);

            System.out.println("please input the operator(+ - * /):");
            String operator = scanner.nextLine();

            System.out.println("please input the second number:");
            String numberTwo = scanner.nextLine();
            Float two = Float.valueOf(numberTwo);


            if (choose == 1) {
                calculate = new Calculate1();
            } else if (choose == 2) {
                calculate = new Calculate2();
            } else if (choose == 3){
                calculate = new Calculate3();
            }

            if (operator.equals("+")) {
                numberResult = calculate.add(one, two);
            } else if (operator.equals("-")) {
                numberResult = calculate.sub(one, two);
            } else if (operator.equals("*")) {
                numberResult = calculate.mul(one, two);
            } else if (operator.equals("/")) {
                numberResult = calculate.div(one, two);
            }

            String result = String.valueOf(numberResult);
            System.out.println("the result is: \n" + result + "\n");

        }

    }

}
