package Ch9_Iterator.DinerMerger.Iterators;

import Ch9_Iterator.DinerMerger.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        return position < items.size();
    }
}
