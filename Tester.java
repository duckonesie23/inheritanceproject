import java.util.*;
public class Tester {
    public static void main(String[]args){
        ArrayList<Food> menu = new ArrayList<Food>();

        Food f1 = new Food();
        Food f2 = new Sandwich();
        Food f3 = new BLT();
        Food f4 = new Food("Chicken Alfredo", 14.99,"Spaghetti","Chicken","White Sauce");
        Sandwich f5 = new Sandwich("Chicken Sandwich", 12.99,"White Bun","Chicken","Lettuce","Tomato",6);
        BLT f6 = new BLT(true);
        Food f7 = new Food("Caesar Salad",11.99,"Crouton","Lettuce","Tomato");
        f7.removeIngredient("Tomato");
        f7.addIngredient("Ranch Sauce");
        Sandwich f8 = new Sandwich("Italian Cut",13.99,"White Bread","Provolone","Prosciutto","Lettuce",12);
        f8.substituteBread("Baguette");
        BLT f9 = new BLT(true);
        f9.makeSymmetrical();
        BLT f10 = new BLT(false);
        f10.makeOpenSandwich();
        Food f11 = f4;
        Sandwich f12 = f8;
        BLT f13 = f9;
        Sandwich f14 = f10;

        
        menu.add(f1);
        menu.add(f2);
        menu.add(f3);
        menu.add(f4);
        menu.add(f5);
        menu.add(f6);
        menu.add(f7);
        menu.add(f8);
        menu.add(f9);
        menu.add(f10);
        menu.add(f12);
        menu.add(f13);
        menu.add(f14);

        for(int i = 0;i<menu.size();i++){
            System.out.println(menu.get(i));
        }
    }
}
