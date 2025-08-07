import java.util.*;

public class ForEachMethod {
    public static void main(String[] args) {
        
        List<String> gamesList = new ArrayList<>();

        gamesList.add("Cricket");
        gamesList.add("Kabaddi");
        gamesList.add("Volley Ball");
        gamesList.add("Running");

        //for Each method
        gamesList.forEach(g->System.out.println(g));
    }
}
