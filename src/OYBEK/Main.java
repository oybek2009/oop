package OYBEK;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner scanner = new Scanner(System.in);
        System.out.println("1->Listni ko`rish");
        System.out.println("2->Almashtirish");
        System.out.print("= ");
        int n = scanner.nextInt();

        if (n == 1) {
            Fruit fruit = new Fruit("Olma", 6000);
            fruit.show();
            System.out.println("////////////////");

            Fruit fruit1 = new Fruit("Nok", 10000);
            fruit1.show();
            System.out.println("////////////////");

            Fruit fruit2 = new Fruit("Banan", 30000);
            fruit2.show();

        }else {
            Fruit fruit = new Fruit("Olma", 5000);
            fruit.show();
            System.out.println("////////////////");

            Fruit fruit1 = new Fruit("Nok", 8000);
            fruit1.show();
            System.out.println("////////////////");

            Fruit fruit2 = new Fruit("Banan", 28000);
            fruit2.show();




        }
     }
  }



