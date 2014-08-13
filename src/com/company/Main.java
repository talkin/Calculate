package com.company;

import java.util.Scanner;

import static com.company.Currency.parse;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        Float numberResult;

        while (true) {

            System.out.println("please input the kind of money(CNY USD INR):");
            String inputChoose = scanner.nextLine();

            System.out.println("please input the first number:");
            String numberOne = scanner.nextLine();
            Float one = Float.valueOf(numberOne);

            System.out.println("please input the operator(+ - * /):");
            String operator = scanner.nextLine();

            System.out.println("please input the second number:");
            String numberTwo = scanner.nextLine();
            Float two = Float.valueOf(numberTwo);

            System.out.println("please output the kind of money(CNY USD INR):");
            String outputChoose = scanner.nextLine();

            calculate.withInputRatio(parse(inputChoose));

            if (operator.equals("+")) {
                calculate.add(one, two);
            } else if (operator.equals("-")) {
                calculate.sub(one, two);
            } else if (operator.equals("*")) {
                calculate.mul(one, two);
            } else if (operator.equals("/")) {
                calculate.div(one, two);
            }

            numberResult = calculate.getResult(parse(outputChoose));

            String result = String.valueOf(numberResult);
            System.out.println("the result is: \n" + result + "\n");

        }

    }

}
