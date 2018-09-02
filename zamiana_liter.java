package funkcje;

import java.util.Scanner;

public class zamiana_liter {

    private static String flipCase(String text)
    {
        String textcopy = "";
        for(int i=0; i<text.length(); i++)
        {
            if(Character.isLowerCase(text.charAt(i))) textcopy = textcopy + text.valueOf(text.charAt(i)).toUpperCase();
            else if(Character.isUpperCase(text.charAt(i))) textcopy = textcopy + text.valueOf(text.charAt(i)).toLowerCase();
            else textcopy = textcopy+text.valueOf(text.charAt(i));
        }
        return textcopy;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zdanie, program zamieni male litery na duze i odwrotnie: ");
        String zdanie = s.nextLine();
        System.out.println("Twoje zdanie: "+ zdanie +" po przeksztalceniu wyglada tak: ");
        System.out.println(flipCase(zdanie));
    }
}
