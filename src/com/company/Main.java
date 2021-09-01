package com.company;

public class Main {

    public static void main(String[] args) {

        GreatestCommonDivisor.getGreatestCommonDivisor(10,20);
        GreatestCommonDivisor.getGreatestCommonDivisor(30,20);
        GreatestCommonDivisor.getGreatestCommonDivisor(80,20);

    }
    public static int sumDigits(int number){
        int sum = 0;

        if(number<10){
            return -1;
        }
        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            //extract the last-significant digit
            int digit = number % 10;
            sum += digit;
            //drop the least-significant digit
            number /= 10; //same as number = number / 10;
        }

        return sum;
    }

    public static boolean isEvenNumber(int number){
        if((number % 2 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public static void whileLoop(){
        int number =4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumberFound++;
            System.out.println("Even number "+number);
        }
        System.out.println("Total even numbers found = "+evenNumberFound);
    }
    public static boolean isOdd(int num){
        if(num > 0){
            if(num % 2 == 1){
                return true;
            }
        }
        return false;
    }

    public static boolean sumOdd(int start,int end){
        int sum = 0;

        for (int i = start;i<=end;i++){
            if(isOdd(i)){
                sum +=i;
            }
        }
        System.out.println("sum of odd numbers = "+sum);
        return true;
    }

    public static void isLoop(){
        for (int i=2;i<9;i++){
            System.out.println("10,000 at "+i+" % interest =");
        }
        System.out.println("**********************************");
        for (int i=8; i>=2;i--){
            System.out.println("10,000 at "+i+" % interest =");
        }

        int count = 0;
        for (int i=10;i<50;i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a prime number");
                if(count == 3){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for (int i=2;i<=n/2;i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }

    public static void printDayOfTheWeek(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a day");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }else{
            long milesPerHour = Math.round(kilometersPerHour / 1.60934);

            return milesPerHour;
        }
    }

    public static void printCoversion(double kilometersPerHour){



        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else{
            double milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= "+milesPerHour+ " mi/h");
        }


    }




}















