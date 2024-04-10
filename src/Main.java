import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz>");
        kilo= inp.nextInt();
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz>");
        boy=inp.nextDouble();
        double index=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz>"+index);

    }
}