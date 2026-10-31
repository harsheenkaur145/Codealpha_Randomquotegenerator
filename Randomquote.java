import java.util.*;
public class RandomQuote {
    public static void main(String[] args) {
        String[] quotes = {
            "Dream big and dare to fail.",
            "Code is like humor, when you have to explain it, it's bad.",
            "Java Project - CodeAlpha Task 2"
        };
        System.out.println(quotes[new Random().nextInt(quotes.length)]);
    }
}