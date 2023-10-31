import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteThread extends Thread{
    private Socket cliente1;


    public ClienteThread(Socket cliente1) {this.cliente1 = cliente1;}

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
