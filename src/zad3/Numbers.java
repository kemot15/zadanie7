package zad3;

public class Numbers {
    public String showInfo (){
        String result = "";
        int sum =0;
        for (int i =0; i<=100; i+=2) {
            if (i == 0) result += i;
            else result +=  ", " + i;
            sum += i;
        }
        return  "Liczby parzyste w przedziale [0,100]: " +result + "\nSuma: " + sum;
    }
}
