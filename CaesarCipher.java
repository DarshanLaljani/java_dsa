import java.util.Scanner;

public class CaesarCipher {
    // This method will encrypt the input text using the Caesar Cipher technique with a shift of 's'
    public static StringBuffer encrypt(String text, int s) {

        StringBuffer result = new StringBuffer();

        // Iterating through each character of the 'text' string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Checking space
            if (currentChar == ' ') {
                result.append(currentChar);
            } else if (Character.isUpperCase(currentChar)) {
                // If it is an uppercase letter, perform the Caesar Cipher encryption
                // Convert the character to its ASCII value, subtract 65 (ASCII value of 'A')
                // Take the modulus 26 to handle wrapping around the alphabet, then add 65 to get the encrypted character's ASCII value
                char ch = (char) (((int) currentChar + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                // If it is a lowercase letter, perform the Caesar Cipher encryption
                // Convert the character to its ASCII value, subtract 97 (ASCII value of 'a')
                // Take the modulus 26 to handle wrapping around the alphabet, then add 97 to get the encrypted character's ASCII value
                char ch = (char) (((int) currentChar + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // This method will decrypt the input text using the Caesar Cipher technique with a shift of 's'
    public static StringBuffer decrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                result.append(currentChar);
            } else if (Character.isUpperCase(currentChar)) {
                // If it is an uppercase letter, perform the Caesar Cipher decryption
                // Similar to the Caesar Cipher encryption, but shift in the opposite direction
                char ch = (char) (((int) currentChar - s - 65 + 26) % 26 + 65);
                result.append(ch);
            } else {
                // If it is a lowercase letter, perform the Caesar Cipher decryption
                // Similar to the Caesar Cipher encryption, but shift in the opposite direction
                char ch = (char) (((int) currentChar - s - 97 + 26) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Cryptanalysis");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                // User chooses encryption
                System.out.print("Enter the text to encrypt: ");
                String textToEncrypt = scanner.nextLine();
                System.out.print("Enter the shift key (an integer): ");
                int encryptKey = scanner.nextInt();

                StringBuffer encryptedText = encrypt(textToEncrypt, encryptKey);

                System.out.println("Text: " + textToEncrypt);
                System.out.println("Shift: " + encryptKey);
                System.out.println("Encrypted message: " + encryptedText);
                break;

            case 2:
                // User chooses decryption
                System.out.print("Enter the text to decrypt: ");
                String textToDecrypt = scanner.nextLine();
                System.out.print("Enter the shift key (an integer): ");
                int decryptKey = scanner.nextInt();
                StringBuffer decryptedText = decrypt(textToDecrypt, decryptKey);

                // Print the decrypted result
                System.out.println("Text: " + textToDecrypt);
                System.out.println("Shift: " + decryptKey);
                System.out.println("Decrypted message: " + decryptedText);
                break;

            case 3:
                // User chooses cryptanalysis
                System.out.print("Enter the encrypted text for cryptanalysis: ");
                String encryptedTextForCryptanalysis = scanner.nextLine();

                // Performing cryptanalysis by trying all possible shift values (0 to 25)
                System.out.println("Cryptanalysis Results:");
                for (int s = 0; s < 26; s++) {
                    StringBuffer decryptedResult = decrypt(encryptedTextForCryptanalysis, s);
                    System.out.println("Shift " + s + ": " + decryptedResult);
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                break;
        }
    }
}
