package ma.enset.Entities;

import ma.enset.method.Constructor;
import ma.enset.method.Method;

import java.util.List;

public class Record extends Entity {
    private List<Attribut> attributs;
    private List<Method> recordGetters;
    private Constructor recordConstructor;

    public Record(String name) {
        super(name);
    }
}
