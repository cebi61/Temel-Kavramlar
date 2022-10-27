import java.util.Scanner;
public class Taksi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int km;
        double tutar,fiyat,baslangic = 10;

        System.out.print("Gidilecek Mesafe:");
        km = inp.nextInt();
        fiyat = 2.20;
        tutar = (fiyat * km);
        tutar += baslangic;

        tutar = (tutar < 20) ? 20: tutar;
        System.out.println("Toplam Tutar;" + tutar);


    }
}
