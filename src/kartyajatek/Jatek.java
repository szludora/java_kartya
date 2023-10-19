package kartyajatek;

import java.util.*;

public final class Jatek {

    public String[] lapok = new String[21];
    static Scanner sc = new Scanner(System.in);
    String[] szinek = {"P", "Z", "T", "M"};
    String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

    public Jatek() {
        lapok = lapokLetrehoz();
        kor();
    }

    public String[] lapokLetrehoz() {
        int index = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                {

                    if (index >= lapok.length) {
                        break; // Ne hozzon létre több kártyát, mint amennyi a pakliban van.
                    }
                }
                lapok[index] = szin + " " + ertek;
                index++;
            }
        }
        return lapok;
    }

    public void kirak() {
        System.out.println(Arrays.toString(lapok));
        System.out.println("");

        String format = "%-14s %-14s %-14s%n";
        for (int i = 0; i < lapok.length; i += 3) {
            System.out.printf(format, lapok[i], lapok[i + 1], lapok[i + 2]);
        }
    }

    public static int melyik() {
        System.out.println("melyik oszlop? (1-3)");
        int oszlop = Integer.parseInt(sc.nextLine());
        return oszlop;
    }

    ;
   
    public void kever(int oszlop) {
        System.out.println("Választott oszlop: " + oszlop);

    }

    public void kor() {
        kirak();
        int oszlop = melyik();
        kever(oszlop);

    }
}
