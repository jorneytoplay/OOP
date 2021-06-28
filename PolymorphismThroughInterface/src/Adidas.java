public class Adidas implements Brand{
    @Override
    public int price() {
        return 10000000;
    }

    @Override
    public void littleAboutMyself() {
        System.out.println("Мы лучшие на рынке одежды мы Адидъос");
    }

    @Override
    public String[] clothesList() {
        String[] list = new String[]{"Yeezy","RareClothes","AdadasT-Shirt"};
        return list;
    }
}
