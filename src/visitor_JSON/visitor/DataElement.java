package visitor_JSON.visitor;

import java.util.TreeMap;

public interface DataElement {
    public TreeMap accept(DataElementsVisitor visitor);
}
