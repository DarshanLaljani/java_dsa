import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(3456);
        System.out.println("Server connect");
        byte[] b = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b,b.length);
        ds.receive(dp);
        String str = new String(dp.getData());
        System.out.println(str);
    }
}
