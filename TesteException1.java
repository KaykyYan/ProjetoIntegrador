package UsodoTry;
//API DAS EXCEÇÕES - https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html


import javax.swing.JOptionPane;

public class TesteException1 {
    public static void main(String args[]) {
        int vetor[] = {3,6,9};
        int index = 3;

        try{
            System.out.println("A terceira posição é: " + vetor[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
           JOptionPane.showMessageDialog(null,"A posição: " + index + "não é valida");
        }
    }
}
