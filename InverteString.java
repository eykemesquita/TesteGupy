import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverterString(entrada);

        System.out.println("Aqui está sua palavra ou frase invertida: " + stringInvertida);

        scanner.close();
    }

    static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int comprimento = caracteres.length;

        for (int i = 0; i < comprimento / 2; i++) {
            // Troca os caracteres no início e no fim
            char temp = caracteres[i];
            caracteres[i] = caracteres[comprimento - 1 - i];
            caracteres[comprimento - 1 - i] = temp;
        }

        // Constrói a string invertida a partir do array de caracteres
        return new String(caracteres);
    }
}
