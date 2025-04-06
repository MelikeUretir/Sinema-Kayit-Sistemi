import java.util.Scanner;

public class Sinema {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String[] filmler = new String[10];
        int[] filmDK = new int[10];
        String[] filmTur = new String[10];
        int filmSayi = 0;

        String[] musteriler = new String[20];
        String[] musteriMailleri = new String[20];
        int musteriSayi = 0;

        String[][] biletler = new String[20][2];
        int biletSayi = 0;

        while (true) {
            System.out.println("\nSinema Bileti Al");
            System.out.println("1. Film Ekle");
            System.out.println("2. Müşteri Ekle");
            System.out.println("3. Bilet Oluştur");
            System.out.println("4. Biletleri Listele");
            System.out.println("0. Çıkış");

            System.out.print("Seçiminiz: ");
            int secim = girdi.nextInt();
            girdi.nextLine();

            if (secim == 1) {
                if (filmSayi < 10) {
                    System.out.print("Film Adı: ");
                    filmler[filmSayi] = girdi.nextLine();
                    System.out.print("Film Süresi: ");
                    filmDK[filmSayi] = girdi.nextInt();
                    girdi.nextLine();
                    System.out.print("Film Türü: ");
                    filmTur[filmSayi] = girdi.nextLine();
                    filmSayi++;
                    System.out.println("Film eklendi.");
                } else {
                    System.out.println("Maksimum film sayısı!");
                }
            } else if (secim == 2) {
                if (musteriSayi < 20) {
                    System.out.print("Müşteri Adı: ");
                    musteriler[musteriSayi] = girdi.nextLine();
                    System.out.print("Müşteri Mail: ");
                    musteriMailleri[musteriSayi] = girdi.nextLine();
                    musteriSayi++;
                    System.out.println("Müşteri eklendi.");
                } else {
                    System.out.println("Maksimum müşteri sayısı!");
                }
            } else if (secim == 3) {

                System.out.println("Müşteriler:");
                for (int i = 0; i < musteriSayi; i++) {
                    System.out.println((i + 1) + ". " + musteriler[i]);
                }
                System.out.print("Müşteri Numarası: ");
                int musteriNum = girdi.nextInt();
                girdi.nextLine();

                if (musteriNum < 1 || musteriNum > musteriSayi) {
                    System.out.println("Geçersiz müşteri numarası!");
                    continue;
                }

                System.out.println("Filmler:");
                for (int i = 0; i < filmSayi; i++) {
                    System.out.println((i + 1) + ". " + filmler[i]);
                }
                System.out.print("Film Numarası: ");
                int filmNum = girdi.nextInt();
                girdi.nextLine();

                if (filmNum < 1 || filmNum > filmSayi) {
                    System.out.println("Geçersiz film numarası!");
                    continue;
                }

                biletler[biletSayi][0] = musteriler[musteriNum - 1];
                biletler[biletSayi][1] = filmler[filmNum - 1];
                biletSayi++;
                System.out.println("Bilet oluşturuldu.");
            } else if (secim == 4) {
                System.out.println("Biletler:");
                for (int i = 0; i < biletSayi; i++) {
                    System.out.println(biletler[i][0] + " - " + biletler[i][1]);
                }
            } else if (secim == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }
    }
}