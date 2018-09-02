package funkcje;

import java.util.Scanner;

public class sprawdzanie_lancucha_textu {

    static boolean startsWith(String text, String text2)
    {
        if(text.startsWith(text2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zdanie: ");
        String zdanie = s.nextLine();
        System.out.print("Podaj prefix jakiego szukasz: ");
        String prefix = s.next();
        System.out.println(startsWith(zdanie, prefix));
    }
}
