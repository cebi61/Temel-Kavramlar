import java.util.Scanner;
public class Kit {
    public static void main(String[] args) {
        double boy,kilo,kit;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu Metre Cinsinden Yazınız:");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu Yazınız:");
        kilo = inp.nextDouble();

        kit = (kilo / (boy * boy));
        System.out.println("Vücut Kitle İndeksiniz:" + kit);

    }
}
