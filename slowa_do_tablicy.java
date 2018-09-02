package funkcje;

import java.util.Scanner;

public class slowa_do_tablicy {

    static int iloscslow(String text)
    {
        int ilosc_slow=0;
        for(int i=0; i<text.length(); i++)
        {
            if(Character.isWhitespace(text.charAt(i)))
                ilosc_slow++;
        }
        ilosc_slow++;
        return ilosc_slow;
    }

    static String[] podzielNaSlowa(String text){
        String tab_slow[] = new String[iloscslow(text)];
        int i=0, slowa = 0, białe_znaki = iloscslow(text)-1;
        while(text.length()!=0)
        {
            if(Character.isWhitespace(text.charAt(i)))
            {
                tab_slow[slowa] = text.substring(0, i);
                slowa++;
                text = text.substring(i+1);
                i = -1;
            }
            else if(białe_znaki==slowa)
            {
                tab_slow[slowa] = text.substring(0, text.length());
                text = "";
            }
            i++;
        }
        return tab_slow;
    }

    public static void main(String[] args) {
        System.out.println("Podaj zdanie, program wypisze slowa do tablicy.");
        Scanner s = new Scanner(System.in);
        String zdanie = s.nextLine();
        int a = iloscslow(zdanie);
        String tab[] = new String[a];
        tab = podzielNaSlowa(zdanie);
        for (String x: tab
             ) {
            System.out.println(x);
        }


    }
}
