package ma.enset.annotation;

import ma.enset.Entity;

import java.util.List;

public class Annotation extends Entity {
    private List<Property> properties;

    public Annotation(String name) {
        super(name);
    }
}
