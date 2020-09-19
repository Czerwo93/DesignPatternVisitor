package activity;

import visitor.Transport;

public interface Transportable {
    void accept(Transport transport);
}
