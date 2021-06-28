class Yura extends People {

    Yura(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("Смотрю аниме");
    }

    @Override
    public void sleep() {
        System.out.println("Непонятный режим сна");
    }

    @Override
    public void talk() {
        System.out.println("Я отчисляюсь ЧЕСТНО ЧЕСТНО Я ОТЧИСЛЯЮСЬ\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
