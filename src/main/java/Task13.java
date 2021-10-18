public class Task13 {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZhh";

    public static String encrypt(String plainText, int shiftKey) {
        plainText = plainText.toUpperCase();
        StringBuilder cipherText = new StringBuilder(" ");
        for (int i = 0; i < plainText.length(); i++) {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString();
    }

    public static void main(String[] args) {
        String message = "message";
        System.out.println(encrypt(message, 3));
    }

}

