import java.util.*;

public class RandomQuote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] text = {
            "Dream big and dare to fail.",
            "Stay hungry, stay foolish.",
            "First solve the problem, then write the code."
        };
        
        String[] author = {
            "Norman Vaughan",
            "Steve Jobs",
            "John Johnson"
        };

        while(true){
            int n = r.nextInt(text.length);
            System.out.println("\nQuote: " + text[n]);
            System.out.println("Author: " + author[n]);

           
            System.out.println("\n[ New Quote Button ]");
            System.out.print("Press y for new quote, n for exit: ");
            String choice = sc.nextLine();
            
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("App Closed");
    }
}