package java_week2_writing_hw;

/**
 * Write a java programme using the following steps.
 * 4.1) declare two instance variables and two static variables.
 * 4.2) declare one instance method
 * 4.3) declare one static method
 * 4.4) call all four instance and static variables into both instance and static methods inside the print statement
 * 4.5) declare the main method
 * 4.6) call both instance and static methods into the main method and ren the programme.
 */
public class Programme_4 {

    //4.1) declare two instance variables and two static variables.
    //instance variable
    String name = "Prime";
    String surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2) declare one instance method
    //4.4) call all four instance and static variables into both instance and static methods inside the print statement
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }

    //4.3) declare one static method
    //4.4) call all four instance and static variables into both instance and static methods inside the print statement
    public static void staticMethod() {
        Programme_4 programme4 = new Programme_4();
        System.out.println(programme4.name);
        System.out.println(programme4.surname);
        System.out.println(a);
        System.out.println(b);
    }

    //4.5) declare the main method
    //4.6) call both instance and static methods into the main method and ren the programme.
    public static void main(String[] args) {
        Programme_4 programme4 = new Programme_4();
        programme4.instanceMethod();
        staticMethod();
    }


}
