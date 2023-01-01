
import java.awt.*;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        loanCalculator1();
    }

    public static void variables(){
        int age = 30, temperature = 20; //kinda messy, better to separate
        age = 35; // change variable's value
        int herAge = age;
        System.out.println("Hello World!");
        System.out.println(age);
        System.out.println(herAge);
    }

    public static void primitiveTypes() {
        /*  Primitive Types- for storing simple values (int, bool, char)
            Reference Types - for storing complex objects (date, mail messages)

            Primitive Types- for storing simple values
                Type        Bytes       Range           Notes
                byte        1           [-128, 127]
                short       2           [-32k, 32k]
                int         4           [-2B, 2B]       no dec points
                long        8                           no dec points
                float       4
                double      8
                char        2           A, B, C, ...
                boolean     1           true/false
        */

        byte age = 30;
        //int viewsCount = 123_456_789; //can put underscores for better readability
        //int viewsCount = 3_123_456_789; too large for int type, so change to long type
        //long viewsCount = 3_123_456_789; compiler still sees the int value as int, so put L/                                  l at the back to indicate that its a long number
        long viewsCount = 3_123_456_789L;
        float price = 10.99F; //by default the compiler sees the dec # as a double
        char letter = 'A'; //char uses single quotes
        boolean isEligible = true; //blue colored words are reserved keywords
    }

    public static void referenceTypes(){
        /*  
            *Primitive Types    -   for storing simple values (int, bool, char)
                                -   memory/variables are auto allocated & released by Java Runtime Environment (JRE)
                                -   no members/members; but have code snippets (templates/code block) through dot op
                                        -   age.fori

            *Reference Types    -   for storing complex objects (date - ref classes/methods; mail messages)
                                -   memory has to be manually allocated, but JRE will auto release
                                -   'new' to manually allocate memory for reference type variables  
                                -   Objects/Classes have members/methods accessible through the dot operator
                                        -   now.getTime()
        */

        byte age = 30; //Primitive Type
        Date now = new Date(); //Reference Type
        System.out.println(now); //prints 'Sat Dec 31 20:06:18 MYT 2022'
        System.out.println(now.getTime()); //prints '1672488444157'

        /*
            *java.util/java.sql = packages;
                typing 'Date' and selecting 'java.util' auto imports the java.util.Date package
  
            *now becomes an instance/object of the Date() class; 
                class == template/blueprint for creating new objects/instances;
                an object is an instance of a class; object = class's instance
                
                Example:
                    *class == humans; --> instances of classes == objects like John, Mary, etc.
        */
    }

    public static void primitiveVsReferenceTypes() {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); //prints 1; x and y are in sep loc, with values d set independently

        Point point1 = new Point(1, 1);
        Point point2 = point1; 
        System.out.println(point2); //prints java.awt.Point[x=1,y=1]
        point1.x = 2;
        System.out.println(point2); //prints java.awt.Point[x=2,y=1]

        /*
            for primitive types -   the memory location holds the value independently
            for reference types -   Point point1 = new Point(1, 1);
                                    -   allocate a memory location (add: 100) to store point(1,1);
                                    -   allocate point1 to store/ref the location(100) of the point obj (1,1)
                                -   Point point2 = point1;
                                    -   allocate point2 to ref the location(100) of the point obj(1,1)
                                -   point1.x = 2;
                                    -   updates add:100 to store point(2,1);
         */
    }

    public static void strings() {
        /*
        
            Strings are immutable (cannot change) reference types;
                -   String message = new String("Hello World");
                
                * but there's a shorthand with string literals
                    -   String Message = "Hello World"; (string literal)

        */

        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!")); //prints true
        System.out.println(message.startsWith("!!")); //prints false
        System.out.println(message.length()); //prints 13
        System.out.println(message.indexOf("l")); //prints 2
        System.out.println(message.indexOf("sky")); //prints -1
        System.out.println(message.replace("!", "*")); //prints Hello World**
        System.out.println(message.toLowerCase()); //prints hello world!!
        System.out.println(message.toUpperCase()); //prints HELLO WORLD!!
        System.out.println(message.trim());

        /*
            * obj.endsWith()        -   sees if a string ends with something
            * obj.startsWith()      -   sees if a string starts with something
            * obj.length()          -   returns the number of characters in a string
            * obj.indexOf("char")   -   returns the index of the first occurence of the character
            * obj.replace(old, new) -   replace the old string with the new string; does not modify the actual string
            * obj.toLowerCase()     -   changes all characters in the string to lower case
            * obj.toUpperCase()     -   changes all characters in the string to upper case
            * obj.trim()            -   gets rid of whitespaces at the beginning and the end
         */
    }

    public static void escapeSequences() {
        String message = "Hello Mosh";
        String usingDoubleQuotes = "Hello \"Mosh\""; //prints Hello "Mosh"
        String usingBackSlash = "c:\\Windows\\..."; //prints c:\Windows\...
        String usingNewLine = "c:\nWindows\\...";
        String usingTab = "c:\tWindows\\..."; //prints c:   Windows\...

        System.out.println(message);
    }

    public static void arrays() {
        /*  
            Arrays:
                * Arrays have fixed size/length; cannot add or remove items
                * Creating Arrays:
                    1. Create new array by specifying the data type and specify [] for array for an arrayName
                        Then create a new instance of the data type's class while specifying the array's length
                    
                        int[] numbers = new int[5];
                    2. Initialize array variable with values 
                        int[] numbers = {2, 3, 5, 1, 4};
                * Default Values:
                    if int values are not set, the value is 0 by default; 
                    if bool values, false by default; 
                    if str, empty str by default;
                * Find Length of Array - arrayName.length
                    System.out.println(numbers.length); (return int length of array; Ex: 5)
                  
                Java Class: Arrays

                * Printing Arrays: - Arrays.toDatatype(arrayName)
                    By default, Java returns a string calculated based on the add of the obj in memory for direct printing of arrays. - System.out.println(numbers);

                    So, use Arrays class, and toDatatype method to print an array
                        -   System.out.println(Arrays.toString(numbers)); (return str rep of array's value)
                * Sort An Array - Ararys.sort(numbers);
                    System.out.println(Arrays.sort(numbers)); // returns [1, 2, 3, 4, 5]                
        */
    }

    public static void multiDimensionalArray() {
        /* 
            * single dimensional Array
                int[] numbers = new int[5];
            * 2 dimensional Array
                int[][] numbers = new int[2][3]; 2 rows 3 columns
                int[][] numbers = {{1, 2, 3}, {4, 5, 6}}
                numbers[0][0] = 1;
            * 3 dimensional Array
                int[][][] numbers = new int[2][3][5]; 2 rows 3 columns
            * Printing Multi-dimensional Arrays - Arrays.deepToDatatype(arrayName)
                Arrays.deepToString(numbers) = [[1, 0, 0], [0, 0, 0]]
        */
    }
    
    public static void constants() {
        float pi = 3.14F; 

        //once a final variable is initialized, the variable cannot be modified
        //By convention, use all capital letters to name constants.

        final float PI = 3.14F;  
    }

    public static void arithmeticExpressions() {
        /*
            * Arithmetic Operators    
                + - * / % = modulus = remainder of a division

            * Operands
                10, 3

            int div = 10/3; prints 3 bcoz division of 2 whole numbers is a whole number
            double result = (double)10 / (double)3; //casting or converting 10 and 3 to double - prints 3.33...

            * Increment Operator - ++x/x++
                int x = 1;
                x++; // x = 2
                
                x++
                    int x = 1;
                    int y = x++; - x is copied to y, then x will be incremented by 1
                    printing x = 2; printing y = 1;

                ++x
                    int x = 1;
                    int y = ++x; - x will be incremented by 1, then x is copied to y
                    prints x = 2; printing y = 2;

            * Augmented/Compound Assignment Operators
                +=, -=, *=, /=, %=
        */
    }

    public static void orderOfOperation() {
        int x = 10 + 3 * 2; // = 16
        
        /*
         * Order of Operators
            ()
            *\/
            +-
        */
    }

    public static void casting() {
        short x = 1;
        int y = x + 2;

        System.out.println(y); // 3

        /*
            * Implicit Casting/Automatic Casting/Conversion - happens when thrs no chance of data loss
                short x = 1;
                int y = x + 2;

                System.out.println(y); // 3

                * Any variables stored in a short variable can be stored in an interger variable, bcoz int in bigger, so this is converted auto with implicit casting
                * For int y = x + 2, Java looks at x which is 1, it allocates an anonymous int memory, and copies the value of x into the anonymous memory.
                * byte > short > int > long > float > double

                double x = 1.1;
                double y = x + 2;

                System.out.println(y); // 2.2

                * Java will store 2 as a double in an anonymous memory

            *Explicit Casting
                double x = 1.1;
                int y = (int)x + 2; convert x t0 int

                explicit casting like these are only possible for compatible types, string =/ to int

                * Explicit Casting for Non-Compatible Types - for User Inputs
                    Integer.parseInt("1") // takes a string and returns in the type specified
                    Short.parseShort()
                    Float.parseFloat()
                    Double.parseDouble()

                    String x = "1.1";
                    int y = Integer.parseInt(x) + 2;
         */
    }

    public static void mathClass() {
        /*  Math.java.lang class = already there, don't have to import
            * Math.round = round a floating point number to a whole number (long by default)
                Math.round(1.1F) = 1
            * Math.ceil = returns the smallest int that is >= to the number
                Math.ceil(1.1F) = 2
                int result = (int)Math.ceil(1.1F); //2
            * Math.floor = largest int that is <= to the number
                Math.floor(1.1F) = 1
                int result = (int)Math.floor(1.1F); //1
            * Math.max/min = returns the greater or least of 2 values
                int result = Math.max(1,2); = //2
                int result = Math.min(1,2); = //1
            * Math.random = generates a random value between 0 and 1 (double by default)
                double result = Math.random();          // 0-1
                double result = Math.random() * 100;    // 0-100, 99.11111111
                
                to obtain a random int
                    double result = Math.round(Math.random() * 100); //99.0
                    int result = (int)Math.round(Math.random() * 100); //42; explicit bcoz long cannot fit in int
                    int result = (int)(Math.random() * 100); // 24
                    int result = (int)Math.random() * 100; // returns 0 only, becoz the random 0-1 is casted only, losing the fraction, so wrap in parentheses
            * Math.pow
        */
    }

    public static void formattingNumbers() {
        /*
         * Abstract Class: NumberFormat, in java.text package; class for handling texts, dates, numbers, ...
            cannot use the new to create an instance of the class becoz Abstract
            has methods (factory methods, like a factory creating new objects) starting with 'get'; 
            calling the method creates an instance of the NumberFormat class and returns it to the object variable
            
            *Currency Format = NumberFormat.getCurrencyInstance()
            *Percentage Format = NumberFormat.getPercentInstance()
        */

        //Method 1
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String cResult = currency.format(1234567.891); //returns the str rep of this number in currency;
        System.out.println(cResult); //returns $1,234,567.89, 2 decimals places

        NumberFormat percent = NumberFormat.getPercentInstance();
        String pResult = percent.format(0.1);
        System.out.println(pResult); //10%

        //Method 2 = Method Chaining
        String chainingResult = NumberFormat.getPercentInstance().format(0.1); //10% 
    }

    public static void readingInput() {
        //Scanner class from the java.util package; import

        Scanner scanner = new Scanner(System.in); //System.in - read from the terminal window

        //in is a fill in the System class = fill like a variable defined in the variable class

        byte age = scanner.nextByte(); //receives only a byte
        System.out.println("You are " + age); //implicit casting, java auto cast age to a string

        //println adds a new line after the label
        //scanner.next = takes/reads in the first word/token only (Li Qing = Li)
        //scanner.nextLine = takes/reads in the whole line (Li Qing = Li Qing)
        //scanner.nextLine.trim() = removes whitespaces from the beginning or the end (   Li Qing   = Li Qing)
    }

    public static void loanCalculator1() {
        Scanner keyboardInput = new Scanner(System.in);
        final byte monthsInAYear = 12;
        final byte getDecimalPercentage = 100;

        System.out.print("Principal: ");
        double principalAmount = keyboardInput.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = keyboardInput.nextDouble();
        double monthlyInterest = (annualInterest/ getDecimalPercentage) / monthsInAYear;

        System.out.print("Period (Years): ");
        
        byte durationInYear = keyboardInput.nextByte();
        int paymentsToMake = durationInYear*monthsInAYear;

        double mortgageAmt =    principalAmount * 
                                (monthlyInterest*(Math.pow(1+monthlyInterest, paymentsToMake)))
                                /
                                (Math.pow(1+monthlyInterest,paymentsToMake)-1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgageAmt));
        keyboardInput.close();
    }
}
