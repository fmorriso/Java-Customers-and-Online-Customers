public class OnlineCustomer extends Customer {
    private String email;

    public OnlineCustomer(String n, String a, String e) {
        super(n, a);
        email = e;
    }

    public String getEmail() {return email;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OnlineCustomer{")
                .append(super.toString())
                .append(", email='").append(email).append('\'')
                .append('}');
        return sb.toString();
    }
}
