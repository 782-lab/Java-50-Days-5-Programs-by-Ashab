class Day16_Program1_Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}
