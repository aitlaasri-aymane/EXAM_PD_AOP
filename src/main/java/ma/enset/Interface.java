package ma.enset;

import ma.enset.method.Abstract;

import java.util.List;

public class Interface extends Entity{
    private List<Abstract> abstractMethods;

    public Interface(String name) {
        super(name);
    }
}
