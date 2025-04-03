public class Customer {

    private String name;
    private String address;

    public Customer(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Customer{")
            .append("name='").append(name).append('\'')
            .append(", address='").append(address).append('\'')
            .append('}');
        return sb.toString();
    }
}
