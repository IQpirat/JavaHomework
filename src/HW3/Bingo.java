package HW3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int random = (int) (Math.random()*101);
        System.out.println("Bingo:" );
        System.out.println("введіть число від 0-100");
        System.out.println("якщо хочете вийти нажміть exit");
        String isExit;
        Scanner scan = new Scanner(System.in);

        for (int a = 1; a <= 100; a++) {

            System.out.println("введіть число спроб:" + a);
            isExit = scan.next();
            if (isExit.equals("exit")) {
                break;


            } else {
                int x = Integer.parseInt(isExit);
                while (x != random) {

                    String answer = x > random ? "введено чило менше загаданого " : "число більше50 загаданого";
                    System.out.println(answer);
                    break;
                }
                    if (x == random) {
                        System.out.println("вітаємо, ви угадали з спроби:" + a + "вірне число: " + x);
                        break;}




                }
            }
            System.out.println("кінець гри");

        }

    }
