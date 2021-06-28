import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Brand nike = new Nike();
        Brand adidas = new Adidas();
        List<Brand> brandList = Arrays.asList(nike,adidas);
        for(Brand s: brandList){
            System.out.println(nike.getClass());
            s.littleAboutMyself();
            System.out.println("Стоимость компании: "+s.price());
            String[] clothes = s.clothesList();
            System.out.println("Список актуальных вещей данного бренда:");
            for(int i=0; i<clothes.length;i++){
                System.out.println(clothes[i]);
            }
            System.out.println("\n");
        }
    }
}
