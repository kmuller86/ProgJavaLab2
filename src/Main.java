import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        int indeks = 9;
        for (int liczba = 0; liczba < 100; liczba++) {
            if (liczba % indeks == 0) {
                System.out.println(liczba);
            }
        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        Scanner scan = new Scanner(System.in);
        int[] tablica = new int[5];

        System.out.print("Podaj 1 element tablicy: ");
        int el1 = scan.nextInt();
        System.out.print("Podaj 2 element tablicy: ");
        int el2 = scan.nextInt();
        System.out.print("Podaj 3 element tablicy: ");
        int el3 = scan.nextInt();
        System.out.print("Podaj 4 element tablicy: ");
        int el4 = scan.nextInt();
        System.out.print("Podaj 5 element tablicy: ");
        int el5 = scan.nextInt();

        tablica[0] = el1;
        tablica[1] = el2;
        tablica[2] = el3;
        tablica[3] = el4;
        tablica[4] = el5;

        System.out.println(Arrays.toString(tablica));

        for (int el : tablica) {
            int liczba = el + 11;
            System.out.println("Elementy tablicy to: " + liczba);
        }





    }
}
