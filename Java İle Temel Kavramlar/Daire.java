import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double a;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz:");
        r = inp.nextInt();
        System.out.print("Alfa Değeri : ");
        a = inp.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;


        System.out.println("Darienin Alanı:"+alan);
        System.out.println("Dairenin Çevresi:"+cevre);

        a = ((pi * (r*r) * a) / 360);
        System.out.println("Daire Dilimi Alanı:" + a);


    }
}
