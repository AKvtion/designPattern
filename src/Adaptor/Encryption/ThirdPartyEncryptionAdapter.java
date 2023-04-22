package Adaptor.Encryption;

public class ThirdPartyEncryptionAdapter implements Encryption {
    private ThirdPartyEncryption tpe;

    public ThirdPartyEncryptionAdapter(ThirdPartyEncryption tpe) {
        this.tpe = tpe;
    }

    @Override
    public String encrypt(String message) {
        return tpe.thirdPartyEncrypt(message);
    }

    @Override
    public String decrypt(String secret) {
        return tpe.thirdPartyDecrypt(secret);
    }
}
