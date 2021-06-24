public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String newString1 = string1.trim();
        String newString2 = string2.trim();
        String newString = newString1.concat(newString2);
        return newString;
    }

    public Integer getIndexOrNull(String string, char z) {
        int index = string.indexOf(z, 0);
        if( index == -1) {
            return null;
        }
        return index;
    }

    public Integer getIndexOrNull(String string1, String string2) {
        int stringIndex = string1.indexOf(string2, 0);
        if( stringIndex == -1 ) {
            return null;
        }
        return stringIndex;
    }

    public String concatSubstring(String string1, int index1, int index2, String string2) {
        String subString = string1.substring(index1, index2);
        String newSubString = subString.concat(string2);
        return newSubString;
    }
}