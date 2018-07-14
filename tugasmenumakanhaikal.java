import java.util.*;
import java.lang.Math;

public class tugasmenumakanhaikal {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] menumakanan = new String[10];
        int[] banyakpesanan = new int[10];
        int menu;
        int a;
        int b;
        
        a = 1;
        b = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Pesan Nasi Goreng Biasa");
            System.out.println("2. Pesan Nasi Goreng Seafood");
            System.out.println("3. Pesan Nasi Goreng Istimewa");
            System.out.println("0. Keluar");
            menu = input.nextInt();
            System.out.println(menu);
            if (menu == 1) {
                menumakanan[a] = "Nasi Goreng Biasa = ";
                System.out.print("Banyak = ");
                banyakpesanan[a] = input.nextInt();
            } else {
                if (menu == 2) {
                    menumakanan[a] = "Nasi Goreng Seafood = ";
                    System.out.print("banyak = ");
                    banyakpesanan[a] = input.nextInt();
                } else {
                    if (menu == 3) {
                        menumakanan[a] = "Nasi Goreng Istimewa = ";
                        System.out.print("banyak = ");
                        banyakpesanan[a] = input.nextInt();
                    }
                }
            }
            a = a+1;
        } while (menu > 0);
        for (b = 1; b <= a - 2; b++) {
            System.out.print(menumakanan[b]);
            System.out.println(banyakpesanan[b]);
        }
    }
}
