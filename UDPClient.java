import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        System.out.println("client");
        String msg = "Hi";
        byte[] b = msg.getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(b, b.length,address,3456);
        ds.send(dp);
        System.out.println("Packet Sent");
        ds.close();
    }
}
