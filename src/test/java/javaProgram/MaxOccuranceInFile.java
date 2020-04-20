package javaProgram;

import com.sun.corba.se.impl.interceptors.PICurrent;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MaxOccuranceInFile {

    private static final String INVALID_DATA = "Invalid Value";

    @Test
    public void learning(){
        int kd = 7;
        if (kd == 6);

        char ch = '\u0044';

        if (ch == 'D'){
            System.out.println("Its \'D\' !");
        }

        boolean isOk = true;

        if(isOk){
            System.out.println("Is ok");
        }

        /*String text = "geeg";

        StringBuilder stBuild = new StringBuilder(text);

        stBuild.reverse();

        System.out.println(stBuild.toString());*/



        /*String myString = "40";
        int myInt = 50;

        String myNewString = myString + myInt;


        System.out.println(myString+myInt);*/


        int n = 6;
        int m = 8;
        int k = 9;
        int j = 10;

        k++;
        System.out.println(k);
        ++k;
        System.out.println(k);
        System.out.println(n++);
        System.out.println(m--);
        System.out.println(++n);
        System.out.println(--m);

    }

    @Test
    public void testMehtod(){
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double myResultDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println(myResultDouble);

        double myRemainderDouble = myResultDouble % 40.00d;
        System.out.println(myRemainderDouble);

        boolean checkRemainder = (myRemainderDouble == 0) ? true : false;
        System.out.println(checkRemainder);

        if(!checkRemainder){
            System.out.println("Got Some Remainder");
        }

    }

    @Test
    public void codeBlock(){
        int successCase = callMehtod(12);
        System.out.println(successCase);

        int failedCase = callMehtod(9);
        System.out.println(failedCase);
    }

    protected int callMehtod(int input){
        if(input >10){
            return (input += 10);
        }

        return -1;

    }

    public void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position +
                " on the high score table");
    }

    public int calculateHighScorePosition(int playerScore){
        int returnInt;
        if(playerScore >= 1000){
            returnInt = 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){
            returnInt = 2;
        }
        else if(playerScore >= 100 && playerScore < 500){
            returnInt = 3;
        }
        else{
            returnInt = 4;
        }
        return returnInt;
    }

    @Test
    public void callMethods(){

        displayHighScorePosition("MyPlayer1",calculateHighScorePosition(1500));
        displayHighScorePosition("MyPlayer2",calculateHighScorePosition(900));
        displayHighScorePosition("MyPlayer3",calculateHighScorePosition(400));
        displayHighScorePosition("MyPlayer4",calculateHighScorePosition(50));


    }


    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour;

        if(kilometersPerHour >= 0){
            milesPerHour = Math.round(kilometersPerHour * 0.621371);
            return milesPerHour;
        }

        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +
                    milesPerHour +" mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }

    }

    @Test
    public void codeExercise(){
        System.out.println(toMilesPerHour(6.34d));

        System.out.println(toMilesPerHour(-45.56));

        printConversion(6.34d);
        printConversion(-1.344d);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0){
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    remainingKiloBytes + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        else{
            return false;
        }

    }

    @Test
    public void codeExercise2(){
        System.out.println(shouldWakeUp (false, 2));
    }

    public static boolean isLeapYear(int year){
        boolean isLeap;
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        isLeap = true;
                    }
                    else {
                        isLeap = false;
                    }
                }
                else{
                    isLeap = true;
                }
            }
            else {
                isLeap = false;
            }
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }


    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        int firstNumberafterConversion = (int) (firstNumber * 1000);
        int secondNumberafterConversion = (int) (secondNumber * 1000);

        if (firstNumberafterConversion == secondNumberafterConversion){
            return true;
        }
        else{
            return false;
        }

    }

    @Test
    public void codeExer3(){
        getDurationString(130,15);
        getDurationString((130*60)+15);

        System.out.println(isCatPlaying(false,45));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){

        if((firstNumber + secondNumber) == thirdNumber){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){

        if((firstNumber >=13 && firstNumber <=19) || (secondNumber >=13 && secondNumber <=19) ||
                (thirdNumber >=13 && thirdNumber <=19)){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean isTeen(int firstNumber){

        if((firstNumber >=13 && firstNumber <=19)){
            return true;
        }
        else{
            return false;
        }

    }

    public double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeter;
        if (feet >= 0 && inches >= 0 && inches <= 12){
            centimeter = ((feet * 12) + inches) * 2.54;
            return centimeter;
        }
        return -1;
    }

    public double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = inches / 12;
        }

        return -1;
    }



    public String getDurationString(int minutes, int seconds){   // 130 mins, 15 secs  = 2 hr 10 mins 15 secs

        int hour;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){

            hour = minutes / 60;
            minutes = minutes % 60;
            String expectedString = (hour + "h " + minutes + "m " + seconds);
            System.out.println(expectedString);

            return expectedString;

        }
        else{
            return "Invalid value";
        }

    }

    public String  getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes,seconds);
        }
        else{
            return "Invalid value";
        }
    }


    public static double area(double radius){
        double area;
        if (radius >= 0){
            area = Math.PI * radius * radius ;
            return area;
        }
        return -1.0;
    }

    public static double area(double x, double y){
        double area;
        if (x >= 0 && y >= 0){
            area = x * y;
            return area;
        }
        return -1.0;
    }

    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long minutesInYear = (365 * 24 * 60);

            long year = minutes / minutesInYear ;
            long remainingMinutes =  minutes % minutesInYear;
            long days = remainingMinutes / (24 * 60);

            System.out.println(minutes + " min = " + year + " y and " + days +" d");
        }
        else{
            System.out.println("");
        }

    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum){

        if(firstNum < 0 || secondNum < 0 || thirdNum < 0){
            System.out.println("Invalid Value");
        }
        else if(firstNum == secondNum  && firstNum == thirdNum){
            System.out.println("All numbers are equal");
        }
        else if(firstNum != secondNum && firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }

    }


    public static boolean isCatPlaying(boolean summer, int temperature){

        if(summer){
            if(temperature >= 25 && temperature <= 45){
                return true;
            }
            return false;
        }
        else{
            if(temperature >= 25 && temperature <= 35){
                return true;
            }
            return false;
        }

    }

    public static void printNumberInWord(int inputNumber){

        switch (inputNumber){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }


}
