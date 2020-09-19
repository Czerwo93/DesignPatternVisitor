package visitor;

import activity.Animal;
import activity.Person;
import activity.Shipment;

public class NameTransportVisitor implements Transport {
    @Override
    public void visit(Animal animal) {
        System.out.println("Kind:" + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("First name and Last name:" + person.getFirstName() + " " + person.getLastName());

    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("prefix and serial number:" + shipment.getPrefix() + " " + shipment.getSerialNumber());
    }
}
