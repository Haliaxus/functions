package funkcje;

import java.util.Scanner;

public class pozycja_znaku {

    static int strpos(String word, char z)
    {
        return word.indexOf(z);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String zdanie = s.nextLine();
        System.out.print("Jaki znak chcesz wyszukac?: ");
        Character znak = s.next().charAt(0);

        System.out.println(strpos(zdanie, znak));
    }
}
