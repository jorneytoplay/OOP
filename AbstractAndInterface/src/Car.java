public class Car extends CalculationOfCoefficient implements MachineActions{
    private int weight =  3;
    @Override
    public void howMove() {
        System.out.println("Еду по дороге");
    }

    @Override
    public void weightDescription() {
        System.out.println(coefficient(weight));
    }
    @Override
    public String toString(){
        return "Я маленькая машинка";
    }
}
