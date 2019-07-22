package zad1;

import java.util.Scanner;

public class Names {
    public String setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        return scanner.nextLine();
    }
}
