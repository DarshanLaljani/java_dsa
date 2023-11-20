import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",1111);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("hello");
        dos.flush();
        s.close();
    }
}
