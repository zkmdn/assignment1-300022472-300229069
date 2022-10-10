public class Address {
    private String name;
    private int number;
    private String postal;

    public Address(String name, int number, String postal){
        this.name = name;
        this.number = number;
        this.postal = postal;
    }

    public String toString(){
        return number + " " + name + ", " + postal;
    }
}
