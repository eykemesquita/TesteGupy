import java.util.Scanner;
public class Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sequência a)
        int proximoA = calcularProximoElementoA(7);
        System.out.println("a) O próximo número na sequência é: " + proximoA);

        // Sequência b)
        int proximoB = calcularProximoElementoB(64);
        System.out.println("b) O próximo número na sequência é: " + proximoB);

        // Sequência c)
        int proximoC = calcularProximoElementoC(36);
        System.out.println("c) O próximo número na sequência é: " + proximoC);

        // Sequência d)
        int proximoD = calcularProximoElementoD(64);
        System.out.println("d) O próximo número na sequência é: " + proximoD);

        // Sequência e)
        int penultimoE = scanner.nextInt();
        int ultimoE = scanner.nextInt();
        int proximoE = calcularProximoElementoE(penultimoE, ultimoE);
        System.out.println("e) O próximo número na sequência é: " + proximoE);

        // Sequência f)
        int proximoF = calcularProximoElementoF(19);
        System.out.println("f) O próximo número na sequência é: " + proximoF);

        scanner.close();
    }

    // Adiciona 2 ao último elemento
    static int calcularProximoElementoA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    // Multiplica por 2 o último elemento
    static int calcularProximoElementoB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    // Quadrados dos números naturais
    static int calcularProximoElementoC(int ultimoElemento) {
        int raizQuadrada = (int) Math.sqrt(ultimoElemento) + 1;
        return raizQuadrada * raizQuadrada;
    }

    // Quadrados dos números pares
    static int calcularProximoElementoD(int ultimoElemento) {
        int raizQuadrada = (int) Math.sqrt(ultimoElemento / 4) + 1;
        return raizQuadrada * raizQuadrada * 4;
    }

    // Soma dos dois elementos anteriores
    static int calcularProximoElementoE(int penultimoElemento, int ultimoElemento) {
        return penultimoElemento + ultimoElemento;
    }

    // Adição de 8, 2, 4, 1, 1, 1
    static int calcularProximoElementoF(int ultimoElemento) {
        return ultimoElemento + 1;
    }
}
