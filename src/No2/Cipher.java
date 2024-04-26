package No2;
import java.util.Scanner;
public class Cipher {
    public static String caesarCipher(String plaintext) {
        String encryptedText = "";
        int shift = 3;
        for (char ch : plaintext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch + (shift % 26));

                if (shiftedChar > 'Z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
                encryptedText += shiftedChar;
            } else {
                encryptedText += ch;
            }
        }
        return encryptedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String awal , hasil;

        System.out.println("Plain Text:");
        awal = scanner.nextLine();
        awal = awal.toUpperCase();

        hasil = caesarCipher(awal);
        System.out.println("Encrypt Text:\n" + hasil);
    }
}