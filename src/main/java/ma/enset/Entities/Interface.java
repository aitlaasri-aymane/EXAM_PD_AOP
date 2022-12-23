package ma.enset.Entities;

import ma.enset.Entities.Entity;
import ma.enset.method.Abstract;

import java.util.List;

public class Interface extends Entity {
    private List<Abstract> abstractMethods;

    public Interface(String name) {
        super(name);
    }
}
