
import java.awt.*;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        escapeSequences();
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
}
