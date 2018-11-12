package Ch9_Iterator.DinerMerged.Iterators;

import Ch9_Iterator.DinerMerged.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
