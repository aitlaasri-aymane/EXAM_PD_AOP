package ma.enset.method;

import ma.enset.enums.Type;
import ma.enset.enums.Visibility;

import java.util.List;

public class Method {
    public Method(String name) {
        this.name = name;
    }

    private String name;
    private Type returnType;
    private List<Parameter> parameters;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }
}
