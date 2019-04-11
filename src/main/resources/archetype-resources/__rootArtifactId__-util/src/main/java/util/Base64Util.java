package ${package}.util;
import org.apache.commons.codec.binary.Base64;
import java.io.UnsupportedEncodingException;
public class Base64Util {
    public static String encode(String msg){
        return encode(msg,"UTF-8");
    }

    public static String decode(String msg){
        return decode(msg,"UTF-8");
    }

    public static String encode(String msg, String charset){
        try {
            byte[] msgBytes = msg.getBytes(charset);
            byte[] base64Bytes = Base64.encodeBase64(msgBytes);
            return new String(base64Bytes,charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String decode(String msg,String charset){
        try {
            byte[] msgBytes = msg.getBytes(charset);
            byte[] base64Bytes = Base64.decodeBase64(msgBytes);
            return new String(base64Bytes,charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}