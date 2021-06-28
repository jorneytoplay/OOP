class People {
    private String name;
    private int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void action() {
        System.out.println("Everyone people may do something");
    }

    public void sleep() {
        System.out.println("Everyone people may to sleep");
    }

    public void talk() {
        System.out.println("Everyone people may to talk\n");
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + " мне " + age + " лет";
    }
}
