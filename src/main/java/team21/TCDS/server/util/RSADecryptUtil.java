package team21.TCDS.server.util;

import team21.TCDS.printer.Printer;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class RSADecryptUtil {
    private static Base64.Decoder decoder;
    private static KeyFactory kf;
    private static Cipher c;

    public static String dncryption(final String context, final String privateKey) {
        final byte[] b = RSADecryptUtil.decoder.decode(privateKey);
        final byte[] s = RSADecryptUtil.decoder.decode(context.getBytes(StandardCharsets.UTF_8));
        final PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
        try {
            final PrivateKey key = RSADecryptUtil.kf.generatePrivate(spec);
            RSADecryptUtil.c.init(2, key);
            final byte[] f = RSADecryptUtil.c.doFinal(s);
            return new String(f);
        } catch (Exception e) {
            Printer.instance.print(e.getMessage());
            Printer.instance.print("错误：RSA解密失败。");
        }
        return null;
    }

    static {
        RSADecryptUtil.decoder = Base64.getDecoder();
        try {
            RSADecryptUtil.kf = KeyFactory.getInstance("RSA");
            RSADecryptUtil.c = Cipher.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
        }
    }
}
