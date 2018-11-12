package Ch9_Iterator.Transitision;

import Ch9_Iterator.Transitision.Menus.DinerMenu;
import Ch9_Iterator.Transitision.Menus.Menu;
import Ch9_Iterator.Transitision.Menus.PancakeHouseMenu;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}

