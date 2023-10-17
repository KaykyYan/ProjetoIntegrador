package UsodoTry;

public class TesteException4 {
    public static void main (String args[]) {
        String str = "12x";
        try {
            int num = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Numero " + str + "inválido ");
        }
    }
}
