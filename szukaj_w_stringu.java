package funkcje;

import java.util.Scanner;

public class szukaj_w_stringu {
    static int srtfind(String gdzie, String co){
        int pozycja;
        pozycja = gdzie.indexOf(co);
        if(pozycja >= 0 ) {
            System.out.print("Twoj tekst zaczyna sie na pozycji: ");
            return pozycja;
        }
        else System.out.println("Brak podanej frazy w tekscie.");
        return pozycja;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj tekst : ");
        String zdanie = s.nextLine();
        System.out.print("Podaj fraze ktora szukasz, prgram poda jej pozycje: ");
        String szukane = s.next();
        System.out.println(srtfind(zdanie, szukane));
    }
}
