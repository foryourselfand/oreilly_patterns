package Ch9_Iterator.DinerMergerIncluded;

import Ch9_Iterator.DinerMergerIncluded.Menus.Menu;
import Ch9_Iterator.DinerMergerIncluded.Menus.CafeMenu;
import Ch9_Iterator.DinerMergerIncluded.Menus.DinerMenu;
import Ch9_Iterator.DinerMergerIncluded.Menus.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
        waitress.printVegetarianMenu();

        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("Waitress says: ");
        if (waitress.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("Waitress says: ");
        if (waitress.isItemVegetarian("Waffles")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}