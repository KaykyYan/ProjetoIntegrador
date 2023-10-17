package UsodoTry;

public class TesteException5 {
    public static void main(String args[]) {
        int vetor[] = {3,6,9};
        int index = 3;

        try {
            String str1 = args[0];
            String str2 = args[1];

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            double resp = num1 / num2;
            System.out.println("O resultado é: " + resp);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Devem ser informados 2 argumentos");
        }

        catch (NumberFormatException e) {
            System.out.println("Erro na conversão de String para inteiro");
        }
        catch (ArithmeticException e) {
            System.out.println("Ocorreu uma divisão por zero!");
        }
    }
}
