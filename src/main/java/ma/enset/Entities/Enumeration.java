package ma.enset.Entities;

import ma.enset.Entities.Entity;

import java.util.List;

public class Enumeration extends Entity {
    private List<String> values;

    public Enumeration(String name) {
        super(name);
    }
}
