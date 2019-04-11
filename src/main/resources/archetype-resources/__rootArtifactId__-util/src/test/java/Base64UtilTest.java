package ${package}.util;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class Base64UtilsTest {

    @Test
    public void encode(){
        String msg = Base64Utils.encode("@163.com");
        System.out.println(msg);
        // Assert.assertEquals("Y29kaW5nX3pnY0AxNjMuY29t",msg);

        String msg1 = Base64Utils.encode("123456");
        System.out.println(msg1);

    }


}