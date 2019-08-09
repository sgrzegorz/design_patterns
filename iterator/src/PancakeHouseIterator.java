import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) menuItems.get(position);
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }

    }
}
