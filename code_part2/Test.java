public class Test {
    public static void main (String[] args){
        Employee newEmployee = new Employee("Faleao", 40, 15.50);
        Address kingAddy = new Address("King Edward", 800, "K1N6N5");
        Address queenAddy = new Address("Queen", 48, "K1P1N2");
        newEmployee.addAddress(kingAddy);
        newEmployee.addAddress(queenAddy);
        
    }

}