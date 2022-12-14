public class concatenation {
    public static void main(String[] args) {
        String word1="Hello";
        String word2=" my awesome group";

        String sentence=word1+word2;
        System.out.println(sentence);

        //another way to concatenate string

        word1 +="" + word2;
        System.out.println(word1);
    }
}
