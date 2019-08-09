package iterable;

import java.util.Hashtable;

public class CafeMenu {

    public CafeMenu() {
        initialized in the constructor.
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries”,
                true, 3.99);
        addItem("Soup of the day”,
                “A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem(“Burrito”,
                “A large burrito, with whole pinto beans, salsa, guacamole”,
                true, 4.29);
    }
    em
    Here’s where we create a new MenuIt ble.
    hta
    and add it to the menuItems has
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    the key is
    public Hashtable getItems() {
        return menuItems;
    }

    
}
