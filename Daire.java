import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        int r;
        double a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Daire diliminin açısını giriniz : ");
        a = inp.nextInt();
        double dilimalan = (pi * (r*r) * a)/360;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin diliminin alanı : " + dilimalan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
