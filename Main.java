import java.util.Iterator;
import java.util.LinkedList;

class Address {
    String name;
    String city;
    String state;

    public Address(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }
}
class Maillist implements Iterable<Address> {
    private LinkedList<Address> addresses = new LinkedList<>();

    public void add(Address address) {
        addresses.add(address);
    }

    @Override
    public Iterator<Address> iterator() {
        return addresses.iterator();
    }
}

public class Main {
    public static void main(String[] args) {
        Maillist mailList = new Maillist();
        mailList.add(new Address("John Doe", "New York", "NY"));
        mailList.add(new Address("Jane Smith", "Los Angeles", "CA"));
        mailList.add(new Address("Bob Johnson", "Chicago", "IL"));

        System.out.println("Contents of the Maillist:");
        for (Address address : mailList) {
            System.out.println("Name: " + address.name + ", City: " + address.city + ", State: " + address.state);
        }
    }
}