import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args)  {
        try {
            ServerSocket socket = new ServerSocket(12567); // criar um servidor, ouvindo porta
            System.out.println("Servidor ativo ouvindo porta!");

            Socket cliente1 = socket.accept(); //receber solicitação do cliente
            System.out.println("cliente conectado!");

            Socket cliente2 = socket.accept(); //receber solicitação do cliente
            System.out.println("cliente conectado!");

            Scanner scanner = new Scanner(System.in);

            PrintStream saida = new PrintStream(cliente1.getOutputStream());
            while (true){
                String mensagem = scanner.nextLine();
                saida.println(mensagem);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}