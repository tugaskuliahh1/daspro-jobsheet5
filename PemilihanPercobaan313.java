import java.util.Scanner;

public class PemilihanPercobaan313 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        double angka1, angka2;
        double hasil;
        char operator;

        System.out.println("Masukkan angka pertama : ");
        angka1 = input13.nextDouble();
        System.out.println("Masukkan angka kedua : ");
        angka2 = input13.nextDouble();
        System.out.println("Masukkan operator (+ - * /): + ");
        operator = input13.next().charAt(0);

        switch (operator) {
        case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            break;
        case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
        case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
        case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
        }
    }
}