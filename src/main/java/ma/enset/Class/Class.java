package ma.enset.Class;

import ma.enset.Entity;
import ma.enset.method.Method;
import ma.enset.enums.Visibility;

import java.util.List;

public class Class extends Entity {
    public Class(String name) {
        super(name);
    }

    private boolean isAbstract;
    private boolean isFinal;
    private boolean isStatic;
    private Visibility visibility;
    private List<Attribut> attributs;
    private List<Method> methods;
    private List<Constructor> constructors;
}
