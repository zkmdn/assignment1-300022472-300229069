public class Employee {
    private String name;
    private int hours;
    private double rate;
    private Address[] address;

    public Employee(String name, int hours, double rate){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        address = new Address[6];
    }

    public void addAddress(Address addy){
        int count = 0;
        while (count < 6){
            if (address[count] == null){
                address[count] = addy;
                break;
            }else{
                count += 1;
            }
        if (count >= 6){
            System.out.println("Address book is full.") ;
        }
        }
    }
    private String getAddresses(){
        String newstr = "";
        for(int i=0; i < 6; i++){
            newstr = newstr + address[i].toString() + "\n";
        }
        return newstr;
    }
    public String toString(){
        return "Employee name: " + name + "\n"
        + "Weekly Hours: " + hours + "\n"
        + "Hourly Rate: $" + rate + "\n"
        + "Addresses: " + getAddresses();
    }
}
