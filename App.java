import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner utilizado para o usuário usar o teclado para digitar um número
        Scanner sc = new Scanner(System.in);

        double a = 0, b = 0, c = 0, d = 0, media;

        System.out.println("Digite a primeira nota bimestral");
        a = sc.nextDouble();
        System.out.println("Digite a segunda nota bimestral");
        b = sc.nextDouble();
        System.out.println("Digite a terceira nota bimestral");
        c = sc.nextDouble();
        System.out.println("Digite a quarta nota bimestral");
        d = sc.nextDouble();

        media = (a + b + c + d) / 4;
        System.out.println("A média das quatro notas bimestrais é" + media);

        // fechando o Scanner
        sc.close();

    }
}