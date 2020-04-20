package javaProgram;

import com.google.gson.internal.$Gson$Preconditions;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import org.testng.annotations.Test;

import java.util.Scanner;

public class CodeExecrises {

    String newGlobalStr;
    int newGlobalInt;

    public static boolean isLeapYear(int year){

        if((year > 0) && (year <= 9999)){
            if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else{
            int numberOfDays = 0;
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    if (isLeapYear(year))
                        numberOfDays = 29;
                    else
                        numberOfDays = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    numberOfDays = 30;
                    break;
            }
            return numberOfDays;
        }

    }


    @Test
    public void sayPrimeNumberOrNot(){

        int inputNumber = 21;

        if (inputNumber <= 1){
            System.out.println("Should not be prime number. Sorry.");
        }
        else{
            for (int i= 2; i< inputNumber; i++){
                if(inputNumber % i != 0){
                    System.out.println("Yes. You got it. Its is prime number. Hurray!!!");
                    break;
                }
                else{
                    System.out.println("Should not be prime number. Sorry.");
                    break;
                }
            }
        }

    }


    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 != 0){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        if(start <= end && start >= 0 && end >= 0){
            for (int i=start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }


    @Test
    public void loopCheck(){
        int n = 0;
        while (n < 15){
            n++;
            if(n <= 5){
                System.out.println("Skipping Number : " + n);
                continue;
            }
            System.out.println("Number : " + n);
            if(n >= 10){
                System.out.println("Breaking Number : " + n);
                break;
            }
        }
    }

    @Test
    public void sumOfDigits(){
        int inputNumber = 1234;
        int sumOfDigits = 0;

        if(inputNumber >= 10){
            while (inputNumber > 0){
                int lastNumber = inputNumber % 10;
                inputNumber = inputNumber / 10;
                sumOfDigits += lastNumber;
            }
            System.out.println("Sum of digits of given number is " + sumOfDigits);
        }
        else{
            System.out.println("Only one digit is present. So simple. Sum is " + inputNumber);
        }

    }

    @Test
    public static void isPalindrome(){
        int number = -222;
        number = Math.abs(number);
        int tempNumber = Math.abs(number);

        int reverseNumber = 0;

        while (tempNumber > 0) {
            reverseNumber = (reverseNumber * 10) + (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        System.out.println(number);
        System.out.println(reverseNumber);

        if (number == reverseNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }



    public static int sumFirstAndLastDigit(int number){

        int tempNum = number;
        int lastDigit = 0;
        int firstDigit = 0;
        int reverseNumber = 0;

        if(tempNum > 9){
            lastDigit = tempNum % 10;

            while(tempNum>0){
                int lastNumber = tempNum % 10;
                reverseNumber =  (reverseNumber * 10) + lastNumber;
                tempNum = tempNum / 10;
            }

            firstDigit = reverseNumber % 10;
            return (firstDigit + lastDigit);
        }
        else if(tempNum > 0 && tempNum <= 9){
            return tempNum;
        }
        else {
            return -1;
        }
    }

    @Test
    public int getEvenDigitSum(){

        int number = 9;
        int tempNum = number;
        int sumOfEvenNumbers = 0;

        if(tempNum >= 0){

            while(tempNum > 0){
                int lastDigit = tempNum % 10;
                if (lastDigit % 2 == 0){
                    sumOfEvenNumbers += lastDigit;
                }
                tempNum = tempNum / 10;
            }

            return sumOfEvenNumbers;
        }
        else {
            return -1;
        }

    }

    @Test
    public void testMethod(){


    }




}
