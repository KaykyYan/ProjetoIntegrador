package UsodoTry;

import java.io.IOException;

public class Teste001 {
    public static void main(String[] args) {
        byte mByte[] = new byte[100];

        System.out.println("Entre com um valor: ");
        try {
            System.in.read(mByte);
        } catch (IOException e) {
            System.out.println("Erro de I/O ");
        }
    }
}
