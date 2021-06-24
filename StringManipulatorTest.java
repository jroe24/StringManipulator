public class StringManipulatorTest {
    public static void main(String[] args) {
        // trimAndConcat(String, String)
        StringManipulator sM = new StringManipulator();
        String str = sM.trimAndConcat("   Hello   ", "   World   ");
        System.out.println(str);

        // getIndexOrNull(String, char)
        char letter = 'o';
        Integer a = sM.getIndexOrNull("Coding", letter);
        Integer b = sM.getIndexOrNull("Hello World", letter);
        Integer c = sM.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        // getIndexorNull(String, String)
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = sM.getIndexOrNull(word, subString);
        Integer e = sM.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        // concatSubstring(String, int, int, String)
        String word1 = sM.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
    }
}