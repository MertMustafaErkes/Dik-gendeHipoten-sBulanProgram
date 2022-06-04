import java.awt.*;
import java.util.Scanner;
public class hipotenusbulma {
    public static void main(String[] args) {
        double a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.println("a kenarının uzunluğunu girin:");
        a = inp.nextInt();
        System.out.println("b kenarının uzunluğunu girin:");
        b = inp.nextInt();
        double hipotenus = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs değeri:");
        System.out.println(hipotenus);



    }

}
