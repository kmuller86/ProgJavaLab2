public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        int dzielnik = 39;

        do {
            if (i % dzielnik == 0) {
                int dzielenie = i/dzielnik;
                System.out.println("Liczba " + i + " podzielna przez " + dzielnik);
            }
        } while(--i > 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        /* A */
        int[] tabInt = {3,5,2,1,4};
        System.out.println("rozmiar tablicy = " + tabInt.length);
        int a = tabInt.length;
        while (a > 0) {
            for (int zmienna : tabInt){
                System.out.println(zmienna);
                a--;
            }
        }
        /* B */
        double[] tabDouble = {32,51,23,11,46};
        System.out.println("rozmiar tablicy = " + tabDouble.length);
        int b = tabDouble.length;
        while (b > 0) {
            for (double zmienna : tabDouble){
                System.out.println(zmienna);
                b--;
            }
        }
        /* C */
        String[] tabString = {"Lukasz", "Patryk", "Tomek", "Kasper"};
        System.out.println("rozmiar tablicy = " + tabString.length);
        int c = tabString.length;
        while (c > 0) {
            for (String zmienna : tabString){
                System.out.println(zmienna);
                c--;
            }
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        int p = 10;
        while(true) {
            System.out.println(p);
        }

    }
}
