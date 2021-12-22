public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        /* a */
        for (int a = 0; a <100; a++) {
            if (a % 5 == 0)
                continue;
            System.out.println(a);
        }
        System.out.println("-------------");
        /* b */
        for (int b = 0; b <=15; b++) {
            if (b == 3)
                break;
            System.out.println(b);
        }
        System.out.println("-------------");
        /* c */
        for (int c = 0; c <70; c++) {
            if (c == 62)
                return;
            System.out.println(c);
        }


    }
}
