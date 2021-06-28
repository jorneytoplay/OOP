public class Ship extends CalculationOfCoefficient implements MachineActions{
    private int weight =  354666;
    @Override
    public void howMove() {
        System.out.println("Плыву по воде");
    }

    @Override
    public void weightDescription() {
        System.out.println(coefficient(weight));
    }
    @Override
    public String toString(){
        return "Я большой корабль";
    }
}
