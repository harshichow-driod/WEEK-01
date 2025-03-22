public class NullPointer {
    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handle() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Generating the exception without handling:");
        generate();
        System.out.println("\nNow demonstrating exception handling:");
        handle();
    }
}
