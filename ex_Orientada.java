import java.util.Locale;
import java.util.Scanner;

public class ex_Orientada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangulo x, y; //Objeto criado em outro pacote.
        x = new Triangulo(); //Para usar o obejto é necessário instanciar.
        y = new Triangulo(); //Para usar o obejto é necessário instanciar.

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); //Atributo acessado.
        x.b = sc.nextDouble(); //Atributo acessado.
        x.b = sc.nextDouble(); //Atributo acessado.
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); //Atributo acessado.
        y.b = sc.nextDouble(); //Atributo acessado.
        y.c = sc.nextDouble(); //Atributo acessado.
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}