package suguestream;

public class FirstLastMain {
    public static void main(String[] args) {
        String str = "welcome in java or dbms";
        
        // Split the string into words
        String[] words = str.split(" ");

        // Iterate through each word
        for (String word : words) {
            if (!word.isEmpty()) {
                // Get the first and last letter of each word
                char firstLetter = word.charAt(0);
                char lastLetter = word.charAt(word.length() - 1);

                // Display the first and last letter
                System.out.println(firstLetter + " " + lastLetter);
            }
        }
    }
}
