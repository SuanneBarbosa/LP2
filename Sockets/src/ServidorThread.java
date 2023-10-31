import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServidorThread extends Thread{ // classe para evitar concorrencia
    private Socket cliente1;
    private Socket cliente2;

    public ServidorThread(Socket cliente1, Socket cliente2) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
    }

    @Override
    public void run() {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(cliente1.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String x;
            do {
                x = reader.readLine();
                System.out.println("Servidor" + x);
            } while ((x != null));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
