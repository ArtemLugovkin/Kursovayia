import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    String[] string = new String[] {"one", "two", "three", "one", "two", "three"};
    String[] result = new HashSet<String>(Arrays.asList(string)).toArray(new String[0]);
        System.out.print(Arrays.toString(result) + " ");

    }
}