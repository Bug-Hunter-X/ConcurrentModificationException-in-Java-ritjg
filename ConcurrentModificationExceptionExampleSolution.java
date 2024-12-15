import java.util.*;
public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("B")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}