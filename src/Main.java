import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        /* A */
        ArrayList<String> ListaZwierzat = new ArrayList<>();


        do {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj  zwierze: ");
            String zwierze1 = scan1.next();
            ListaZwierzat.add(zwierze1);

        } while (!(ListaZwierzat.size() == 5));

        /* B */

        for (String zmienna : ListaZwierzat) {
            System.out.println(zmienna + ", ");
        }

        /* C */

        ListaZwierzat.remove(4);
        ListaZwierzat.remove(3);

        ListaZwierzat.add("Koń");
        ListaZwierzat.add("Małpa");
        ListaZwierzat.add("Jeleń");

        System.out.println(ListaZwierzat);
        System.out.println(ListaZwierzat.size());

        /* D */

        sort(ListaZwierzat, reverseOrder());
        System.out.println(ListaZwierzat);

        for (String zmienna : ListaZwierzat) {
            System.out.println(zmienna + ", ");


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
            Set<Integer> Set1 = new TreeSet<>();

            /* Po co pan tyle razy tworzy klasę Scanner? mozna raz zadeklarować i wiele razy używać:
             Scanner scan0 = new Scanner(System.in)
              int liczba0 = scan0.nextInt();
              int liczba1 = scan0.nextInt();
              int liczb2 = scan0.nextInt();
              ...
            */
            Scanner scan0 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba0 = scan0.nextInt();
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba1 = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba2 = scan1.nextInt();
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba3 = scan1.nextInt();
            Scanner scan4 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba4 = scan1.nextInt();
            Scanner scan5 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba5 = scan1.nextInt();
            Scanner scan6 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba6 = scan1.nextInt();
            Scanner scan7 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba7 = scan1.nextInt();
            Scanner scan8 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba8 = scan1.nextInt();
            Scanner scan9 = new Scanner(System.in);
            System.out.println("Podaj  liczbe: ");
            int liczba9 = scan1.nextInt();

            Set1.add(liczba0);
            Set1.add(liczba1);
            Set1.add(liczba2);
            Set1.add(liczba3);
            Set1.add(liczba4);
            Set1.add(liczba5);
            Set1.add(liczba6);
            Set1.add(liczba7);
            Set1.add(liczba8);
            Set1.add(liczba9);


            for (Integer liczba : Set1) {
                System.out.println(liczba);
            }


        }

    }
}

