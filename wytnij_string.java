package funkcje;

import java.util.Scanner;

public class wytnij_string {

    static String strcut(String text, int start, int ile){
            String text1, text2;
            text1 = text.substring(0, start);
            text2 = text.substring(start+ile, text.length());
            text = text1+text2;
        return text;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zdanie: ");
        String zdanie = s.nextLine();
        System.out.print("Podaj index w ktorym chcesz wyciac text:");
        int a = s.nextInt();
        System.out.print("Ile miejsc chcesz wyciac zaczynajac od startu: ");
        int b = s.nextInt();
        System.out.println("Twoj nowy tekst wyglada tak: "+strcut(zdanie, a, b));

    }
}
