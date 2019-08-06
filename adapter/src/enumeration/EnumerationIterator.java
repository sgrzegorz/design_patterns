package enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration enum;

    public EnumerationIterator(Enumeration enum){
        this.enum = enum;
    }

    @Override
    public boolean hasNext() {
        return enum.hasMoreElemn
    }

    @Override
    public Object next() {
        return null;
    }
}
