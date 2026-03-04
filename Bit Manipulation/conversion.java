import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the English text:");
        String englishText = scanner.nextLine();

        StringBuilder binaryStringBuilder = new StringBuilder();

        for (char character : englishText.toCharArray()) {
            String binary = Integer.toBinaryString(character);
            // Ensure each binary representation is 8 bits long by padding with leading zeros if needed
            binary = String.format("%8s", binary).replace(' ', '0');
            binaryStringBuilder.append(binary).append(" ");
        }

        String binaryCode = binaryStringBuilder.toString().trim();
        System.out.println("Binary code: " + binaryCode);
    }
}
