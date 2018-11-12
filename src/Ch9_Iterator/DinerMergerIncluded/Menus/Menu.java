package Ch9_Iterator.DinerMergerIncluded.Menus;

import Ch9_Iterator.DinerMergerIncluded.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
