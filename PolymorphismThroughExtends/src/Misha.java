class Misha extends People {

    Misha(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("Смотрю тик-ток");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю 16 часов в день");
    }

    @Override
    public void talk() {
        System.out.println("ПО ПО ПО ЫР\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
