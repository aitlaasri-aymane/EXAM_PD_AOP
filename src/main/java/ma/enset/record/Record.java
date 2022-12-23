package ma.enset.record;

import ma.enset.Class.Attribut;
import ma.enset.Entity;

import java.util.List;

public class Record extends Entity {
    private List<Attribut> attributs;
    private List<RecordGetters> recordGetters;
    private RecordConstructor recordConstructor;

    public Record(String name) {
        super(name);
    }
}
