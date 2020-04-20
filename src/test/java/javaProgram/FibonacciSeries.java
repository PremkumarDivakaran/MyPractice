package javaProgram;

import org.testng.annotations.Test;

import java.beans.beancontext.BeanContextChild;
import java.util.*;

public class FibonacciSeries {

    @Test
    public void getFibonacciWithTempVar(){

        int inputNumber = 4;
        int tempVar=1;

        while (inputNumber >= 1){
            tempVar = tempVar * inputNumber;
            inputNumber--;
        }

        System.out.println("Fibonacci : " +tempVar);

    }

    @Test
    public void getFibonacciWithoutTempVar(){

        int inputNumber = 5;

        for(int i= inputNumber; i>1;i--){
            inputNumber = inputNumber * (i-1);
        }

        System.out.println("Fibonacci : " +inputNumber);

    }

    @Test
    public void countNumberOfDuplicateWords(){

        String str = "this is duplicate is duplicate words Yes duplicate this is duplicate words";
        String[] strArr = str.split("\\s");

        Map<String,Integer> hMap = new HashMap<String, Integer>();
        int numberOfDuplicateWords=0;

        for (String eachStr:strArr) {
            if(hMap.containsKey(eachStr)){
                hMap.put(eachStr,hMap.get(eachStr)+1);
            }
            else{
                hMap.put(eachStr,1);
            }
        }

        List<Integer> ls = new ArrayList<Integer>();
        ls.addAll(hMap.values());

        for (int i = 0; i<=ls.size()-1; i++){
            if(ls.get(i)>1){
                numberOfDuplicateWords++;
            }
        }

        System.out.println("Number of duplicate occurances in given String : "+numberOfDuplicateWords);

        Set<Map.Entry<String,Integer>> entrySet = hMap.entrySet();

        for (Map.Entry<String,Integer> eachEntry:entrySet) {
            if(eachEntry.getValue()==Collections.max(hMap.values())){
                System.out.println("Maximum Repeated Word : "+eachEntry.getKey());
            }
        }

        for (Map.Entry<String,Integer> eachEntry:entrySet) {
            if(eachEntry.getValue()==Collections.max(hMap.values())){
                hMap.remove(eachEntry.getKey());
            }
        }

        for (Map.Entry<String,Integer> eachEntry:entrySet) {
            if(eachEntry.getValue()==Collections.max(hMap.values())){
                System.out.println("Second Maximum Repeated Word : "+eachEntry.getKey());
            }
        }




    }

}
