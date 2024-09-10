package suguestream;

public class CountLetterEachWordMain {
    public static void main(String[] args) {
        String str = "welcome in java or dbms";
        
        
        String[] words = str.split(" ");

        
        for (String word : words) {
            if (!word.isEmpty()) {
                
            	int c=word.length();
                

                
                System.out.println(c);
            }
        }
    }
}
