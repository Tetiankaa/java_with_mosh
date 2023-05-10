package com.example.java_with_mosh;

import jdk.jfr.DataAmount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class JavaWithMoshApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWithMoshApplication.class, args);

        // *****************TYPES************************
//      // variables - we use to store data in a computers memory
        // constant - whose value cannot be changed once it has been initialized.

        //primitive types - for storing simple values(byte -128,127; short -32K,32K; int -2B,2B; long more than 2B, float,double 10.2; char'A';boolean true-false)
//        The main difference between  float and double is their size and precision.
//
//        float is a 32-bit single-precision floating-point number. It has a range of approximately 1.4E-45 to 3.4E+38 and a precision of about 7 decimal digits.
//
//        double is a 64-bit double-precision floating-point number. It has a range of approximately 4.9E-324 to 1.8E+308 and a precision of about 15-16 decimal digits.

//         byte b = 55;
//         int i = 3_555_655; // _ like comma in real life
//        long l = 3_555_999_555L;
//        short s = -30000;
//        float f = 4.6F;
//        double d = 5.5;
//        boolean boo =true;
//        char c = 'D';

        // reference - for storing complex objects(date, mail message)

//        Date date = new Date(); // new - for allocate memory for this variable
//        System.out.println(date);

        //strings
//       String message = "   hello  ";
//        System.out.println(message);
//        System.out.println(message.trim());// will delete all spaces before and after world

        // System.out.println(message.replace("l","i"));// 'l' will replace by 'i'
        //  System.out.println(message); //the output is 'hello'. Modifier String will always return a new string object. In java strings are immutable, they can not be change.

        //escape sequences
//        String name = "Hello \"Tanya\""; // it will include the double quotes to our variable
//        String message = "c:\\Windows\\..."; // the output is: c:\Windows\...
//        String message2 = "c:\tWindow\\..."; // like TAB - \t
//        String message3 = "c:\nWindow\\..."; // next line - \n
//        System.out.println(message3);

//        int[] numbers = {20,6,7,9,2};
//        System.out.println(numbers.length); // 5
//        Arrays.sort(numbers); //output: [2, 6, 7, 9, 20]
//        System.out.println(Arrays.toString(numbers));

        // arrays
//        int[] numbers2 =new  int[2];
//        numbers2[0] = 1;
//        numbers2[1] = 9;
//
//       //multidimensional array
//        int[][] numbers3 = new int[2][3];//2 rows and 3 columns
//        numbers3[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers3)); //output: [[1, 0, 0], [0, 0, 0]]
//
//        int[][] numbers4 = {{1,3,4},{9,10,85}}; // one more possibility to create a multidimensional array
//        System.out.println(Arrays.deepToString(numbers4));

        //constants
        //Constants are declared using the final keyword.It is a common practice to use uppercase letters for the names of constants
//        final float PI = 3.14F; // final - declared once and can not change anymore .

        // arithmetic expressions
//        double result = (double) 10 /(double) 3;
//        System.out.println(result);// the output: 3.3333333333333335

//        int x = 1;
//        int y = x++; // 2 and 1. Because firstly we assigned value to y variable and then increment by 1
//        int y = ++x; // 2 and 2. Because firstly we increment by 1, and then the result assigned to x and y.
//        System.out.println("x:"+x);
//        System.out.println("y:"+y);

//        int q = 3;
//        q +=1; // equals to q=q+1
//        System.out.println(q); // 4

        //order of operations
        // () (parenthesis) - 1
        // * and / (multiplication and division) - 2
        // + and - (plus and minus) -3

//        int x = 1+2*5; //11
//        int x = (1+2)*5; // 15
//        System.out.println(x);

        //casting
        //In Java, casting refers to the process of converting one data type to another.
        // There are two types of casting: implicit casting (widening) and explicit casting (narrowing).

        //implicit casting (large to small)
//        int d = 1;
//        double i = d +2.1; //3.1
//
//        //explicit casting (small to large)
//        double d1 =1.1;
//        int i1 = (int) d1+2; //3
//
//        //converting string to number
//        String x = "1";
//        int num = Integer.parseInt(x) + 1; //2
//
//        //converting string to double
//        String y = "2";
//        double doub = Double.parseDouble(y) + 2.3; //4.3

        //the math class
//        int result = Math.round(2.2F); //2
//        int result = (int) Math.floor(1.1F); // 1: this is largest int that is smaller or equal to declared number
//        int result = (int) Math.ceil(10.1F); // 11: that is greater than or equal to the argument and is equal to a mathematical integer
//        int result = Math.max(100,5); // 100
//        int result = Math.min(100,5); // 5
//        double result = Math.random();// Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
//        double result = Math.random()*200; // we get random number between 0 and 200
//        double result = Math.round(Math.random()*50);// if we dont want digits after the decimal point we can cast that number
//        int result = (int) Math.round(Math.random()*60);// usually Math medot returns long, so if we want to return an integer we need to store it to 'int'
//        int result = (int) (Math.random() * 20);// without parentheses the result always will be 0
//
        //formatting numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891); //$1,234,567.89

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.3); //30%

        //reading input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Your name is ");
//        String name = scanner.nextLine().trim(); //nextLine - get the entire line that the user enters, no matter how many spaces or tabs. trim() - deleted all spaces or tabs that the user enters
//        System.out.println("name " + name);

        // Mortgage calculator
        //Here is my implementation of mortgage calculator
//        final int MONTH_OF_YEAR = 12; //constant
//        final int PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in); //scanner object
//
//        System.out.print("Principal:"); // here we has the 1st question Principle
//        int principal = scanner.nextInt(); // we read the answear as an integer
//
//        System.out.print("Annual interest rate:");
//        float annual = scanner.nextFloat();
//        float monthlyRate = annual/PERCENT/MONTH_OF_YEAR; // calculate the monthly interest
//
//        System.out.print("period(years):"); // next we get the period
//        int years = scanner.nextInt();
//        int monthAll = years*MONTH_OF_YEAR; //calculate number of payments
//
//        double mortgage = principal // we get the principal, multiply by this expression and divided by this expression
//                * (monthlyRate*Math.pow(1+monthlyRate,monthAll))
//                / (Math.pow(1+monthlyRate,monthAll)-1);
//
//        String result = NumberFormat.getCurrencyInstance().format(mortgage);
//        //finally after calculate the mortgage we use the NumberFormat class to format this value as a currency
//        //we get the result and store it in this string and print it over here
//        System.out.println("Mortgage is " + result);

        //***********************CONTROL FLOW**********************************

        //comparison operations - are used to compare the values of two variables or expressions.
        // Can only be used with primitive types (such as int, double, boolean, etc.) and not with objects (equals()).

//       int x = 1;
//       int y = 1;
//        System.out.println(x == y); // true
//        System.out.println(x!=y);//false
//        System.out.println(x>y); //false
//        System.out.println(x<y);//false
//        System.out.println(x<=y);//true
//        System.out.println(x>=y);//true

        //logical operators - are used to combine one or more conditions.(1. && (Logical AND);2.|| (Logical OR);3.! (Logical NOT))

        //&& (Logical AND): It returns true only if both conditions it combines are true.
//        int temperature = 22;
//        boolean isWarm = temperature >20 && temperature<30;
//        //|| (Logical OR): It returns true if at least one of the conditions it combines is true.
//        boolean a = true;
//        boolean b = false;
//        boolean result = a || b;
//        //! (Logical NOT): It returns the opposite value of the condition it is applied to.
//        boolean c = true;
//        boolean result2 = !c;

        //if statements

//        int temp = 32;
//        if (temp>30){ //  if class
//            System.out.println("It is a hot day");
//        } else if (temp>20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("It is a cold day");

        //simplifying if statements
//        int income = 110_000;
//        boolean hasHighIncome = false;
//        if (income>100_000){
//             hasHighIncome = true;
//        }
//        //it is the same as
//        int income = 110_000;
//        boolean hasHighIncome = (income>100_000);

        //the ternary operator - is a shorthand way of writing an if-else statement that returns a value

//        int income = 120_000;
//        String className = income>100_000 ? "First class" : "Economy class";

        //switch statements - is a type of selection control mechanism that allows a block of code to be executed based on the value of a variable or expression
//        String role = "admin";
//
//        switch (role){
//            case "admin":
//                System.out.println("you are an admin");
//                break;;
//            case "moderator":
//                System.out.println("you are a moderator");
//                break;
//            case "quest":
//                System.out.println("you are a quest");
//        }

        // EXERCISE FizzBuzz

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Type the number: ");
//        int number = scanner.nextInt();

//        if (number%5==0 && number%3==0)
//            System.out.println("FizzBuzz");
//        else if (number%5==0)
//            System.out.println("Fizz");
//        else if (number%3==0)
//            System.out.println("Buzz");
//        else System.out.println(number);

        //2nd possibility
//        if (number%5==0){
//            if (number%3==0){
//                System.out.println("FizzBuzz");
//            }else System.out.println("Fizz");
//        } else if (number%3==0) {
//            System.out.println("Buzz");
//        }else System.out.println(number);

        //for loops - is a control statement that allows you to execute a block of code repeatedly based on a loop counter or index
//        int[] numbers = {5,9,3,7};
//        for (int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
        //the loop counter i is initialized to 0, and the loop continues to execute as long as i is less than the length of the numbers array.
        // The loop counter i is incremented by 1 after each iteration of the loop, and the value of numbers[i] is printed to the console.

        //while loops - is a control flow statement that allows you to execute a block of code repeatedly as long as a certain condition is true.
//        int a = 1;
//        while (a<5){
//            System.out.println(a);
//            a++;
//        }

//        Scanner scanner = new Scanner(System.in); // scanner object
//        String input = "";
//
//        while (!input.equals("quit")){
//            System.out.println("Input:");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

        //do while loops - the condition is checked at the end of the loop rather than at the beginning.
        // This means that the body of the loop will be executed at least once, even if the condition is false

//       Scanner scanner = new Scanner(System.in);
//       String input = "";
//
//       do {
//           System.out.println("Input:");
//           input = scanner.next().toLowerCase();
//           System.out.println(input);
//
//       }while (!input.equals("quit"));

        //break and continue statements

        //The break statement is used to terminate the current loop and transfer control to the statement following the loop
        //The continue statement is used to skip the current iteration of the loop and move on to the next iteration.
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//
//        while (true){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        //for-each loop

//        String[] fruits = {"Mango","Banana","Apple"};
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        //EXERCISE: MORTGAGE CALCULATOR

//        final int MONTH_OF_YEAR = 12;
//        final int PERCENT = 100;
//        int principal = 0;
//        double monthlyInterest = 0;
//        int allMonth = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Principal (1K-1M)");
//             principal = scanner.nextInt();
//             if (principal>1000 && principal<1_000_000) {
//                 break;
//             }
//            System.out.println("Write the value between 1.000 and 1.000.000");
//        }
//        while (true) {
//            System.out.println("Annual interest rate:");
//            double annualInterest = scanner.nextDouble();
//            if (annualInterest>0 && annualInterest<30) {
//                 monthlyInterest = annualInterest / PERCENT / MONTH_OF_YEAR;
//                break;
//            }
//            System.out.println("Write the value between 0 and 30");
//        }
//        while (true) {
//            System.out.println("Years:");
//            int years = scanner.nextInt();
//            if (years>0 && years<=30) {
//                allMonth = years * MONTH_OF_YEAR;
//                break;
//            }
//            System.out.println("Wrong year! Please write min 0 and max 30 years");
//        }
//        double mortgage = principal
//                * (monthlyInterest*(Math.pow(1+monthlyInterest,allMonth)))
//                / (Math.pow(1+monthlyInterest,allMonth)-1);
//
//        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage is "+currency);

        //***************************CLEAN CODING**************************

        //creating methods - is a block of code that performs a specific task. It is a set of instructions that can be called and executed when needed.
        // Methods help to organize code into logical blocks and make code reusable.

//      String user =  greetUser("tania"); // here this method that I have created is called

      //this will call outside main class, in JavaWithMoshApplication. I just put it this for information :)
//        public static String greetUser(String name){
//            return "Hello" + name;
//        }

        //1.0 refactoring - is the process of restructuring and improving the design of an existing codebase, without changing its behavior.
        // It is done to make the code more readable, maintainable, and efficient.

        //extracting methods - This technique involves breaking down a large method into smaller methods, each of which performs a specific task
        //Now I`m going to refactor Mortgage calculator that I`ve declared before

//        int principal = 0;
//        double annualInterest = 0;
//        int years = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Principal (1K-1M)");
//             principal = scanner.nextInt();
//             if (principal>1000 && principal<1_000_000) {
//                 break;
//             }
//            System.out.println("Write the value between 1.000 and 1.000.000");
//        }
//        while (true) {
//            System.out.println("Annual interest rate:");
//             annualInterest = scanner.nextDouble();
//            if (annualInterest>0 && annualInterest<30)
//                break;
//
//            System.out.println("Write the value between 0 and 30");
//        }
//        while (true) {
//            System.out.println("Years:");
//             years = scanner.nextInt();
//            if (years>0 && years<=30)
//                break;
//            System.out.println("Wrong year! Please write min 0 or max 30 years");
//        }
//       double mortgage=calculateMortgage(principal,annualInterest,years);
//
//        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage is "+currency);

        //refactoring repetitive patterns 2.0
//        int principal = 0;
//        double annualInterest = 0;
//        int years = 0;
//
//        principal=(int)readNumber("Principal (1K-1M)",1000,1_000_000);
//        annualInterest=readNumber("Annual interest rate:",0,30);
//        years = (int)readNumber("Years:",0,30);
//
//       double mortgage=calculateMortgage(principal,annualInterest,years);
//
//        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage is "+currency);

        //PROJECT PAYMENT SCHEDULE 3.0

//        int principal = 0;
//        double annualInterest =0;
//        int years = 0;
//        final int MONTH_OF_YEAR = 12;
//
//        principal=(int)readNumber("Principal:",1000,1_000_000);
//        annualInterest=readNumber("Annual Interest Rate:",0.1,30);
//        years = (int)readNumber("Period(years):",1,30);
//
//         double mortgage = calculateMortgage(principal,annualInterest,years);
//
//        String currency = NumberFormat.getNumberInstance().format(mortgage);
//
//        System.out.println("MORTGAGE");
//        System.out.println("-------");
//        System.out.println("Monthly payment: "+currency);
//        printPaymentSchedule(principal, annualInterest, years, MONTH_OF_YEAR); // extract method -make your code more organized and easier to read.

        //DEBUGGING AND PACKAGING APPLICATIONS
        //types of errors
        //there are three main types of errors:
        //1. Syntax Errors: These errors occur when the programmer writes incorrect syntax in their code.
        //2. Runtime Errors: Also known as exceptions, these errors occur during program execution.(dividing by zero, accessing an invalid index in an array, or trying to read from a null reference.
        //3. Logical Errors: These errors occur when the code runs without throwing any exceptions, but the output or behavior of the program is not what was intended by the programmer.

        //packaging java applications
        System.out.println("hello world");

       }


//    private static void printPaymentSchedule(int principal, double annualInterest, int years, int MONTH_OF_YEAR) {
//        System.out.println("PAYMENT SCHEDULE");
//        System.out.println("-------------");
//
//        for (double month = 1; month<= years * MONTH_OF_YEAR; month++){
//           double balance = calculateBalance(principal, annualInterest, years,(int) month);
//           String currency1=NumberFormat.getNumberInstance().format(balance);
//            System.out.println(currency1);
//        }
//    }
    //IT IS FROM PROJECT PAYMENT SCHEDULE 3.0
//        public static double calculateBalance(int principal,double annualInterest,int years,int payedMonth){
//            final int MONTH_OF_YEAR = 12;
//            final int PERCENT = 100;
//
//            double monthlyInterest = annualInterest/PERCENT/MONTH_OF_YEAR;
//            int allMonth = years*MONTH_OF_YEAR;
//
//            double loanBalance = principal
//                    *(Math.pow(1+monthlyInterest,allMonth) -(Math.pow(1+monthlyInterest,payedMonth)))
//                    / (Math.pow(1+monthlyInterest,allMonth)-1);
//            return loanBalance;
//        }
//
//        public static double calculateMortgage(int principal,double annualInterest,int years){
//            final int MONTH_OF_YEAR = 12;
//            final int PERCENT = 100;
//
//            double monthlyInterest = annualInterest/PERCENT/MONTH_OF_YEAR;
//            int allMonth = years*MONTH_OF_YEAR;
//
//            double mortgage = principal
//                * (monthlyInterest*(Math.pow(1+monthlyInterest,allMonth)))
//                / (Math.pow(1+monthlyInterest,allMonth)-1);
//
//            return mortgage;
//        }
//
//
//    public static double readNumber(String prompt,double min, double max){
//            Scanner scanner = new Scanner(System.in);
//            double value;
//
//            while (true){
//                System.out.println(prompt);
//                value = scanner.nextFloat();
//                if (value>=min && value<=max)
//                    break;
//                System.out.println("Write the value between "+min +"and " +max);
//            }
//            return value;
//        }

//      IT IS FROM REFACTORING 1.0
//    public static double calculateMortgage(int principal,double annualInterest,int years){
//        final int MONTH_OF_YEAR = 12;
//        final int PERCENT = 100;
//
//        double monthlyInterest = annualInterest / PERCENT / MONTH_OF_YEAR;
//        int allMonth = years * MONTH_OF_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest*(Math.pow(1+monthlyInterest,allMonth)))
//                / (Math.pow(1+monthlyInterest,allMonth)-1);
//        return mortgage;
//    }

    //REFACTORING REPETITIVE PATTERNS 2.0

//    public static double readNumber(String prompt, double min, double max) {
//        Scanner scanner = new Scanner(System.in);
//        double value;
//
//        while (true) {
//            System.out.println(prompt);
//            value = scanner.nextFloat();
//            if (value >= min && value <= max)
//                break;
//            System.out.println("Write the value between " + min + "and " + max);
//        }
//        return value;
//
//    }
}
