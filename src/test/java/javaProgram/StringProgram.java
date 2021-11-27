package javaProgram;

import org.testng.annotations.Test;

public class StringProgram {

    @Test
    public void testMethod(){
        int n =5;
        String m = "ui";
        char k = 'e';

        String name = Integer.toString(n);
        //int name1 = Integer.parseInt(m);
        int name1 = 5;
        

        String.valueOf(n);

        System.out.println(name+"  "+name1);
    }

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
