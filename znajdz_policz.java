package funkcje;

import java.util.Scanner;

public class znajdz_policz {

    static int strFindAndCount(String gdzie, String co){
        int licznik = 0;
            while(gdzie.indexOf(co)>=0)
            {
                licznik++;
                gdzie = gdzie.substring(gdzie.indexOf(co)+co.length());
            }
            return licznik;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zdanie: ");
        String zdanie = s.nextLine();
        System.out.print("Podaj fraze do zliczenia: ");
        String fraza = s.next();
        System.out.println("Ilosc wystapien szukanej frazy w tekscie: "+strFindAndCount(zdanie, fraza));

    }
}
