package funkcje;

public class fibonacci {

    static int fibonaccirekurencja(int n)
    {
        if(n<=1) return n;
        else return fibonaccirekurencja(n-1)+fibonaccirekurencja(n-2);
    }
    static int fibonacciiteracja(int n){
        int wynik = 0;
        int elementA =0, elementB=1;
                if(n<=1) return n;
        else {
                    for (int i =2; i<=n; i++)
                    {
                        wynik=elementA+elementB;
                        elementA=elementB;
                        elementB=wynik;
                    }
                    return wynik;
                }
    }



    public static void main(String[] args) {
        System.out.println(fibonaccirekurencja(8));
        System.out.println(fibonacciiteracja(8));

    }
}
