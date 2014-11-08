package com.company.KeyCase;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import java.security.InvalidKeyException;
import java.security.Key;

public class KeyMain {

    static String algorithm = "DESede";

    public static void main(String[] args) throws Exception {

        Key symKey = KeyGenerator.getInstance(algorithm).generateKey();

        Cipher c = Cipher.getInstance(algorithm);

        byte[] encryptionBytes = encryptF("helloWorld", symKey, c);

        System.out.println(bytesToHex(symKey.getEncoded()));
        System.out.println("Decrypted: " + decryptF(encryptionBytes, symKey, c));

    }

    private static byte[] encryptF(String input, Key key, Cipher c) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] inputBytes = input.getBytes();
        return c.doFinal(inputBytes);
    }

    private static String decryptF(byte[] encryptionBytes, Key key, Cipher c) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypt = c.doFinal(encryptionBytes);
        String decrypted = new String(decrypt);
        return decrypted;
    }

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

}
