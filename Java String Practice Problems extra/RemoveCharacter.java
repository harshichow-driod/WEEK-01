public class RemoveCharacter {

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';
        
        String modifiedString = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + modifiedString);
    }
}

