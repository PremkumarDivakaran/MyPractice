package javaProgram;

import org.testng.annotations.Test;

public class StringProgram {

    @Test
    public void reverseString(){

        String str = "java programming";
        String revStr="";

        /*for (char eachChar:str.toCharArray()) {
            revStr = eachChar+revStr;
        }*/

        /*char[] strArray = str.toCharArray();
        int n = strArray.length;
        for (int i=str.length()-1; i<=0; i--){
            revStr=revStr+strArray[i];
        }*/

        /*StringBuilder sb = new StringBuilder(str);
        revStr = sb.reverse().toString()*/;

        System.out.println(revStr);


    }




}
