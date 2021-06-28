
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        People misha = new Misha("Миша", 12);
        People jenya = new Jenya("Женя", 22);
        People yura = new Yura("Юра", 19);
        List<People> peopleList = Arrays.asList(misha, jenya, yura);
        for (People people : peopleList) {
            System.out.println(people.toString());
            people.action();
            people.sleep();
            people.talk();
        }
    }
}
