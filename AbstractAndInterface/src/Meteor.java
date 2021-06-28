public class Meteor extends CalculationOfCoefficient implements MachineActions{
    private int weight = 120000;
    @Override
    public void howMove() {
        System.out.println("Я лечу по космосу");
    }

    @Override
    public void weightDescription() {
        System.out.println(coefficient(weight));
    }

    @Override
    public String toString(){
       return "Я вообще метеорит, что я здесь делаю..." ;
    }
}
