package funkcje;

import java.util.Scanner;

public class ile_slow_w_tekscie {

    static int wordCount(String text){
        int slowa =0;
        for(int i=0; i<text.length(); i++)
        {
            if (Character.isWhitespace(text.charAt(i)))
                slowa++;
        }
        System.out.print("Ilosc slow w Twoim tekscie to: ");
        if(text.isEmpty()) return 0;
        else
        return slowa+1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zdanie, program zliczy ilosc slow: ");
        String zdanie = s.nextLine();
        System.out.println(wordCount(zdanie));
    }
}
