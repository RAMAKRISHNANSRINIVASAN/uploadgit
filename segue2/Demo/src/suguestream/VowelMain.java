package suguestream;

public class VowelMain {
    public static void main(String[] args) {
        String str = "welcome in java";
        str = str + " "; // Adding a space at the end to handle the last segment

        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e') {
                c++;
            }

            // Check if the character is a space
            if (ch == ' ') {
                System.out.println(c); // Print the count of vowels
                c = 0; // Reset count for the next segment
            }
        }
    }
}

