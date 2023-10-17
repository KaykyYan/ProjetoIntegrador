package UsodoTry;

import javax.swing.JOptionPane;

public class TesteException2 {
    public static void main (String args[]) {
        String str;
        String mensagem = "Digite a informação: ";
        int icone = JOptionPane.INFORMATION_MESSAGE;
       // int icone2 = JOptionPane.WARNING_MESSAGE;

        try {
           // str = JOptionPane.showInputDialog(null, mensagem, "msg", icone2);
            JOptionPane.showMessageDialog(null, mensagem, "Voce digitou: ", icone);
            char c = str.charAt(0);
            int resp = JOptionPane.showConfirmDialog(null, "Continuar?");
            // TesteNullPointer.tentaDenovo();
        }
        catch (NullPointerException e) {
            System.out.println("");
        }
    }
}
