public interface Encryption {
    String encrypt(String message);
    String decrypt(String secret);
}
