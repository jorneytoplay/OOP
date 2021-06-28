public class Nike implements Brand{
    @Override
    public int price() {
        return 5000000;
    }

    @Override
    public void littleAboutMyself() {
        System.out.println("Мы Нуйки и мы делаем лучшие кроссовки");
    }

    @Override
    public String[] clothesList() {
        String[] list = new String[]{"Airforce","KrutieSuppa","Chocolatki"};
        return list;
    }
}
