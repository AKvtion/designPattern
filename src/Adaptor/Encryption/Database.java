package Adaptor.Encryption;

public class Database {
    private Encryption encryption;

    public Database(Encryption encryption) {
        this.encryption = encryption;
    }

    public void store(String message) {
        String secret = encryption.encrypt(message);
        // 存储加密后的信息
    }

    public String load(String secret) {
        String message = encryption.decrypt(secret);
        // 从数据库中读取加密信息并解密
        return message;
    }
}
