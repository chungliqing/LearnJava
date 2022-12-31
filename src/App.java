public class App {
    public static void main(String[] args) {
        primitiveTypes();
        
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
        /*  Primitive Types- for storing simple values
            Reference Types - for storing complex objects

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
}
