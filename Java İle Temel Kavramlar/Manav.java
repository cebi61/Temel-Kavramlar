import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {


        double armut,elma,domates,muz,patlican;
        //Bu bölge ürünlerin birimlerini belirlemek için.
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5.00,t;
        //Bu bölge ürün fiyatları


        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo:");
        elma = inp.nextDouble();
        System.out.print("Domates Kaç Kilo:");
        domates = inp.nextDouble();
        System.out.print("Muz Kaç Kilo:");
        muz = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo:");
        patlican = inp.nextDouble();

        t =( (a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican));

        System.out.print("Toplam Tutar:" + t);

    }
}
