import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente1 {
    public static void main(String[] args)  {
        try {
            Socket cliente1 = new Socket("localhost", 12567); // conectar ao servidor pelo usuario
            System.out.println("cliente 1 conectado!");

            Scanner scanner = new Scanner(System.in);

            PrintStream saida = new PrintStream(cliente1.getOutputStream()); // enviar mensagem
            while (true){
                String mensagem = scanner.nextLine();
                saida.println(mensagem);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}