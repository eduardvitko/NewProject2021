import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rome");
        stringArrayList.add("Tokyo");
        stringArrayList.add("London");
        stringArrayList.add("Paris");
        for(String city: stringArrayList) {
            System.out.println(city);
        }
        Stream.of(10,20,30).forEach(System.out::println);
        Stream.of(5,20,30).forEach(System.out::println);
        Stream.of(15,247,30).forEach(System.out::println);
        Stream.of(555,247,630)
                .filter(x -> x < 575)
                .forEach(System.out::println);
    }
}
