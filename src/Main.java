import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] hasta = new String[10];
        int seçim;
        int i = 0;
        String ad;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1) Hasta Ekle");
            System.out.println("2) Hastaları Listele");
            System.out.println("3) Çıkış");
            System.out.print("Seçim Yapınız: ");

            seçim = scan.nextInt();
            scan.nextLine();

            if (seçim == 1) {
                do {
                    System.out.print((i + 1) + ". Hastanın adını giriniz (Çıkmak için X yazın): ");
                    ad = scan.nextLine();

                    if (ad.equalsIgnoreCase("X")) {
                        continue;
                    }

                    hasta[i] = ad;
                    i++;
                } while (!ad.equalsIgnoreCase("X"));
            }

            if (seçim == 2) {
                System.out.println("Hastaların listesi:");
                for (int j = 0; j < i; j++) {
                    System.out.println(j + 1 + ". " + hasta[j]);
                }
            }

        } while (seçim != 3);
    }
}