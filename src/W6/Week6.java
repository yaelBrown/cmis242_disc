// Recursive methods

package W6;

public class Week6 {
    public static String vowels = "aeiouy";

    private static String str = "Yael likes lemonade";

    // Used for iterative implementation
    public static String isVowel(String s, int idx) {
        boolean isVowel = true;
        String out = "";

        if (vowels.contains(String.valueOf(s.toLowerCase().charAt(idx)))) {
            isVowel = true;
            out += s.charAt(idx) + " at " + idx + " is a vowel!";
        } else {
            isVowel = false;
            out += s.charAt(idx) + " at " + idx + " is NOT a vowel!";
        }

        return out;
    }

    // inefficient and recursive way of checking for a vowel.
    public static String vowelRec(int outCode, String s, int idx) {
        int len = s.length();
        boolean isVowel = true;
        int oc = 0;
        String output = "";

        if (outCode == 1) {
            return "end";
        }

        if (idx < len) {
            if (vowels.contains(String.valueOf(s.toLowerCase().charAt(idx)))) {
                isVowel = true;
                System.out.println(s.charAt(idx) + " at " + idx + " is a vowel!");
            } else {
                isVowel = false;
                System.out.println(s.charAt(idx) + " at " + idx + " is NOT a vowel!");
            }
        } else {
            return "end";
        }

        try {
            if (String.valueOf(s.toLowerCase().charAt(idx+1)).isEmpty()) {
                oc = 1;

            } else {
                vowelRec(0, s, (idx + 1));
            }
        } catch (Exception e) {
//            System.out.println("Something went wrong. Prob idx out of bounds: " + e);
            System.out.println("End of string =)");
        }

        output += outCode;
        output += isVowel;

        return output;
    }

    // Method is used to determine if the next character is a vowel or not.
    public static void recursion(String s) {
        String ret = vowelRec(0, s, 0);
    }


    public static void main(String[] args) {
        System.out.println("str = " + str);

        // Using recursion
        recursion(str);

        // Using iteration
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(isVowel(str, i));
//        }
    }



}
