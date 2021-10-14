package com.pb.bodnarchuk.HW2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        double result;
        System.out.println("Введіть цифру №1");
        operand1 = scanner.nextInt();
        System.out.println("Введіть цифру №2");
        operand2= scanner.nextInt();

        System.out.println("Введіть знак ");
        sign=scanner.next();

        switch(sign){
            case "+":
                result=operand1 + operand2;
                System.out.println(result);
                break;
            case "-":
                result=operand1 - operand2;
                System.out.println(result);
                break;
            case "/":
                if (operand2 == 0) {System.out.println ("не правильно?");}
                else{
                    result=(double) operand1 / operand2;
                    System.out.println(result);}
                break;
            case "*":
                result=operand1 * operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("спрбуй ще?");
                break;

    }
}
}
