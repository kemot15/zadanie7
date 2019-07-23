package zad4;

import java.util.Scanner;

public class Quiz {
    public boolean check (int num){
        if (num>=100 && num<=200){
            if (num%3 == 0){
                System.out.println("Twoja liczba jest ok");
                return false;
            }else {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
                return true;
            }
        }else if (num<100){
            System.out.println("Twoja liczba jest za mala");
            return true;
        }else {
            System.out.println("Twoja liczba jest za duza");
            return true;
        }
    }

    public void show (){
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        while (check(number));

        scanner.close();
    }
}
