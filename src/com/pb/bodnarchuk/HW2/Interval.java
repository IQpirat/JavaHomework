package com.pb.bodnarchuk.HW2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
int a;
        System.out.println("введіть число від 0-100");
        Scanner peremenna = new Scanner(System.in);
a=peremenna.nextInt();
if (a>=0&&a<=14){
    System.out.println("діапазон 0-14");

}else if (a<=35) {
    System.out.println("діапазон 15-35");
}else if (a<=50){
    System.out.println("діапазон 50");
}else if (a<=100){
    System.out.println("діапазон 100");
}else {
    System.out.println("нема числа в діапазоні");
}




    }
}
