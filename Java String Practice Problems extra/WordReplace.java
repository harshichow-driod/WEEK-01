public class WordReplace {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is a programming language.";
        String oldWord = "programming";
        String newWord = "coding";

        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}
