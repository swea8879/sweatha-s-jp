class Encryptor 
{
    private final int key; 
    public Encryptor(int key) {
        this.key = key;
  }
    private static int getCharValue(char ch) {
        return ch - 'A' - ((ch / 'a') * 32); 
    }
    private static char encryptChar(char ch, int key) {
        int charValue = getCharValue(ch);  
        int encryptedValue = (charValue + key) % 26; 
        char base = (char) ((ch / 'a') * 32 + 'A'); 
        return (char) (base + encryptedValue);  
    }
    public String encryptString(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (String word : input.split(" ")) {
            StringBuilder encryptedWord = new StringBuilder();
            for (char ch : word.toCharArray()) {
                encryptedWord.append(encryptChar(ch, key));
            }
            encrypted.append(encryptedWord).append(" ");
        }
        return encrypted.toString().trim();
    }
}
public class Main {
    public static void main(String[] args) 
{
        String input1 = "Wipro Tech";
        int input2 = 20;
        Encryptor encryptor = new Encryptor(input2);
        String encryptedString = encryptor.encryptString(input1);
        System.out.println("Encrypted words: " + encryptedString);
    }
}
