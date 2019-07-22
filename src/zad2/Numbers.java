package zad2;

public class Numbers {
    public static void main(String[] args) {
        double i = 0;
        while (i < 3.1){
            System.out.printf("%2.1f, ", i);
            i += 0.1;
        }
        System.out.println();
        i = 0;

        do {
            System.out.printf("%2.1f, ", i);
            i += 0.1;
        }while (i < 3.1);
    }
}
