import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        int a,b;
        double c,u,alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("A Kenarını Giriniz:");
        a = inp.nextInt();
        System.out.print("B Kenarını Giriniz:");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        //Math.sqrt alınan değeri karekök içine alır.

        System.out.println("Hipotenüs:" +c );


        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+alan);



        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

    }
}
