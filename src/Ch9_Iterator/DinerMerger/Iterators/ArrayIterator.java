package Ch9_Iterator.DinerMerger.Iterators;

import Ch9_Iterator.DinerMerger.MenuItem;

public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
