package Adaptor.Encryption;

public class ThirdPartyEncryption {
    public String thirdPartyEncrypt(String message) {
        // 第三方加密算法实现
        return "encrypted-" + message;
    }

    public String thirdPartyDecrypt(String secret) {
        // 第三方解密算法实现
        return secret.substring("encrypted-".length());
    }
}
