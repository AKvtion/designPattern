package Adaptor.Encryption;

public class Client {
    public static void main(String[] args) {
        ThirdPartyEncryption tpe = new ThirdPartyEncryption();
        Encryption adapter = new ThirdPartyEncryptionAdapter(tpe);

        Database database = new Database(adapter);

        // 加密和存储信息
        String message = "password";
        database.store(message);

        // 读取和解密信息
        String secret = "encrypted-password";
        String decryptedMessage = database.load(secret);
        System.out.println(decryptedMessage); // password
    }
}
