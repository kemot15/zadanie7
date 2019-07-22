package zad1;

public class NameTest {
    public static void main(String[] args) {
        Names names = new Names();
        String[] nameList = new String[5];
        System.out.println("Podaj 5 imion");
        for (int i = 0; i < nameList.length; i++){
            nameList[i] = names.setName();
        }

        for (int i = nameList.length -1; i>=0; i--) {
            System.out.println("Czesc " + nameList[i]);
        }
    }
}
