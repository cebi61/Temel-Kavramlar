import java.util.Scanner;
public class Kdvhesap {
    public static void main(String[] args) {

        double urunfiyat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ürün Fiyatı:");
        urunfiyat = inp.nextInt();

        boolean kosul = urunfiyat >= 1000;
        double okdv = (kosul ? 0.08 : 0.18);
        double kdv = urunfiyat+ (urunfiyat * okdv)  ;
        double skdv = (kdv - urunfiyat);




        System.out.println("Kdv'siz Tutar:"+urunfiyat);
        System.out.println("Kdv Oranı:"+okdv);
        System.out.println("Kdv Tutarı:"+skdv);
        System.out.println("Kdv'li Tutar:"+kdv);
    }
}
