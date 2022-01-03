import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(metoda1(20)));

        Metoda3();
        Metoda3("Lukasz", "Balwierz");
        Metoda3("Lukasz", "Balwierz", 24);
        Metoda4(5,10);
        Metoda4(3,2,2);





    }

        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        public static int[] metoda1(int zmienna) {
            int[] tab = new int[zmienna];
            int a = 40;
            for (int i = 0; i < zmienna; i++){
                tab[i] = a;
                --a;
            }

            return tab;
        }




        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */





        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,

        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        public static void Metoda3(){
            System.out.println("Lukasz");
        }

        public static void Metoda3(String imie, String nazwisko) {
            System.out.println("Imię to: " + imie + "," + " Nazwisko to: " + nazwisko);
        }
        public static void Metoda3(String imie, String nazwisko, int wiek) {
            System.out.println("Imię to: " + imie + "," + " Nazwisko to: " + nazwisko + "," + " Wiek to: " + wiek);
        }



        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        public static void Metoda4(int a, int b) {
            int wynik = a + b;
                System.out.println(wynik);
        }

        public static void Metoda4(int a, int b, int c) {
            int wynik = a + b + c;
            System.out.println(wynik);
        }



}
