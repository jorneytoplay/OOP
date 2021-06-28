import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    MachineActions ship = new Ship();
    MachineActions car = new Car();
    MachineActions meteor = new Meteor();
    List<MachineActions> machineList = Arrays.asList(ship,car,meteor);
    for(MachineActions machine : machineList){
        System.out.println(machine.toString());
        machine.howMove();
        machine.weightDescription();
        System.out.println("\n");
    }
    }
}
