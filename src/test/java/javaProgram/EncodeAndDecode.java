package javaProgram;

import org.testng.annotations.Test;

import java.util.Base64;

public class EncodeAndDecode {

    String userName = "tester";
    String password = "autotest";

    String auth = userName + ":" + password;


    @Test
    public void testEncodeDecode(){

        String authEncoded = Base64.getEncoder().encodeToString(auth.getBytes());
        System.out.println("Encoded Data : " + authEncoded);

        byte[] decodedBytes = Base64.getDecoder().decode(authEncoded);
        String authDecoded = new String(decodedBytes);
        System.out.println(authDecoded);
        
    }


}
