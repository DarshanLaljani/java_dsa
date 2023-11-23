import java.math.BigInteger;
import java.util.Scanner;

public class DigitalSign {

    private final long p = 119;  // Prime number p
    private final long q = 53;   // Prime number q

    private final long n;        // Modulus n

    private final long e = 1999; // Public exponent e

    private final long d;        // Private exponent d

    private final long phi_n;    // Euler's totient function φ(n)

    public DigitalSign() {
        // Calculate the modulus n
        n = p * q;
        // Calculate φ(n)
        phi_n = (p - 1) * (q - 1);
        System.out.println("Encryption key: " + e);
        // Calculate the private key d
        d = getDecryptionKey();
        System.out.println("Decryption key: " + d);
    }

    // Calculate the private key d using the modular inverse
    public long getDecryptionKey() {
        return BigInteger.valueOf(e).modInverse(BigInteger.valueOf(phi_n)).longValue();
    }

    // Decrypting the message
    public BigInteger decryptMessage(int message) {
        BigInteger msg = new BigInteger(String.valueOf(message));
        BigInteger d_ = new BigInteger(String.valueOf(d));
        return msg.modPow(d_, new BigInteger(String.valueOf(n)));
    }

    public static void main(String[] args) {
        DigitalSign ds = new DigitalSign();
        int message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter encrypted message: ");
        message = scanner.nextInt();
        System.out.println("Decrypted message: " + ds.decryptMessage(message));
    }
}
