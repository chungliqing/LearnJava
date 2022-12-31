
import java.awt.*;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        primitiveVsReferenceTypes();
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
        System.out.println(point2);
        point1.x = 2;
        System.out.println(point2); 

        /*
            for primitive types -   the memory location holds the value independently
            for reference types -   Point point1 = new Point(1, 1);
                                    -   allocate a memory location (add: 100) to store point(1,1);
                                    -   allocate another memory to store/ref the location(100) of the point obj (1,1)
                                -   Point point2 = point1;
                                    -   allocate another memory to ref the location(100) of the point obj(1,1)
         */
    }
}
