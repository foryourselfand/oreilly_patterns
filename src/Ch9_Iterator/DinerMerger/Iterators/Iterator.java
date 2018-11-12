package Ch9_Iterator.DinerMerger.Iterators;

import Ch9_Iterator.DinerMerger.MenuItem;

public interface Iterator {
    boolean hasNext();

    MenuItem next();
}
