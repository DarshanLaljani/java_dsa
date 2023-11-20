import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1111);
        Socket s =  ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();
        System.out.println(str);
        s.close();
    }
}
