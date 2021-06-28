class Jenya extends People {

    Jenya(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("Играю в доту всю жизнь");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю 1 час в день");
    }

    @Override
    public void talk() {
        System.out.println("Хорошо тебе\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
