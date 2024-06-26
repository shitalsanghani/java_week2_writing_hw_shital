package java_week2_writing_hw;

/**
 * Write a java programme using the following steps.
 * 1. Declare two instance variables.
 * 2. Declare one instance method.
 * 3. Call both instance variables into the instance method inside the print statement.
 * 4. Declare the Main method.
 * 5. Call the above instance method into the main method and run the programme.
 */
public class Programme_1 {
    //1. declare two instance variables.
    int a = 10;
    int b = 20;

    //2. Declare one instance method.
    //3. Call both instance variables into the instance method inside the print statement.
    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }
    //4. Declare the Main method.
    //5. Call the above instance method into the main method and run the programme.

    public static void main(String[] args) {
        Programme_1 programme1 = new Programme_1();
        programme1.instanceMethod();
    }
}
