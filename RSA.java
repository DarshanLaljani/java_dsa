import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RSA {

    // Define the prime numbers p and q for RSA
    private final long p = 113;
    private final long q =  53;

    // Initialize variables to store n, e, and phi(n)
    private final long n;
    private final long e;
    private final long phi_n;

    // Store a list of relative prime numbers
    private final List<Long> relativePrimes;

    // Constructor for the RSA class
    public RSA(){
        // Calculate n by multiplying p and q
        n = p * q;

        // Calculate phi(n) using Euler's totient function
        phi_n = (p - 1) * (q - 1);

        // Initialize the list to store relative prime numbers
        relativePrimes = new ArrayList<>();

        // Find and store all relative prime numbers to phi_n
        getRelativePrimes(phi_n);

        System.out.println("phi_n: " + phi_n);
        System.out.println("relative primes: " + relativePrimes);

        // Calculate the encryption key 'e' by selecting a random number from the list of relative primes
        e = getEncryptionKey();
        System.out.println("Encryption key: " + e);
    }

    // Method to calculate the encryption key 'e' by randomly selecting a number from the relative prime list
    private long getEncryptionKey() {
        Random rand = new Random();
        return relativePrimes.get(rand.nextInt(relativePrimes.size()));
    }

    // Method to calculate all possible relative prime numbers
    public void getRelativePrimes(long phi_n){
        for(long i = 2; i < phi_n; i++){
            // Use BigInteger's gcd method to check if 'i' and 'phi_n' are relatively prime
            if (BigInteger.valueOf(i).gcd(BigInteger.valueOf(phi_n)).equals(BigInteger.ONE)) {
                relativePrimes.add((long) i);
            }
        }
    }

    // Method to encrypt a message using the RSA algorithm
    public BigInteger encryptMessage(int message){
        // C = M^e mod n
        BigInteger msg = new BigInteger(String.valueOf(message));
        BigInteger e_ = new BigInteger(String.valueOf(e));
        return msg.modPow(e_, new BigInteger(String.valueOf(n)));
    }

    public static void main(String[] args) {
        // Create an instance of the RSA class
        RSA rsa = new RSA();
        int message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message: ");
        message = scanner.nextInt();

        // Encrypt the message using the RSA algorithm
        System.out.println("Encrypted message: " + rsa.encryptMessage(message));
    }
}
