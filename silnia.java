package funkcje;

import java.util.Scanner;

public class silnia {

    static int silniaiteracja(int a)
    {
        int suma = 1;
        if(a==0) System.out.println("Silnia wynosi 0");
        else {
            for (int i = 1; i <= a; i++)
            {
                suma*=i;
            }
        }
        return suma;
    }
    static int silniarekurencja(int a)
    {
        if (a<2) return 1;
        return a*silniarekurencja(a-1);
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Program bedzie liczyl silnie z Twojej liczby.");
        System.out.print("Podaj liczbe: ");
        int a = sca.nextInt();
        System.out.println("Silnia wynosi: "+silniaiteracja(a));
        System.out.println("Silnia z rekurencji wynosi: "+silniarekurencja(a));

    }
}
