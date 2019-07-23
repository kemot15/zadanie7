package zad3;

public class Numbers {
    public String showInfo (boolean option){
        if (option){
            String result = "";
            for (int i =0; i<=100; i+=2)
                result +=   i + ", ";
            return  "Liczby parzyste w przedziale [0,100]: " +result;
        }else{
            int sum =0;
            for (int i =0; i<=100; i+=2)
                sum += i;
            return "Suma liczb parzystych w przedziale [0,100]: " + sum;
        }
    }
}
