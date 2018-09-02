package funkcje;

import java.util.Scanner;

public class string_to_int {

    static int strtoint(String text){
        String textint = "";
        char tab[] = new char[text.length()+1];
        for(int i=0; i<text.length(); i++){
            tab[i] = text.charAt(i);
        }
        for(int i=0; i<text.length(); i++) {
            if (Character.isDigit(tab[i]))
            {
                if(Character.isDigit(tab[i+1])){
                    textint = textint+text.charAt(i);
                }
                else
                {
                    textint = textint+text.charAt(i);
                    break;
                }
            }
            else
                continue;
        }
        if(textint.isEmpty())
        {
            System.out.println("Nie masz liczby w tekscie do przetworzenia");
            return 0;
        }
        else {
            int a = Integer.parseInt(textint);
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj text: ");
        String word = s.nextLine();
        System.out.println(strtoint(word));
    }
}
