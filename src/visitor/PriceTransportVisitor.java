package visitor;

import activity.Animal;
import activity.Person;
import activity.Shipment;

public class PriceTransportVisitor implements Transport {
    @Override
    public void visit(Animal animal) {
        System.out.println(animal.getWeight() * 0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Price per kilometer for a person: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.println("Price shipment "
                + price + " PLN");
    }
}
