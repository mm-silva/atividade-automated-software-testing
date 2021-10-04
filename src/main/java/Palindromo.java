import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindromo {

    public static void main(String[] args) {
        String texto;
        String validar = "S";
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);

        while (validar.equals("S")) {
            System.out.println("Digite uma palavra ou frase:");
            texto = sc.nextLine();
            System.out.println("O texto  digitado é palindrome? " + ehPalindromo(texto));
            System.out.println("Deseja fazer outra validação, digite S para sim ou N para não?");
            validar = scc.nextLine();
        }
        System.out.println("Você saiu do sistema");
    }

    public static boolean ehPalindromo(String str) {
        String texto = str.replaceAll("[\\W]", "").toLowerCase();
        return IntStream.range(0, texto.length() / 2)
                .noneMatch(i -> texto.charAt(i) != texto.charAt(texto.length() - i - 1));
    }
}