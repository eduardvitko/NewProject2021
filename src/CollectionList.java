import java.util.ArrayList;

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
    }
}
